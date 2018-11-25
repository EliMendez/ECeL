package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.examen.TranscripcionExamen;

public interface TranscripcionExamenService {
	public void DeleteTranscripcionExamen(Integer id) throws Exception;
	public List<TranscripcionExamen> TranscripcionExamenFinAll();
	public TranscripcionExamen getTranscripcionExamenDetails(String accountNumber);  
	public void SaveTranscripcionExamenAdd(TranscripcionExamen obj);
	public void UpdateTranscripcionExamen(TranscripcionExamen obj);
	public TranscripcionExamen findById(Integer id);
}

