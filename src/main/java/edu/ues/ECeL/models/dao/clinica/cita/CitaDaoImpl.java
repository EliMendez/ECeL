package edu.ues.ECeL.models.dao.clinica.cita;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.cita.Cita;


@Repository
public class CitaDaoImpl extends GenericHibernateDaoImpl<Cita, Integer> implements CitaDao{

	private static final Logger logger = Logger.getLogger(CitaDaoImpl.class);
	
	@Autowired
	public CitaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en CitaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Cita getCitaDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Cita)getHibernateTemplate().get(Cita.class, id);
		  
	}
	
	@Override
	public List<Cita> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Cita.class);
	}

	@Override
	public Cita findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (Cita)getHibernateTemplate().get(Cita.class, id);
	}

}
