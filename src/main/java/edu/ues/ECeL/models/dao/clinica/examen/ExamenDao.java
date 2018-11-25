package edu.ues.ECeL.models.dao.clinica.examen;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.examen.Examen;

public interface ExamenDao extends GenericHibernateDao<Examen, Integer> {
	public Examen getExamenDetails(Integer id);
}
