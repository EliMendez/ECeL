package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.examen.ContestacionExamen;

public interface ContestacionExamenService {
	public void DeleteContestacionExamen(Integer id) throws Exception;
	public List<ContestacionExamen> ContestacionExamenFinAll();
	public ContestacionExamen getContestacionExamenDetails(String accountNumber);  
	public void SaveContestacionExamenAdd(ContestacionExamen obj);
	public void UpdateContestacionExamen(ContestacionExamen obj);
	public ContestacionExamen findById(Integer id);
}

