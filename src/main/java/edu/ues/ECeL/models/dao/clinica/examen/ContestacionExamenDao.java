package edu.ues.ECeL.models.dao.clinica.examen;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.examen.ContestacionExamen;

public interface ContestacionExamenDao extends GenericHibernateDao<ContestacionExamen, Integer> {
	public ContestacionExamen getContestacionExamenDetails(Integer id);
}