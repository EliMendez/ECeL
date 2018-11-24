package edu.ues.ECeL.models.clinica.personalDao;

import edu.ues.ECeL.models.clinica.personal.Empleado;

public interface EmpleadoDao {
	public void insert(Empleado empleado);
    public void update(Empleado empleado);
    public void delete(Integer codigoEmpleado);
    public Empleado read(Integer codigoEmpleado);
}
