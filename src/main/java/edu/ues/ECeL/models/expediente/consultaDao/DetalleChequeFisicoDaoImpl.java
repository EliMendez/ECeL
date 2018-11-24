package edu.ues.ECeL.models.expediente.consultaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.consulta.DetalleChequeFisico;

@Repository
public class DetalleChequeFisicoDaoImpl implements DetalleChequeFisicoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(DetalleChequeFisico detalleChequeFisico) {
        em.persist(detalleChequeFisico);
    }

    @Override
    @Transactional
    public void update(DetalleChequeFisico detalleChequeFisico) {
        em.merge(detalleChequeFisico);
    }

    @Override
    @Transactional
    public void delete(Integer codigoChequeo) {
    	DetalleChequeFisico detalleChequeFisico = em.find(DetalleChequeFisico.class, codigoChequeo);
        if (detalleChequeFisico != null) {
            em.remove(detalleChequeFisico);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleChequeFisico read(Integer codigoChequeo) {
        return em.find(DetalleChequeFisico.class, codigoChequeo);
    }

}