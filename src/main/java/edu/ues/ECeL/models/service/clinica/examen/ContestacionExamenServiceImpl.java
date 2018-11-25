package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.examen.ContestacionExamenDao;
import edu.ues.ECeL.models.entity.clinica.examen.ContestacionExamen;

public class ContestacionExamenServiceImpl extends GenericObjectServiceImpl<ContestacionExamen, Integer> implements ContestacionExamenService {
	
	private static final Logger logger = Logger.getLogger(ContestacionExamenServiceImpl.class);
	 
	@Autowired
	private ContestacionExamenDao contestacionExamenDao;
	 
	public ContestacionExamen getContestacionExamenDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getContestacionExamenDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return contestacionExamenDao.getContestacionExamenDetails(accountNumber);    
	 }

	public List<ContestacionExamen> contestacionExamenFinAll() {
		 try {
			 return contestacionExamenDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteContestacionExamen(Integer id) throws Exception {
		contestacionExamenDao.delete(contestacionExamenDao.findById(id));
	}

	public void saveContestacionExamenAdd(ContestacionExamen obj) { 
		try {
			Integer result = contestacionExamenDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoContestacion());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateContestacionExamen(ContestacionExamen obj) {   
		try {   
			contestacionExamenDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public ContestacionExamen findById(Integer id) {
		try {
			return contestacionExamenDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
