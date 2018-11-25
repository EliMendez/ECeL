package edu.ues.ECeL.models.service.clinica.examen;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.examen.DetalleOrdenExamenesDao;
import edu.ues.ECeL.models.entity.clinica.examen.DetalleOrdenExamenes;

public class DetalleOrdenExamenesServiceImpl extends GenericObjectServiceImpl<DetalleOrdenExamenes, Integer> implements DetalleOrdenExamenesService {
	
	private static final Logger logger = Logger.getLogger(DetalleOrdenExamenesServiceImpl.class);
	 
	@Autowired
	private DetalleOrdenExamenesDao detalleOrdenDao;
	 
	public DetalleOrdenExamenes getDetalleOrdenExamenesDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getDetalleOrdenExamenesDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return detalleOrdenDao.getDetalleOrdenExamenesDetails(accountNumber);    
	 }

	public List<DetalleOrdenExamenes> detalleOrdenFinAll() {
		 try {
			 return detalleOrdenDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteDetalleOrdenExamenes(Integer id) throws Exception {
		detalleOrdenDao.delete(detalleOrdenDao.findById(id));
	}

	public void saveDetalleOrdenExamenesAdd(DetalleOrdenExamenes obj) { 
		try {
			Integer result = detalleOrdenDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoDetalleExamen());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateDetalleOrdenExamenes(DetalleOrdenExamenes obj) {   
		try {   
			detalleOrdenDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public DetalleOrdenExamenes findById(Integer id) {
		try {
			return detalleOrdenDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
