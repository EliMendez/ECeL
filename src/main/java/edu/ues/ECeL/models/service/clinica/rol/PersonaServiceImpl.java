package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.entity.clinica.rol.Persona;
import edu.ues.ECeL.models.dao.clinica.rol.PersonaDao;

public class PersonaServiceImpl extends GenericObjectServiceImpl<Persona, Integer> implements PersonaService {
	
	private static final Logger logger = Logger.getLogger(PersonaServiceImpl.class);
	 
	@Autowired
	private PersonaDao personaDao;
	 
	public Persona getPersonaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getPersonaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return personaDao.getPersonaDetails(accountNumber);    
	 }

	public List<Persona> personaFinAll() {
		 try {
			 return personaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deletePersona(Integer id) throws Exception {
		personaDao.delete(personaDao.findById(id));
	}

	public void savePersonaAdd(Persona obj) { 
		try {
			Integer result = personaDao.save(obj);
			System.out.println("id grabado " + obj.getDui());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updatePersona(Persona obj) {   
		try {   
			personaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Persona findById(Integer id) {
		try {
			return personaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
