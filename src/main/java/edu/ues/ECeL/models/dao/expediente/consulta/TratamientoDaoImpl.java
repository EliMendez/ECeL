package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.Tratamiento;

@Repository
public class TratamientoDaoImpl extends GenericHibernateDaoImpl<Tratamiento, Integer> implements TratamientoDao{

private static final Logger logger = Logger.getLogger(TratamientoDaoImpl.class);
	
	@Autowired
	public TratamientoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en TratamientoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Tratamiento getTratamientoDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Tratamiento)getHibernateTemplate().get(Tratamiento.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Tratamiento> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Tratamiento.class);
	}

	@Override
	public Tratamiento findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Tratamiento)getHibernateTemplate().get(Tratamiento.class, id);
	}

}