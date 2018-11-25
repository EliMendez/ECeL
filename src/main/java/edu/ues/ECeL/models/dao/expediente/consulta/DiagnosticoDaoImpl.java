package edu.ues.ECeL.models.dao.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.expediente.consulta.Diagnostico;

@Repository
public class DiagnosticoDaoImpl extends GenericHibernateDaoImpl<Diagnostico, Integer> implements DiagnosticoDao{

private static final Logger logger = Logger.getLogger(DiagnosticoDaoImpl.class);
	
	@Autowired
	public DiagnosticoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en DiagnosticoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Diagnostico> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Diagnostico.class);
	}

	@Override
	public Diagnostico findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Diagnostico)getHibernateTemplate().get(Diagnostico.class, id);
	}

}