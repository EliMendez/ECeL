package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.personal.UnidadDao;
import edu.ues.ECeL.models.entity.clinica.personal.Unidad;

public class UnidadServiceImpl extends GenericObjectServiceImpl<Unidad, Integer> implements UnidadService {
	
	private static final Logger logger = Logger.getLogger(UnidadServiceImpl.class);
	 
	@Autowired
	private UnidadDao unidadDao;
	 
	public Unidad getUnidadDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getUnidadDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return unidadDao.getUnidadDetails(accountNumber);    
	 }

	public List<Unidad> unidadFinAll() {
		 try {
			 return unidadDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteUnidad(Integer id) throws Exception {
		unidadDao.delete(unidadDao.findById(id));
	}

	public void saveUnidadAdd(Unidad obj) { 
		try {
			Integer result = unidadDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoUnidad());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateUnidad(Unidad obj) {   
		try {   
			unidadDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Unidad findById(Integer id) {
		try {
			return unidadDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
