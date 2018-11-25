package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.rol.Persona;

public interface PersonaService {
	public void DeletePersona(Integer id) throws Exception;
	public List<Persona> PersonaFinAll();
	public Persona getPersonaDetails(String accountNumber);  
	public void SavePersonaAdd(Persona obj);
	public void UpdatePersona(Persona obj);
	public Persona findById(Integer id);
}