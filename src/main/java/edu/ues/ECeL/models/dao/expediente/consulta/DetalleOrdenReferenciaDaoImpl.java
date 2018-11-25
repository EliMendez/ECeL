package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleOrdenReferencia;

@Repository
public class DetalleOrdenReferenciaDaoImpl extends GenericHibernateDaoImpl<DetalleOrdenReferencia, Integer> implements DetalleOrdenReferenciaDao {

private static final Logger logger = Logger.getLogger(DetalleOrdenReferenciaDaoImpl.class);
	
	@Autowired
	public DetalleOrdenReferenciaDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en DetalleOrdenReferenciaDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<DetalleOrdenReferencia> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(DetalleOrdenReferencia.class);
	}

	@Override
	public DetalleOrdenReferencia findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (DetalleOrdenReferencia)getHibernateTemplate().get(DetalleOrdenReferencia.class, id);
	}

}