package edu.ues.ECeL.models.dao.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.rol.Permiso;

@Repository
public class PermisoDaoImpl extends GenericHibernateDaoImpl<Permiso, Integer> implements PermisoDao{

private static final Logger logger = Logger.getLogger(PermisoDaoImpl.class);
	
	@Autowired
	public PermisoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en PermisoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Permiso> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Permiso.class);
	}

	@Override
	public Permiso findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Permiso)getHibernateTemplate().get(Permiso.class, id);
	}

}