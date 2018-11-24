package edu.ues.ECeL.models.clinica.personalDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.personal.Unidad;

@Repository
public class UnidadDaoImpl implements UnidadDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Unidad unidad) {
        em.persist(unidad);
    }

    @Override
    @Transactional
    public void update(Unidad unidad) {
        em.merge(unidad);
    }

    @Override
    @Transactional
    public void delete(Integer codigoUnidad) {
    	Unidad unidad = em.find(Unidad.class, codigoUnidad);
        if (unidad != null) {
            em.remove(unidad);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Unidad read(Integer codigoUnidad) {
        return em.find(Unidad.class, codigoUnidad);
    }

}
