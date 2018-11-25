package edu.ues.ECeL.models.dao.expediente.consulta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenExamenes;

@Repository
public class OrdenExamenesDaoImpl implements OrdenExamenesDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(OrdenExamenes ordenExamenes) {
        em.persist(ordenExamenes);
    }

    @Override
    @Transactional
    public void update(OrdenExamenes ordenExamenes) {
        em.merge(ordenExamenes);
    }

    @Override
    @Transactional
    public void delete(Integer codigoOrdenExamenes) {
    	OrdenExamenes ordenExamenes = em.find(OrdenExamenes.class, codigoOrdenExamenes);
        if (ordenExamenes != null) {
            em.remove(ordenExamenes);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public OrdenExamenes read(Integer codigoOrdenExamenes) {
        return em.find(OrdenExamenes.class, codigoOrdenExamenes);
    }

}