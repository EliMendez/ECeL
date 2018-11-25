package edu.ues.ECeL.models.dao.clinica.cita;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.cita.Cita;


@Repository
public class CitaDaoImpl implements CitaDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Cita cita) {
        em.persist(cita);
    }

    @Override
    @Transactional
    public void update(Cita cita) {
        em.merge(cita);
    }

    @Override
    @Transactional
    public void delete(Integer codigoCita) {
    	Cita cita = em.find(Cita.class, codigoCita);
        if (cita != null) {
            em.remove(cita);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Cita read(Integer codigoCita) {
        return em.find(Cita.class, codigoCita);
    }

}
