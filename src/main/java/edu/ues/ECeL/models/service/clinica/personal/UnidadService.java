package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.personal.Unidad;

public interface UnidadService {
	public void DeleteUnidad(Integer id) throws Exception;
	public List<Unidad> UnidadFinAll();
	public Unidad getUnidadDetails(String accountNumber);  
	public void SaveUnidadAdd(Unidad obj);
	public void UpdateUnidad(Unidad obj);
	public Unidad findById(Integer id);
}