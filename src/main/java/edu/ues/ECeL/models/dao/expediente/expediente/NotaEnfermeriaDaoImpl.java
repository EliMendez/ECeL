package edu.ues.ECeL.models.dao.expediente.expediente;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.expediente.NotaEnfermeria;

@Repository
public class NotaEnfermeriaDaoImpl extends GenericHibernateDaoImpl<NotaEnfermeria, Integer> implements NotaEnfermeriaDao{

private static final Logger logger = Logger.getLogger(NotaEnfermeriaDaoImpl.class);
	
	@Autowired
	public NotaEnfermeriaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en NotaEnfermeriaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<NotaEnfermeria> findAll() throws Exception {
		logger.info("Llamada al m�todo findAll");
		return getHibernateTemplate().loadAll(NotaEnfermeria.class);
	}

	@Override
	public NotaEnfermeria findById(Integer id) throws Exception {
		logger.info("Llamada al m�todo findById con el parametro "+id.toString());
		return (NotaEnfermeria)getHibernateTemplate().get(NotaEnfermeria.class, id);
	}
	
}