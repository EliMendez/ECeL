package edu.ues.ECeL.models.dao.expediente.consulta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.expediente.consulta.DetalleOrdenReferencia;

@Repository
public class DetalleOrdenReferenciaDaoImpl implements DetalleOrdenReferenciaDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(DetalleOrdenReferencia detalleOrdenReferencia) {
        em.persist(detalleOrdenReferencia);
    }

    @Override
    @Transactional
    public void update(DetalleOrdenReferencia detalleOrdenReferencia) {
        em.merge(detalleOrdenReferencia);
    }

    @Override
    @Transactional
    public void delete(Integer codigoDetalleReferencia) {
    	DetalleOrdenReferencia detalleOrdenReferencia = em.find(DetalleOrdenReferencia.class, codigoDetalleReferencia);
        if (detalleOrdenReferencia != null) {
            em.remove(detalleOrdenReferencia);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleOrdenReferencia read(Integer codigoDetalleReferencia) {
        return em.find(DetalleOrdenReferencia.class, codigoDetalleReferencia);
    }

}