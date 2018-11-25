package edu.ues.ECeL.models.dao.expediente.consulta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.expediente.consulta.Clasificacion;

@Repository
public class ClasificacionDaoImpl implements ClasificacionDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Clasificacion clasificacion) {
        em.persist(clasificacion);
    }

    @Override
    @Transactional
    public void update(Clasificacion clasificacion) {
        em.merge(clasificacion);
    }

    @Override
    @Transactional
    public void delete(Integer codigoClasificacion) {
    	Clasificacion clasificacion = em.find(Clasificacion.class, codigoClasificacion);
        if (clasificacion != null) {
            em.remove(clasificacion);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Clasificacion read(Integer codigoClasificacion) {
        return em.find(Clasificacion.class, codigoClasificacion);
    }

}