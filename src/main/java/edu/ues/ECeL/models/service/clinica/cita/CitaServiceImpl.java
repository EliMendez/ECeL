package edu.ues.ECeL.models.service.clinica.cita;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.cita.CitaDao;
import edu.ues.ECeL.models.entity.clinica.cita.Cita;

public class CitaServiceImpl extends GenericObjectServiceImpl<Cita, Integer> implements CitaService {
	
	private static final Logger logger = Logger.getLogger(CitaServiceImpl.class);
	 
	@Autowired
	private CitaDao citaDao;
	 
	public Cita getCitaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getCitaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return citaDao.getCitaDetails(accountNumber);    
	 }

	public List<Cita> citaFinAll() {
		 try {
			 return citaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteCita(Integer id) throws Exception {
		citaDao.delete(citaDao.findById(id));
	}

	public void saveCitaAdd(Cita obj) { 
		try {
			Integer result = citaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoCita());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateCita(Cita obj) {   
		try {   
			citaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Cita findById(Integer id) {
		try {
			return citaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
