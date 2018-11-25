package edu.ues.ECeL.models.dao.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.personal.Cargo;

@Repository
public class CargoDaoImpl extends GenericHibernateDaoImpl<Cargo, Integer> implements CargoDao{
	
	private static final Logger logger = Logger.getLogger(CargoDaoImpl.class);
	
	@Autowired
	public CargoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en CargoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Cargo getCargoDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Cargo)getHibernateTemplate().get(Cargo.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Cargo> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Cargo.class);
	}

	@Override
	public Cargo findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Cargo)getHibernateTemplate().get(Cargo.class, id);
	}
	
}

