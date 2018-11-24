package edu.ues.ECeL.models.clinica.personalDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.personal.Especialidad;

@Repository
public class EspecialidadDaoImpl implements EspecialidadDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Especialidad especialidad) {
        em.persist(especialidad);
    }

    @Override
    @Transactional
    public void update(Especialidad especialidad) {
        em.merge(especialidad);
    }

    @Override
    @Transactional
    public void delete(Integer codigoEspecialidad) {
    	Especialidad especialidad = em.find(Especialidad.class, codigoEspecialidad);
        if (especialidad != null) {
            em.remove(especialidad);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Especialidad read(Integer codigoEspecialidad) {
        return em.find(Especialidad.class, codigoEspecialidad);
    }

}