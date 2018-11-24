package edu.ues.ECeL.models.clinica.citaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.cita.Agenda;


@Repository
public class AgendaDaoImpl implements AgendaDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Agenda agenda) {
        em.persist(agenda);
    }

    @Override
    @Transactional
    public void update(Agenda agenda) {
        em.merge(agenda);
    }

    @Override
    @Transactional
    public void delete(Integer codigoAgenda) {
    	Agenda agenda = em.find(Agenda.class, codigoAgenda);
        if (agenda != null) {
            em.remove(agenda);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Agenda read(Integer codigoAgenda) {
        return em.find(Agenda.class, codigoAgenda);
    }

}
