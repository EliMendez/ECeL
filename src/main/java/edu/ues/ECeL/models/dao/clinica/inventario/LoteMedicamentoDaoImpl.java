package edu.ues.ECeL.models.dao.clinica.inventario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.inventario.LoteMedicamento;

@Repository
public class LoteMedicamentoDaoImpl implements LoteMedicamentoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(LoteMedicamento loteMedicamento) {
        em.persist(loteMedicamento);
    }

    @Override
    @Transactional
    public void update(LoteMedicamento loteMedicamento) {
        em.merge(loteMedicamento);
    }

    @Override
    @Transactional
    public void delete(Integer numeroLote) {
    	LoteMedicamento loteMedicamento = em.find(LoteMedicamento.class, numeroLote);
        if (loteMedicamento != null) {
            em.remove(loteMedicamento);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public LoteMedicamento read(Integer numeroLote) {
        return em.find(LoteMedicamento.class, numeroLote);
    }

}

