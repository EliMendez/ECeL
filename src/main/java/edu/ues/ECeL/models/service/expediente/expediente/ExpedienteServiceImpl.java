package edu.ues.ECeL.models.service.expediente.expediente;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.expediente.ExpedienteDao;
import edu.ues.ECeL.models.entity.expediente.expediente.Expediente;

public class ExpedienteServiceImpl extends GenericObjectServiceImpl<Expediente, Integer> implements ExpedienteService {
	
	private static final Logger logger = Logger.getLogger(ExpedienteServiceImpl.class);
	 
	@Autowired
	private ExpedienteDao expedienteDao;
	 
	public Expediente getExpedienteDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getExpedienteDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return expedienteDao.getExpedienteDetails(accountNumber);    
	 }

	public List<Expediente> expedienteFinAll() {
		 try {
			 return expedienteDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteExpediente(Integer id) throws Exception {
		expedienteDao.delete(expedienteDao.findById(id));
	}

	public void saveExpedienteAdd(Expediente obj) { 
		try {
			Integer result = expedienteDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoExpediente());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateExpediente(Expediente obj) {   
		try {   
			expedienteDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Expediente findById(Integer id) {
		try {
			return expedienteDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
