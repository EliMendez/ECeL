package edu.ues.ECeL.models.dao.expediente.consulta;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.expediente.consulta.Consulta;

@Repository
public class ConsultaDaoImpl implements ConsultaDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Consulta consulta) {
        em.persist(consulta);
    }

    @Override
    @Transactional
    public void update(Consulta consulta) {
        em.merge(consulta);
    }

    @Override
    @Transactional
    public void delete(Integer codigoConsulta) {
    	Consulta consulta = em.find(Consulta.class, codigoConsulta);
        if (consulta != null) {
            em.remove(consulta);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Consulta read(Integer codigoConsulta) {
        return em.find(Consulta.class, codigoConsulta);
    }

}