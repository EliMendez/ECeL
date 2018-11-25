package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenReferencias;

@Repository
public class OrdenReferenciasDaoImpl extends GenericHibernateDaoImpl<OrdenReferencias, Integer> implements OrdenReferenciasDao{

private static final Logger logger = Logger.getLogger(OrdenReferenciasDaoImpl.class);
	
	@Autowired
	public OrdenReferenciasDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en OrdenReferenciasDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public OrdenReferencias getOrdenReferenciasDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (OrdenReferencias)getHibernateTemplate().get(OrdenReferencias.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<OrdenReferencias> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(OrdenReferencias.class);
	}

	@Override
	public OrdenReferencias findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (OrdenReferencias)getHibernateTemplate().get(OrdenReferencias.class, id);
	}

}