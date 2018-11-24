package edu.ues.ECeL.models.expediente.consultaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.consulta.Enfermedad;

@Repository
public class EnfermedadDaoImpl implements EnfermedadDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Enfermedad enfermedad) {
        em.persist(enfermedad);
    }

    @Override
    @Transactional
    public void update(Enfermedad enfermedad) {
        em.merge(enfermedad);
    }

    @Override
    @Transactional
    public void delete(Integer codigoEnfermedad) {
    	Enfermedad enfermedad = em.find(Enfermedad.class, codigoEnfermedad);
        if (enfermedad != null) {
            em.remove(enfermedad);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Enfermedad read(Integer codigoEnfermedad) {
        return em.find(Enfermedad.class, codigoEnfermedad);
    }

}