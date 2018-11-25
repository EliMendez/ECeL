package edu.ues.ECeL.models.dao.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.rol.TipoContenido;

@Repository
public class TipoContenidoDaoImpl extends GenericHibernateDaoImpl<TipoContenido, Integer> implements TipoContenidoDao{

private static final Logger logger = Logger.getLogger(TipoContenidoDaoImpl.class);
	
	@Autowired
	public TipoContenidoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en TipoContenidoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public TipoContenido getTipoContenidoDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (TipoContenido)getHibernateTemplate().get(TipoContenido.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<TipoContenido> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(TipoContenido.class);
	}

	@Override
	public TipoContenido findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (TipoContenido)getHibernateTemplate().get(TipoContenido.class, id);
	}
	
}