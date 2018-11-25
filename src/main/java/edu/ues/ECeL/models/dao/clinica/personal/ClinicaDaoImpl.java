package edu.ues.ECeL.models.dao.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.personal.Clinica;

@Repository
public class ClinicaDaoImpl extends GenericHibernateDaoImpl<Clinica, Integer> implements ClinicaDao{

private static final Logger logger = Logger.getLogger(ClinicaDaoImpl.class);
	
	@Autowired
	public ClinicaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en ClinicaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/
	
	public Clinica getClinicaDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Clinica)getHibernateTemplate().get(Clinica.class, id);
		  
	}

	@Override
	public List<Clinica> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Clinica.class);
	}

	@Override
	public Clinica findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Clinica)getHibernateTemplate().get(Clinica.class, id);
	}

}