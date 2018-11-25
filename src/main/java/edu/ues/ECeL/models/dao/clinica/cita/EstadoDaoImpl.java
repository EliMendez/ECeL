package edu.ues.ECeL.models.dao.clinica.cita;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.cita.Cita;
import edu.ues.ECeL.models.entity.clinica.cita.Estado;

@Repository
public class EstadoDaoImpl extends GenericHibernateDaoImpl<Estado, Integer> implements EstadoDao{

	private static final Logger logger = Logger.getLogger(AgendaDaoImpl.class);
	
	@Autowired
	public EstadoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en EstadoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<Estado> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Estado.class);
	}

	@Override
	public Estado findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (Estado)getHibernateTemplate().get(Estado.class, id);
	}

}
