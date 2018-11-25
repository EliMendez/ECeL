package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.rol.Departamento;

public interface DepartamentoService {
	public void DeleteDepartamento(Integer id) throws Exception;
	public List<Departamento> DepartamentoFinAll();
	public Departamento getDepartamentoDetails(String accountNumber);  
	public void SaveDepartamentoAdd(Departamento obj);
	public void UpdateDepartamento(Departamento obj);
	public Departamento findById(Integer id);
}