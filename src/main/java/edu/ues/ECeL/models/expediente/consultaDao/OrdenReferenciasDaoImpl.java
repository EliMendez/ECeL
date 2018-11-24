package edu.ues.ECeL.models.expediente.consultaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.consulta.OrdenReferencias;

@Repository
public class OrdenReferenciasDaoImpl implements OrdenReferenciasDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(OrdenReferencias ordenReferencias) {
        em.persist(ordenReferencias);
    }

    @Override
    @Transactional
    public void update(OrdenReferencias ordenReferencias) {
        em.merge(ordenReferencias);
    }

    @Override
    @Transactional
    public void delete(Integer codigoReferencia) {
    	OrdenReferencias ordenReferencias = em.find(OrdenReferencias.class, codigoReferencia);
        if (ordenReferencias != null) {
            em.remove(ordenReferencias);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public OrdenReferencias read(Integer codigoReferencia) {
        return em.find(OrdenReferencias.class, codigoReferencia);
    }

}