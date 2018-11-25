package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.personal.Empleado;

public interface EmpleadoService {
	public void DeleteEmpleado(Integer id) throws Exception;
	public List<Empleado> EmpleadoFinAll();
	public Empleado getEmpleadoDetails(String accountNumber);  
	public void SaveEmpleadoAdd(Empleado obj);
	public void UpdateEmpleado(Empleado obj);
	public Empleado findById(Integer id);
}
