package edu.ues.ECeL.models.dao.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.rol.Departamento;

@Repository
public class DepartamentoDaoImpl extends GenericHibernateDaoImpl<Departamento, Integer> implements DepartamentoDao{

private static final Logger logger = Logger.getLogger(DepartamentoDaoImpl.class);
	
	@Autowired
	public DepartamentoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en DepartamentoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Departamento> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Departamento.class);
	}

	@Override
	public Departamento findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Departamento)getHibernateTemplate().get(Departamento.class, id);
	}

}