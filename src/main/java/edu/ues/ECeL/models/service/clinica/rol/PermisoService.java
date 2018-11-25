package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.rol.Permiso;

public interface PermisoService {
	public void DeletePermiso(Integer id) throws Exception;
	public List<Permiso> PermisoFinAll();
	public Permiso getPermisoDetails(String accountNumber);  
	public void SavePermisoAdd(Permiso obj);
	public void UpdatePermiso(Permiso obj);
	public Permiso findById(Integer id);
}