package edu.ues.ECeL.models.dao.clinica.personal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.personal.Clinica;

@Repository
public class ClinicaDaoImpl implements ClinicaDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Clinica clinica) {
        em.persist(clinica);
    }

    @Override
    @Transactional
    public void update(Clinica clinica) {
        em.merge(clinica);
    }

    @Override
    @Transactional
    public void delete(Integer codigoClinica) {
    	Clinica clinica = em.find(Clinica.class, codigoClinica);
        if (clinica != null) {
            em.remove(clinica);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Clinica read(Integer codigoClinica) {
        return em.find(Clinica.class, codigoClinica);
    }

}