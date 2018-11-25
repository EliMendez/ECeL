package edu.ues.ECeL.models.dao.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.entity.clinica.rol.Municipio;

@Repository
public class MunicipioDaoImpl extends GenericHibernateDaoImpl<Municipio, Integer> implements MunicipioDao{
	
private static final Logger logger = Logger.getLogger(MunicipioDaoImpl.class);
	
	@Autowired
	public MunicipioDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFActory en MunicipioDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	/*@Override
	public List<Map<String, Object>> findMapByQuery(String queryString) throws Exception {
		return getHibernateTemplate().
	}*/

	@Override
	public List<Municipio> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(Municipio.class);
	}

	@Override
	public Municipio findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parametro "+id.toString());
		return (Municipio)getHibernateTemplate().get(Municipio.class, id);
	}

}