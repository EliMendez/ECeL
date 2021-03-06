package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.SignosVitales;

@Repository
public class SignosVitalesDaoImpl extends GenericHibernateDaoImpl<SignosVitales, Integer> implements SignosVitalesDao{

private static final Logger logger = Logger.getLogger(SignosVitalesDaoImpl.class);
	
	@Autowired
	public SignosVitalesDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en SignosVitalesDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public SignosVitales getSignosVitalesDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (SignosVitales)getHibernateTemplate().get(SignosVitales.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<SignosVitales> findAll() throws Exception {
		logger.info("Llamada al m�todo findAll");
		return getHibernateTemplate().loadAll(SignosVitales.class);
	}

	@Override
	public SignosVitales findById(Integer id) throws Exception {
		logger.info("Llamada al m�todo findById con el parametro "+id.toString());
		return (SignosVitales)getHibernateTemplate().get(SignosVitales.class, id);
	}
	
}