package edu.ues.ECeL.models.dao.clinica.personal;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.personal.Empleado;

public interface EmpleadoDao extends GenericHibernateDao<Empleado, Integer> {
	public Empleado getEmpleadoDetails(Integer id);
}
