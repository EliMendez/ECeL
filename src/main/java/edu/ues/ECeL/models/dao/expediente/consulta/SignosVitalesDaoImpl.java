package edu.ues.ECeL.models.dao.expediente.consulta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.expediente.consulta.SignosVitales;

@Repository
public class SignosVitalesDaoImpl implements SignosVitalesDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(SignosVitales signosVitales) {
        em.persist(signosVitales);
    }

    @Override
    @Transactional
    public void update(SignosVitales signosVitales) {
        em.merge(signosVitales);
    }

    @Override
    @Transactional
    public void delete(Integer codigoSignosVitales) {
    	SignosVitales signosVitales = em.find(SignosVitales.class, codigoSignosVitales);
        if (signosVitales != null) {
            em.remove(signosVitales);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public SignosVitales read(Integer codigoSignosVitales) {
        return em.find(SignosVitales.class, codigoSignosVitales);
    }

}