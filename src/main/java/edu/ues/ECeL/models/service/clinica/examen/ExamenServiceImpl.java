package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.examen.ExamenDao;
import edu.ues.ECeL.models.entity.clinica.examen.Examen;

public class ExamenServiceImpl extends GenericObjectServiceImpl<Examen, Integer> implements ExamenService {
	
	private static final Logger logger = Logger.getLogger(ExamenServiceImpl.class);
	 
	@Autowired
	private ExamenDao examenDao;
	 
	public Examen getExamenDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getExamenDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return examenDao.getExamenDetails(accountNumber);    
	 }

	public List<Examen> examenFinAll() {
		 try {
			 return examenDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteExamen(Integer id) throws Exception {
		examenDao.delete(examenDao.findById(id));
	}

	public void saveExamenAdd(Examen obj) { 
		try {
			Integer result = examenDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoExamen());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateExamen(Examen obj) {   
		try {   
			examenDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Examen findById(Integer id) {
		try {
			return examenDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
