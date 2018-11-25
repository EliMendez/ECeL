package edu.ues.ECeL.models.dao.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.rol.Grupo;

@Repository
public class GrupoDaoImpl extends GenericHibernateDaoImpl<Grupo, Integer> implements GrupoDao{
	
private static final Logger logger = Logger.getLogger(GrupoDaoImpl.class);
	
	@Autowired
	public GrupoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en GrupoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Grupo> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Grupo.class);
	}

	@Override
	public Grupo findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Grupo)getHibernateTemplate().get(Grupo.class, id);
	}

}