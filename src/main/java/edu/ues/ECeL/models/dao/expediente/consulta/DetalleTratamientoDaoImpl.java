package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleTratamiento;

@Repository
public class DetalleTratamientoDaoImpl extends GenericHibernateDaoImpl<DetalleTratamiento, Integer> implements DetalleTratamientoDao{

private static final Logger logger = Logger.getLogger(DetalleTratamientoDaoImpl.class);
	
	@Autowired
	public DetalleTratamientoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en DetalleTratamientoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public DetalleTratamiento getDetalleTratamientoDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (DetalleTratamiento)getHibernateTemplate().get(DetalleTratamiento.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<DetalleTratamiento> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(DetalleTratamiento.class);
	}

	@Override
	public DetalleTratamiento findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (DetalleTratamiento)getHibernateTemplate().get(DetalleTratamiento.class, id);
	}

}