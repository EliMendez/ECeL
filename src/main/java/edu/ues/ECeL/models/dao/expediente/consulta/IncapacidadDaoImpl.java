package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.Incapacidad;

@Repository
public class IncapacidadDaoImpl extends GenericHibernateDaoImpl<Incapacidad, Integer> implements IncapacidadDao{

private static final Logger logger = Logger.getLogger(IncapacidadDaoImpl.class);
	
	@Autowired
	public IncapacidadDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en IncapacidadDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Incapacidad> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Incapacidad.class);
	}

	@Override
	public Incapacidad findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Incapacidad)getHibernateTemplate().get(Incapacidad.class, id);
	}

}