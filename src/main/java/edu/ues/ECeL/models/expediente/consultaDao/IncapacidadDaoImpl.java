package edu.ues.ECeL.models.expediente.consultaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.consulta.Incapacidad;

@Repository
public class IncapacidadDaoImpl implements IncapacidadDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Incapacidad incapacidad) {
        em.persist(incapacidad);
    }

    @Override
    @Transactional
    public void update(Incapacidad incapacidad) {
        em.merge(incapacidad);
    }

    @Override
    @Transactional
    public void delete(Integer codigoIncapacidad) {
    	Incapacidad incapacidad = em.find(Incapacidad.class, codigoIncapacidad);
        if (incapacidad != null) {
            em.remove(incapacidad);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Incapacidad read(Integer codigoIncapacidad) {
        return em.find(Incapacidad.class, codigoIncapacidad);
    }

}