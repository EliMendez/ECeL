package edu.ues.ECeL.models.dao.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.examen.Examen;

@Repository
public class ExamenDaoImpl extends GenericHibernateDaoImpl<Examen, Integer> implements ExamenDao{

private static final Logger logger = Logger.getLogger(ExamenDaoImpl.class);
	
	@Autowired
	public ExamenDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en ExamenDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Examen getExamenDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Examen)getHibernateTemplate().get(Examen.class, id);
		  
	}
	
	@Override
	public List<Examen> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Examen.class);
	}

	@Override
	public Examen findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (Examen)getHibernateTemplate().get(Examen.class, id);
	}

}