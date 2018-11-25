package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.personal.Especialidad;

public interface EspecialidadService {
	public void DeleteEspecialidad(Integer id) throws Exception;
	public List<Especialidad> EspecialidadFinAll();
	public Especialidad getEspecialidadDetails(String accountNumber);  
	public void SaveEspecialidadAdd(Especialidad obj);
	public void UpdateEspecialidad(Especialidad obj);
	public Especialidad findById(Integer id);
}