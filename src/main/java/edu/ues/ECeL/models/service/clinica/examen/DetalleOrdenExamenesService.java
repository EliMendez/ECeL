package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.examen.DetalleOrdenExamenes;

public interface DetalleOrdenExamenesService {
	public void DeleteDetalleOrdenExamenes(Integer id) throws Exception;
	public List<DetalleOrdenExamenes> DetalleOrdenExamenesFinAll();
	public DetalleOrdenExamenes getDetalleOrdenExamenesDetails(String accountNumber);  
	public void SaveDetalleOrdenExamenesAdd(DetalleOrdenExamenes obj);
	public void UpdateDetalleOrdenExamenes(DetalleOrdenExamenes obj);
	public DetalleOrdenExamenes findById(Integer id);
}

