package edu.ues.ECeL.models.dao.clinica.inventario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.inventario.DetalleOrdenMedicamentos;

@Repository
public class DetalleOrdenMedicamentosDaoImpl implements DetalleOrdenMedicamentosDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(DetalleOrdenMedicamentos detalleOrdenMedicamentos) {
        em.persist(detalleOrdenMedicamentos);
    }

    @Override
    @Transactional
    public void update(DetalleOrdenMedicamentos detalleOrdenMedicamentos) {
        em.merge(detalleOrdenMedicamentos);
    }

    @Override
    @Transactional
    public void delete(Integer codigoDetalleOrdenMedicamento) {
    	DetalleOrdenMedicamentos detalleOrdenMedicamentos = em.find(DetalleOrdenMedicamentos.class, codigoDetalleOrdenMedicamento);
        if (detalleOrdenMedicamentos != null) {
            em.remove(detalleOrdenMedicamentos);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public DetalleOrdenMedicamentos read(Integer codigoDetalleOrdenMedicamento) {
        return em.find(DetalleOrdenMedicamentos.class, codigoDetalleOrdenMedicamento);
    }

}