package edu.ues.ECeL.models.dao.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.dao.clinica.cita.AgendaDaoImpl;
import edu.ues.ECeL.models.entity.clinica.examen.DetalleOrdenExamenes;

@Repository
public class DetalleOrdenExamenesDaoImpl extends GenericHibernateDaoImpl<DetalleOrdenExamenes, Integer> implements DetalleOrdenExamenesDao{

private static final Logger logger = Logger.getLogger(AgendaDaoImpl.class);
	
	@Autowired
	public DetalleOrdenExamenesDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en DetalleOrdenExamenesDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<DetalleOrdenExamenes> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(DetalleOrdenExamenes.class);
	}

	@Override
	public DetalleOrdenExamenes findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (DetalleOrdenExamenes)getHibernateTemplate().get(DetalleOrdenExamenes.class, id);
	}

}
