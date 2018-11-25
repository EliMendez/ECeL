package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.Clasificacion;

@Repository
public class ClasificacionDaoImpl extends GenericHibernateDaoImpl<Clasificacion, Integer> implements ClasificacionDao{

private static final Logger logger = Logger.getLogger(ClasificacionDaoImpl.class);
	
	@Autowired
	public ClasificacionDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en ClasificacionDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Clasificacion> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Clasificacion.class);
	}

	@Override
	public Clasificacion findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Clasificacion)getHibernateTemplate().get(Clasificacion.class, id);
	}

}