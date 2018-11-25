package edu.ues.ECeL.models.dao.clinica.inventario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.inventario.Medicamento;

public class MedicamentoDaoImpl implements MedicamentoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Medicamento medicamento) {
        em.persist(medicamento);
    }

    @Override
    @Transactional
    public void update(Medicamento medicamento) {
        em.merge(medicamento);
    }

    @Override
    @Transactional
    public void delete(Integer codigoMedicamento) {
    	Medicamento medicamento = em.find(Medicamento.class, codigoMedicamento);
        if (medicamento != null) {
            em.remove(medicamento);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Medicamento read(Integer codigoMedicamento) {
        return em.find(Medicamento.class, codigoMedicamento);
    }

}

