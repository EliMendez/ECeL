package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.OrdenExamenesDao;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenExamenes;

public class OrdenExamenesServiceImpl extends GenericObjectServiceImpl<OrdenExamenes, Integer> implements OrdenExamenesService {
	
	private static final Logger logger = Logger.getLogger(OrdenExamenesServiceImpl.class);
	 
	@Autowired
	private OrdenExamenesDao ordenExamenesDao;
	 
	public OrdenExamenes getOrdenExamenesDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getOrdenExamenesDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return ordenExamenesDao.getOrdenExamenesDetails(accountNumber);    
	 }

	public List<OrdenExamenes> ordenExamenesFinAll() {
		 try {
			 return ordenExamenesDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteOrdenExamenes(Integer id) throws Exception {
		ordenExamenesDao.delete(ordenExamenesDao.findById(id));
	}

	public void saveOrdenExamenesAdd(OrdenExamenes obj) { 
		try {
			Integer result = ordenExamenesDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoOrdenExamenes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateOrdenExamenes(OrdenExamenes obj) {   
		try {   
			ordenExamenesDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public OrdenExamenes findById(Integer id) {
		try {
			return ordenExamenesDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
