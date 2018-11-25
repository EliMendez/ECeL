package edu.ues.ECeL.models.dao.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.dao.clinica.cita.AgendaDaoImpl;
import edu.ues.ECeL.models.entity.clinica.inventario.DetalleOrdenMedicamentos;

@Repository
public class DetalleOrdenMedicamentosDaoImpl extends GenericHibernateDaoImpl<DetalleOrdenMedicamentos, Integer> implements DetalleOrdenMedicamentosDao{

private static final Logger logger = Logger.getLogger(AgendaDaoImpl.class);
	
	@Autowired
	public DetalleOrdenMedicamentosDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en DetalleOrdenMedicamentosDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<DetalleOrdenMedicamentos> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(DetalleOrdenMedicamentos.class);
	}

	@Override
	public DetalleOrdenMedicamentos findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (DetalleOrdenMedicamentos)getHibernateTemplate().get(DetalleOrdenMedicamentos.class, id);
	}

}