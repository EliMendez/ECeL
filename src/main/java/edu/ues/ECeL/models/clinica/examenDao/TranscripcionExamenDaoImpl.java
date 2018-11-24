package edu.ues.ECeL.models.clinica.examenDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.examen.TranscripcionExamen;

@Repository
public class TranscripcionExamenDaoImpl implements TranscripcionExamenDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(TranscripcionExamen transcripcionExamen) {
        em.persist(transcripcionExamen);
    }

    @Override
    @Transactional
    public void update(TranscripcionExamen transcripcionExamen) {
        em.merge(transcripcionExamen);
    }

    @Override
    @Transactional
    public void delete(Integer codigoTranscripcion) {
    	TranscripcionExamen transcripcionExamen = em.find(TranscripcionExamen.class, codigoTranscripcion);
        if (transcripcionExamen != null) {
            em.remove(transcripcionExamen);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public TranscripcionExamen read(Integer codigoTranscripcion) {
        return em.find(TranscripcionExamen.class, codigoTranscripcion);
    }

}