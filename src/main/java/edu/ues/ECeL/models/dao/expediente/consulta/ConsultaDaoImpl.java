package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.Consulta;

@Repository
public class ConsultaDaoImpl extends GenericHibernateDaoImpl<Consulta, Integer> implements ConsultaDao{
	
	private static final Logger logger = Logger.getLogger(ConsultaDaoImpl.class);
	
	@Autowired
	public ConsultaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en ConsultaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Consulta getConsultaDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Consulta)getHibernateTemplate().get(Consulta.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Consulta> findAll() throws Exception {
		logger.info("Llamada al m�todo findAll");
		return getHibernateTemplate().loadAll(Consulta.class);
	}

	@Override
	public Consulta findById(Integer id) throws Exception {
		logger.info("Llamada al m�todo findById con el parametro "+id.toString());
		return (Consulta)getHibernateTemplate().get(Consulta.class, id);
	}
	
}