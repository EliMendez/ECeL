package edu.ues.ECeL.models.service.expediente.expediente;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.expediente.HistoriaClinica;

public interface HistoriaClinicaService {
	public void DeleteHistoriaClinica(Integer id) throws Exception;
	public List<HistoriaClinica> HistoriaClinicaFinAll();
	public HistoriaClinica getHistoriaClinicaDetails(String accountNumber);  
	public void SaveHistoriaClinicaAdd(HistoriaClinica obj);
	public void UpdateHistoriaClinica(HistoriaClinica obj);
	public HistoriaClinica findById(Integer id);
}