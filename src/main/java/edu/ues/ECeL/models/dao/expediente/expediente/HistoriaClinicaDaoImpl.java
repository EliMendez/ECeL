package edu.ues.ECeL.models.dao.expediente.expediente;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.models.entity.expediente.expediente.HistoriaClinica;

@Repository
public class HistoriaClinicaDaoImpl implements HistoriaClinicaDao{

private static final Logger logger = Logger.getLogger(HistoriaClinicaDaoImpl.class);
	
	@Autowired
	public HistoriaClinicaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en HistoriaClinicaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<HistoriaClinica> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(HistoriaClinica.class);
	}

	@Override
	public HistoriaClinica findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (HistoriaClinica)getHibernateTemplate().get(HistoriaClinica.class, id);
	}
	
}
