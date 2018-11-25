package edu.ues.ECeL.models.dao.clinica.personal;

import edu.ues.ECeL.models.entity.clinica.personal.Empleado;

public interface EmpleadoDao {
	public void insert(Empleado empleado);
    public void update(Empleado empleado);
    public void delete(Integer codigoEmpleado);
    public Empleado read(Integer codigoEmpleado);
}
