package edu.ues.ECeL.models.dao.clinica.cita;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.cita.Agenda;


@Repository
public class AgendaDaoImpl extends GenericHibernateDaoImpl<Agenda, Integer> implements AgendaDao{

	private static final Logger logger = Logger.getLogger(AgendaDaoImpl.class);
	
	@Autowired
	public AgendaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en AgendaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Agenda> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Agenda.class);
	}

	@Override
	public Agenda findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Agenda)getHibernateTemplate().get(Agenda.class, id);
	}

}
