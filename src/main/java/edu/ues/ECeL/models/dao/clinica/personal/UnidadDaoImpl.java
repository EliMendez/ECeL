package edu.ues.ECeL.models.dao.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.personal.Unidad;

@Repository
public class UnidadDaoImpl extends GenericHibernateDaoImpl<Unidad, Integer> implements UnidadDao{

private static final Logger logger = Logger.getLogger(UnidadDaoImpl.class);
	
	@Autowired
	public UnidadDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en UnidadDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Unidad> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Unidad.class);
	}

	@Override
	public Unidad findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Unidad)getHibernateTemplate().get(Unidad.class, id);
	}

}
