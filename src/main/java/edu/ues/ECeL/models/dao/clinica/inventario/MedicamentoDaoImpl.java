package edu.ues.ECeL.models.dao.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.dao.clinica.cita.AgendaDaoImpl;
import edu.ues.ECeL.models.entity.clinica.inventario.Medicamento;

@Repository
public class MedicamentoDaoImpl extends GenericHibernateDaoImpl<Medicamento, Integer> implements MedicamentoDao{

private static final Logger logger = Logger.getLogger(AgendaDaoImpl.class);
	
	@Autowired
	public MedicamentoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en MedicamentoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public Medicamento getMedicamentoDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (Medicamento)getHibernateTemplate().get(Medicamento.class, id);
		  
	}
	
	@Override
	public List<Medicamento> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Medicamento.class);
	}

	@Override
	public Medicamento findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (Medicamento)getHibernateTemplate().get(Medicamento.class, id);
	}
}

