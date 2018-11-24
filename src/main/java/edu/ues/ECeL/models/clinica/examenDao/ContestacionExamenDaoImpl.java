package edu.ues.ECeL.models.clinica.examenDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.examen.ContestacionExamen;

@Repository
public class ContestacionExamenDaoImpl implements ContestacionExamenDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(ContestacionExamen contestacionExamen) {
        em.persist(contestacionExamen);
    }

    @Override
    @Transactional
    public void update(ContestacionExamen contestacionExamen) {
        em.merge(contestacionExamen);
    }

    @Override
    @Transactional
    public void delete(Integer codigoContestacion) {
    	ContestacionExamen contestacionExamen = em.find(ContestacionExamen.class, codigoContestacion);
        if (contestacionExamen != null) {
            em.remove(contestacionExamen);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public ContestacionExamen read(Integer codigoContestacion) {
        return em.find(ContestacionExamen.class, codigoContestacion);
    }

}
