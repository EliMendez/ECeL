package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenExamenes;

public interface OrdenExamenesService {
	public void DeleteOrdenExamenes(Integer id) throws Exception;
	public List<OrdenExamenes> OrdenExamenesFinAll();
	public OrdenExamenes getOrdenExamenesDetails(String accountNumber);  
	public void SaveOrdenExamenesAdd(OrdenExamenes obj);
	public void UpdateOrdenExamenes(OrdenExamenes obj);
	public OrdenExamenes findById(Integer id);
}
