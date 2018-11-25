package edu.ues.ECeL.models.dao.expediente.consulta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenMedicamentos;

@Repository
public class OrdenMedicamentosDaoImpl implements OrdenMedicamentosDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(OrdenMedicamentos ordenMedicamentos) {
        em.persist(ordenMedicamentos);
    }

    @Override
    @Transactional
    public void update(OrdenMedicamentos ordenMedicamentos) {
        em.merge(ordenMedicamentos);
    }

    @Override
    @Transactional
    public void delete(Integer codigoOrdenMedicamentos) {
    	OrdenMedicamentos ordenMedicamentos = em.find(OrdenMedicamentos.class, codigoOrdenMedicamentos);
        if (ordenMedicamentos != null) {
            em.remove(ordenMedicamentos);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public OrdenMedicamentos read(Integer codigoOrdenMedicamentos) {
        return em.find(OrdenMedicamentos.class, codigoOrdenMedicamentos);
    }

}