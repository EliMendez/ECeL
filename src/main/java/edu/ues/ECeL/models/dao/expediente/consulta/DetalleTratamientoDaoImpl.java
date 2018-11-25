package edu.ues.ECeL.models.dao.expediente.consulta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.expediente.consulta.DetalleTratamiento;

@Repository
public class DetalleTratamientoDaoImpl implements DetalleTratamientoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(DetalleTratamiento detalleTratamiento) {
        em.persist(detalleTratamiento);
    }

    @Override
    @Transactional
    public void update(DetalleTratamiento detalleTratamiento) {
        em.merge(detalleTratamiento);
    }

    @Override
    @Transactional
    public void delete(Integer codigoDetalleTratamiento) {
    	DetalleTratamiento detalleTratamiento = em.find(DetalleTratamiento.class, codigoDetalleTratamiento);
        if (detalleTratamiento != null) {
            em.remove(detalleTratamiento);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleTratamiento read(Integer codigoDetalleTratamiento) {
        return em.find(DetalleTratamiento.class, codigoDetalleTratamiento);
    }

}