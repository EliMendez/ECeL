package edu.ues.ECeL.models.dao.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.examen.ContestacionExamen;

@Repository
public class ContestacionExamenDaoImpl extends GenericHibernateDaoImpl<ContestacionExamen, Integer> implements ContestacionExamenDao{

private static final Logger logger = Logger.getLogger(ContestacionExamenDaoImpl.class);
	
	@Autowired
	public ContestacionExamenDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en ContestacionExamenDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public ContestacionExamen getContestacionExamenDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (ContestacionExamen)getHibernateTemplate().get(ContestacionExamen.class, id);
		  
	}
	
	@Override
	public List<ContestacionExamen> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(ContestacionExamen.class);
	}

	@Override
	public ContestacionExamen findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (ContestacionExamen)getHibernateTemplate().get(ContestacionExamen.class, id);
	}
}
