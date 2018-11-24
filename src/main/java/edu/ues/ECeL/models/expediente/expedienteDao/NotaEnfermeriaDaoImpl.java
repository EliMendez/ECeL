package edu.ues.ECeL.models.expediente.expedienteDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.expediente.HistoriaClinica;

@Repository
public class NotaEnfermeriaDaoImpl implements HistoriaClinicaDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(HistoriaClinica historiaClinica) {
        em.persist(historiaClinica);
    }

    @Override
    @Transactional
    public void update(HistoriaClinica historiaClinica) {
        em.merge(historiaClinica);
    }

    @Override
    @Transactional
    public void delete(Integer codigoHistoria) {
    	HistoriaClinica historiaClinica = em.find(HistoriaClinica.class, codigoHistoria);
        if (historiaClinica != null) {
            em.remove(historiaClinica);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public HistoriaClinica read(Integer codigoHistoria) {
        return em.find(HistoriaClinica.class, codigoHistoria);
    }

}