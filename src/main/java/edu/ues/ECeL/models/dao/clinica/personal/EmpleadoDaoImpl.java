package edu.ues.ECeL.models.dao.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.personal.Empleado;

@Repository
public class EmpleadoDaoImpl extends GenericHibernateDaoImpl<Empleado, Integer> implements EmpleadoDao{

private static final Logger logger = Logger.getLogger(EmpleadoDaoImpl.class);
	
	@Autowired
	public EmpleadoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en EmpleadoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Empleado getEmpleadoDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Empleado)getHibernateTemplate().get(Empleado.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Empleado> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Empleado.class);
	}

	@Override
	public Empleado findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Empleado)getHibernateTemplate().get(Empleado.class, id);
	}

}
