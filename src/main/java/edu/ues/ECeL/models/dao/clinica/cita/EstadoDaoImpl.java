package edu.ues.ECeL.models.dao.clinica.cita;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.cita.Estado;

@Repository
public class EstadoDaoImpl implements EstadoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Estado estado) {
        em.persist(estado);
    }

    @Override
    @Transactional
    public void update(Estado estado) {
        em.merge(estado);
    }

    @Override
    @Transactional
    public void delete(Integer codigoEstado) {
    	Estado estado = em.find(Estado.class, codigoEstado);
        if (estado != null) {
            em.remove(estado);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Estado read(Integer codigoEstado) {
        return em.find(Estado.class, codigoEstado);
    }

}
