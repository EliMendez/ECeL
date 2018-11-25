package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.consulta.SignosVitales;

public interface SignosVitalesDao extends GenericHibernateDao<SignosVitales, Integer>{
	public SignosVitales getSignosVitalesDetails(Integer id);
}
