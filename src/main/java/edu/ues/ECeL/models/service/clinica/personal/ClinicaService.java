package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.personal.Clinica;

public interface ClinicaService {
	public void DeleteClinica(Integer id) throws Exception;
	public List<Clinica> ClinicaFinAll();
	public Clinica getClinicaDetails(String accountNumber);  
	public void SaveClinicaAdd(Clinica obj);
	public void UpdateClinica(Clinica obj);
	public Clinica findById(Integer id);
}
