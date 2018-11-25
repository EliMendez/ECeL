package edu.ues.ECeL.models.dao.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.examen.TranscripcionExamen;

@Repository
public class TranscripcionExamenDaoImpl extends GenericHibernateDaoImpl<TranscripcionExamen, Integer> implements TranscripcionExamenDao{

private static final Logger logger = Logger.getLogger(TranscripcionExamenDaoImpl.class);
	
	@Autowired
	public TranscripcionExamenDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en TranscripcionExamenDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public TranscripcionExamen getTranscripcionExamenDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (TranscripcionExamen)getHibernateTemplate().get(TranscripcionExamen.class, id);
		  
	}
	
	@Override
	public List<TranscripcionExamen> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(TranscripcionExamen.class);
	}

	@Override
	public TranscripcionExamen findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (TranscripcionExamen)getHibernateTemplate().get(TranscripcionExamen.class, id);
	}

}