package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleChequeoFisico;

@Repository
public class DetalleChequeoFisicoDaoImpl extends	GenericHibernateDaoImpl<DetalleChequeoFisico, Integer> implements DetalleChequeoFisicoDao{

	private static final Logger logger = Logger.getLogger(DetalleChequeoFisicoDaoImpl.class);
	
	@Autowired
	public DetalleChequeoFisicoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en DetalleChequeoFisicoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	public DetalleChequeoFisico getDetalleChequeoFisicoDetails(Integer id) {
		logger.info("Llamando al metodo getAccountDetails con parametro accountNumber " + id.toString());
		return (DetalleChequeoFisico)getHibernateTemplate().get(DetalleChequeoFisico.class, id);
		  
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<DetalleChequeoFisico> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(DetalleChequeoFisico.class);
	}

	@Override
	public DetalleChequeoFisico findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (DetalleChequeoFisico)getHibernateTemplate().get(DetalleChequeoFisico.class, id);
	}
	
}