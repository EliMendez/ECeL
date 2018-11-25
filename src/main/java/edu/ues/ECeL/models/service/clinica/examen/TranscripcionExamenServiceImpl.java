package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.examen.TranscripcionExamenDao;
import edu.ues.ECeL.models.entity.clinica.examen.TranscripcionExamen;

public class TranscripcionExamenServiceImpl extends GenericObjectServiceImpl<TranscripcionExamen, Integer> implements TranscripcionExamenService {
	
	private static final Logger logger = Logger.getLogger(TranscripcionExamenServiceImpl.class);
	 
	@Autowired
	private TranscripcionExamenDao transcripcionExamenDao;
	 
	public TranscripcionExamen getTranscripcionExamenDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getTranscripcionExamenDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return transcripcionExamenDao.getTranscripcionExamenDetails(accountNumber);    
	 }

	public List<TranscripcionExamen> transcripcionExamenFinAll() {
		 try {
			 return transcripcionExamenDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteTranscripcionExamen(Integer id) throws Exception {
		transcripcionExamenDao.delete(transcripcionExamenDao.findById(id));
	}

	public void saveTranscripcionExamenAdd(TranscripcionExamen obj) { 
		try {
			Integer result = transcripcionExamenDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoTranscripcion());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateTranscripcionExamen(TranscripcionExamen obj) {   
		try {   
			transcripcionExamenDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public TranscripcionExamen findById(Integer id) {
		try {
			return transcripcionExamenDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
