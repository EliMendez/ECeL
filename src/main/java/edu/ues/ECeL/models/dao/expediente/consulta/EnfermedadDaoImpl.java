package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.Enfermedad;

@Repository
public class EnfermedadDaoImpl extends GenericHibernateDaoImpl<Enfermedad, Integer> implements EnfermedadDao{

private static final Logger logger = Logger.getLogger(EnfermedadDaoImpl.class);
	
	@Autowired
	public EnfermedadDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en EnfermedadDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Enfermedad> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Enfermedad.class);
	}

	@Override
	public Enfermedad findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Enfermedad)getHibernateTemplate().get(Enfermedad.class, id);
	}

}