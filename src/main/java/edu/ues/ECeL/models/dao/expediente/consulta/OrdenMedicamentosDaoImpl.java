package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenMedicamentos;

@Repository
public class OrdenMedicamentosDaoImpl extends GenericHibernateDaoImpl<OrdenMedicamentos, Integer> implements OrdenMedicamentosDao{

private static final Logger logger = Logger.getLogger(OrdenMedicamentosDaoImpl.class);
	
	@Autowired
	public OrdenMedicamentosDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en OrdenMedicamentosDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public OrdenMedicamentos getOrdenMedicamentosDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (OrdenMedicamentos)getHibernateTemplate().get(OrdenMedicamentos.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<OrdenMedicamentos> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(OrdenMedicamentos.class);
	}

	@Override
	public OrdenMedicamentos findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (OrdenMedicamentos)getHibernateTemplate().get(OrdenMedicamentos.class, id);
	}

}