package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.rol.Grupo;

public interface GrupoService {
	public void DeleteGrupo(Integer id) throws Exception;
	public List<Grupo> GrupoFinAll();
	public Grupo getGrupoDetails(String accountNumber);  
	public void SaveGrupoAdd(Grupo obj);
	public void UpdateGrupo(Grupo obj);
	public Grupo findById(Integer id);
}