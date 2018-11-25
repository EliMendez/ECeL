package edu.ues.ECeL.models.service.expediente.expediente;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.expediente.HistoriaClinicaDao;
import edu.ues.ECeL.models.entity.expediente.expediente.HistoriaClinica;

public class HistoriaClinicaServiceImpl extends GenericObjectServiceImpl<HistoriaClinica, Integer> implements HistoriaClinicaService {
	
	private static final Logger logger = Logger.getLogger(HistoriaClinicaServiceImpl.class);
	 
	@Autowired
	private HistoriaClinicaDao historiaDao;
	 
	public HistoriaClinica getHistoriaClinicaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getHistoriaClinicaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return historiaDao.getHistoriaClinicaDetails(accountNumber);    
	 }

	public List<HistoriaClinica> historiaFinAll() {
		 try {
			 return historiaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteHistoriaClinica(Integer id) throws Exception {
		historiaDao.delete(historiaDao.findById(id));
	}

	public void saveHistoriaClinicaAdd(HistoriaClinica obj) { 
		try {
			Integer result = historiaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoHistoriaClinica());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateHistoriaClinica(HistoriaClinica obj) {   
		try {   
			historiaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public HistoriaClinica findById(Integer id) {
		try {
			return historiaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
