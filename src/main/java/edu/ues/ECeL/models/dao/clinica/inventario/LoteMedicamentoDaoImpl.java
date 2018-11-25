package edu.ues.ECeL.models.dao.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.ues.ECeL.generic.GenericHibernateDaoImpl;
import edu.ues.ECeL.models.dao.clinica.cita.AgendaDaoImpl;
import edu.ues.ECeL.models.entity.clinica.inventario.LoteMedicamento;

@Repository
public class LoteMedicamentoDaoImpl extends GenericHibernateDaoImpl<LoteMedicamento, Integer> implements LoteMedicamentoDao{

private static final Logger logger = Logger.getLogger(AgendaDaoImpl.class);
	
	@Autowired
	public LoteMedicamentoDaoImpl(SessionFactory sessionFactory) {
		logger.info("IoC SessionFactory en LoteMedicamentoDaoImpl");
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public List<LoteMedicamento> findAll() throws Exception {
		logger.info("Llamada al método findAll");
		return getHibernateTemplate().loadAll(LoteMedicamento.class);
	}

	@Override
	public LoteMedicamento findById(Integer id) throws Exception {
		logger.info("Llamada al método findById con el parámetro "+id.toString());
		return (LoteMedicamento)getHibernateTemplate().get(LoteMedicamento.class, id);
	}
}

