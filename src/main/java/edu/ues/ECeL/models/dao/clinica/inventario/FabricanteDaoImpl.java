package edu.ues.ECeL.models.dao.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.dao.clinica.cita.AgendaDaoImpl;
import edu.ues.ECeL.models.entity.clinica.inventario.Fabricante;

@Repository
public class FabricanteDaoImpl extends GenericHibernateDaoImpl<Fabricante, Integer> implements FabricanteDao{

private static final Logger logger = Logger.getLogger(AgendaDaoImpl.class);
	
	@Autowired
	public FabricanteDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en FabricanteDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Fabricante getFabricanteDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Fabricante)getHibernateTemplate().get(Fabricante.class, id);
		  
	}
	
	@Override
	public List<Fabricante> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Fabricante.class);
	}

	@Override
	public Fabricante findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (Fabricante)getHibernateTemplate().get(Fabricante.class, id);
	}

}
