package edu.ues.ECeL.models.dao.expediente.expediente;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.expediente.Expediente;

@Repository
public class ExpedienteDaoImpl extends GenericHibernateDaoImpl<Expediente, Integer> implements ExpedienteDao{

private static final Logger logger = Logger.getLogger(ExpedienteDaoImpl.class);
	
	@Autowired
	public ExpedienteDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en ExpedienteDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Expediente> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Expediente.class);
	}

	@Override
	public Expediente findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Expediente)getHibernateTemplate().get(Expediente.class, id);
	}
	
}
