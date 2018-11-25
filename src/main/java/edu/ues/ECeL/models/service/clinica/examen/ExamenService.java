package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.examen.Examen;

public interface ExamenService {
	public void DeleteExamen(Integer id) throws Exception;
	public List<Examen> ExamenFinAll();
	public Examen getExamenDetails(String accountNumber);  
	public void SaveExamenAdd(Examen obj);
	public void UpdateExamen(Examen obj);
	public Examen findById(Integer id);
}
