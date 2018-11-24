package edu.ues.ECeL.models.expediente.expedienteDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.expediente.Expediente;

@Repository
public class ExpedienteDaoImpl implements ExpedienteDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Expediente expediente) {
        em.persist(expediente);
    }

    @Override
    @Transactional
    public void update(Expediente expediente) {
        em.merge(expediente);
    }

    @Override
    @Transactional
    public void delete(Integer codigoExpediente) {
    	Expediente expediente = em.find(Expediente.class, codigoExpediente);
        if (expediente != null) {
            em.remove(expediente);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Expediente read(Integer codigoExpediente) {
        return em.find(Expediente.class, codigoExpediente);
    }

}
