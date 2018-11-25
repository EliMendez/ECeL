package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.personal.ClinicaDao;
import edu.ues.ECeL.models.entity.clinica.personal.Clinica;

public class ClinicaServiceImpl extends GenericObjectServiceImpl<Clinica, Integer> implements ClinicaService {
	
	private static final Logger logger = Logger.getLogger(ClinicaServiceImpl.class);
	 
	@Autowired
	private ClinicaDao clinicaDao;
	 
	public Clinica getClinicaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getClinicaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return clinicaDao.getClinicaDetails(accountNumber);    
	 }

	public List<Clinica> clinicaFinAll() {
		 try {
			 return clinicaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteClinica(Integer id) throws Exception {
		clinicaDao.delete(clinicaDao.findById(id));
	}

	public void saveClinicaAdd(Clinica obj) { 
		try {
			Integer result = clinicaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoClinica());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateClinica(Clinica obj) {   
		try {   
			clinicaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Clinica findById(Integer id) {
		try {
			return clinicaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
