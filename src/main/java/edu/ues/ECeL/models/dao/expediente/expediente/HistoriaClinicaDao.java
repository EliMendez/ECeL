package edu.ues.ECeL.models.dao.expediente.expediente;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.expediente.HistoriaClinica;

public interface HistoriaClinicaDao extends GenericHibernateDao<HistoriaClinica, Integer>{
	public HistoriaClinica getHistoriaClinicaDetails(Integer id);
}
