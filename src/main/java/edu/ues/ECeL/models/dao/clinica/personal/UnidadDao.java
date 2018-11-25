package edu.ues.ECeL.models.dao.clinica.personal;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.personal.Unidad;

public interface UnidadDao extends GenericHibernateDao<Unidad, Integer> {
	public Unidad getUnidadDetails(Integer id);
}
