package edu.ues.ECeL.models.service.clinica.cita;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.cita.Cita;

public interface CitaService {
	public void DeleteCita(Integer id) throws Exception;
	public List<Cita> CitaFinAll();
	public Cita getCitaDetails(String accountNumber);  
	public void SaveCitaAdd(Cita obj);
	public void UpdateCita(Cita obj);
	public Cita findById(Integer id);
}
