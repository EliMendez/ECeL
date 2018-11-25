package edu.ues.ECeL.models.dao.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.personal.Especialidad;

@Repository
public class EspecialidadDaoImpl extends GenericHibernateDaoImpl<Especialidad, Integer> implements EspecialidadDao{

private static final Logger logger = Logger.getLogger(EspecialidadDaoImpl.class);
	
	@Autowired
	public EspecialidadDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en EspecialidadDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Especialidad getEspecialidadDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Especialidad)getHibernateTemplate().get(Especialidad.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Especialidad> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Especialidad.class);
	}

	@Override
	public Especialidad findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Especialidad)getHibernateTemplate().get(Especialidad.class, id);
	}

}