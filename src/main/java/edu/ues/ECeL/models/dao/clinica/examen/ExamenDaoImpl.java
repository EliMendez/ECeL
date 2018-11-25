package edu.ues.ECeL.models.dao.clinica.examen;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.examen.Examen;

@Repository
public class ExamenDaoImpl implements ExamenDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Examen examen) {
        em.persist(examen);
    }

    @Override
    @Transactional
    public void update(Examen examen) {
        em.merge(examen);
    }

    @Override
    @Transactional
    public void delete(Integer codigoExamen) {
    	Examen examen = em.find(Examen.class, codigoExamen);
        if (examen != null) {
            em.remove(examen);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Examen read(Integer codigoExamen) {
        return em.find(Examen.class, codigoExamen);
    }

}