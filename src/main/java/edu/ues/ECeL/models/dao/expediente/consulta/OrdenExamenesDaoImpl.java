package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenExamenes;

@Repository
public class OrdenExamenesDaoImpl extends GenericHibernateDaoImpl<OrdenExamenes, Integer> implements OrdenExamenesDao{

	private static final Logger logger = Logger.getLogger(OrdenExamenesDaoImpl.class);
	
	@Autowired
	public OrdenExamenesDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en OrdenExamenesDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<OrdenExamenes> findAll() throws Exception {
		logger.info("Llamada al m�todo findAll");
		return getHibernateTemplate().loadAll(OrdenExamenes.class);
	}

	@Override
	public OrdenExamenes findById(Integer id) throws Exception {
		logger.info("Llamada al m�todo findById con el parametro "+id.toString());
		return (OrdenExamenes)getHibernateTemplate().get(OrdenExamenes.class, id);
	}

}