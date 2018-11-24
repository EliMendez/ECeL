package edu.ues.ECeL.models.expediente.consultaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.consulta.Diagnostico;

@Repository
public class DiagnosticoDaoImpl implements DiagnosticoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Diagnostico diagnostico) {
        em.persist(diagnostico);
    }

    @Override
    @Transactional
    public void update(Diagnostico diagnostico) {
        em.merge(diagnostico);
    }

    @Override
    @Transactional
    public void delete(Integer codigoDiagnostico) {
    	Diagnostico diagnostico = em.find(Diagnostico.class, codigoDiagnostico);
        if (diagnostico != null) {
            em.remove(diagnostico);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Diagnostico read(Integer codigoDiagnostico) {
        return em.find(Diagnostico.class, codigoDiagnostico);
    }

}