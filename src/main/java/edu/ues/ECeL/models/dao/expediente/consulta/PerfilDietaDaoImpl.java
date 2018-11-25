package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.PerfilDieta;

@Repository
public class PerfilDietaDaoImpl extends GenericHibernateDaoImpl<PerfilDieta, Integer> implements PerfilDietaDao{

private static final Logger logger = Logger.getLogger(PerfilDietaDaoImpl.class);
	
	@Autowired
	public PerfilDietaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en PerfilDietaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public PerfilDieta getPerfilDietaDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (PerfilDieta)getHibernateTemplate().get(PerfilDieta.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<PerfilDieta> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(PerfilDieta.class);
	}

	@Override
	public PerfilDieta findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (PerfilDieta)getHibernateTemplate().get(PerfilDieta.class, id);
	}

}