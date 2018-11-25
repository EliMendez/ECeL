package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.EnfermedadDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Enfermedad;

public class EnfermedadServiceImpl extends GenericObjectServiceImpl<Enfermedad, Integer> implements EnfermedadService {
	
	private static final Logger logger = Logger.getLogger(EnfermedadServiceImpl.class);
	 
	@Autowired
	private EnfermedadDao enfermedadDao;
	 
	public Enfermedad getEnfermedadDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getEnfermedadDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return enfermedadDao.getEnfermedadDetails(accountNumber);    
	 }

	public List<Enfermedad> enfermedadFinAll() {
		 try {
			 return enfermedadDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteEnfermedad(Integer id) throws Exception {
		enfermedadDao.delete(enfermedadDao.findById(id));
	}

	public void saveEnfermedadAdd(Enfermedad obj) { 
		try {
			Integer result = enfermedadDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoEnfermedad());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateEnfermedad(Enfermedad obj) {   
		try {   
			enfermedadDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Enfermedad findById(Integer id) {
		try {
			return enfermedadDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
