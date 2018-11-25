package edu.ues.ECeL.models.dao.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.rol.AdminLog;

@Repository
public class AdminLogDaoImpl extends GenericHibernateDaoImpl<AdminLog, Integer> implements AdminLogDao{

private static final Logger logger = Logger.getLogger(AdminLogDaoImpl.class);
	
	@Autowired
	public AdminLogDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en AdminLogDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public AdminLog getAdminLogDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (AdminLog)getHibernateTemplate().get(AdminLog.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<AdminLog> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(AdminLog.class);
	}

	@Override
	public AdminLog findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (AdminLog)getHibernateTemplate().get(AdminLog.class, id);
	}

}
