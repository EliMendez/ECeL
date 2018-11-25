package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.rol.Permiso;

public interface PermisoDao extends GenericHibernateDao<Permiso, Integer> {
	public Permiso getPermisoDetails(Integer id);
}
