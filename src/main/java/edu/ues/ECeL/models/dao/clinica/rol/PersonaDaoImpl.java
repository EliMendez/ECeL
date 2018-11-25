package edu.ues.ECeL.models.dao.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.rol.Persona;

@Repository
public class PersonaDaoImpl extends GenericHibernateDaoImpl<Persona, Integer> implements PersonaDao{

private static final Logger logger = Logger.getLogger(PersonaDaoImpl.class);
	
	@Autowired
	public PersonaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en PersonaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Persona getPersonaDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Persona)getHibernateTemplate().get(Persona.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Persona> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Persona.class);
	}

	@Override
	public Persona findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Persona)getHibernateTemplate().get(Persona.class, id);
	}

}