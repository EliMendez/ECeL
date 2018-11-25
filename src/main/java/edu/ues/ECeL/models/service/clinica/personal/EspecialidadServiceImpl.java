package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.personal.EspecialidadDao;
import edu.ues.ECeL.models.entity.clinica.personal.Especialidad;

public class EspecialidadServiceImpl extends GenericObjectServiceImpl<Especialidad, Integer> implements EspecialidadService {
	
	private static final Logger logger = Logger.getLogger(EspecialidadServiceImpl.class);
	 
	@Autowired
	private EspecialidadDao especialidadDao;
	 
	public Especialidad getEspecialidadDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getEspecialidadDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return especialidadDao.getEspecialidadDetails(accountNumber);    
	 }

	public List<Especialidad> especialidadFinAll() {
		 try {
			 return especialidadDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteEspecialidad(Integer id) throws Exception {
		especialidadDao.delete(especialidadDao.findById(id));
	}

	public void saveEspecialidadAdd(Especialidad obj) { 
		try {
			Integer result = especialidadDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoEspecialidad());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateEspecialidad(Especialidad obj) {   
		try {   
			especialidadDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Especialidad findById(Integer id) {
		try {
			return especialidadDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
