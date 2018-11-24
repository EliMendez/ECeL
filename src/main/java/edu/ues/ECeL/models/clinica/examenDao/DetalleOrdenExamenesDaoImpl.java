package edu.ues.ECeL.models.clinica.examenDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.examen.DetalleOrdenExamenes;

@Repository
public class DetalleOrdenExamenesDaoImpl implements DetalleOrdenExamenesDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(DetalleOrdenExamenes detalleOrdenExamenes) {
        em.persist(detalleOrdenExamenes);
    }

    @Override
    @Transactional
    public void update(DetalleOrdenExamenes detalleOrdenExamenes) {
        em.merge(detalleOrdenExamenes);
    }

    @Override
    @Transactional
    public void delete(Integer codigoDetalleExamen) {
    	DetalleOrdenExamenes detalleOrdenExamenes = em.find(DetalleOrdenExamenes.class, codigoDetalleExamen);
        if (detalleOrdenExamenes != null) {
            em.remove(detalleOrdenExamenes);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleOrdenExamenes read(Integer codigoDetalleExamen) {
        return em.find(DetalleOrdenExamenes.class, codigoDetalleExamen);
    }

}
