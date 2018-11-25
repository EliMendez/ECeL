package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.rol.Municipio;

public interface MunicipioService {
	public void DeleteMunicipio(Integer id) throws Exception;
	public List<Municipio> MunicipioFinAll();
	public Municipio getMunicipioDetails(String accountNumber);  
	public void SaveMunicipioAdd(Municipio obj);
	public void UpdateMunicipio(Municipio obj);
	public Municipio findById(Integer id);
}