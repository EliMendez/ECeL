package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.PerfilDieta;

public interface PerfilDietaService {
	public void DeletePerfilDieta(Integer id) throws Exception;
	public List<PerfilDieta> PerfilDietaFinAll();
	public PerfilDieta getPerfilDietaDetails(String accountNumber);  
	public void SavePerfilDietaAdd(PerfilDieta obj);
	public void UpdatePerfilDieta(PerfilDieta obj);
	public PerfilDieta findById(Integer id);
}
