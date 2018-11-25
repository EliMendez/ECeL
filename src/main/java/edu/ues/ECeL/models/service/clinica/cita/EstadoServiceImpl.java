package edu.ues.ECeL.models.service.clinica.cita;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.cita.EstadoDao;
import edu.ues.ECeL.models.entity.clinica.cita.Estado;

public class EstadoServiceImpl extends GenericObjectServiceImpl<Estado, Integer> implements EstadoService {
	
	private static final Logger logger = Logger.getLogger(EstadoServiceImpl.class);
	 
	@Autowired
	private EstadoDao estadoDao;
	 
	public Estado getEstadoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getEstadoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return estadoDao.getEstadoDetails(accountNumber);    
	 }

	public List<Estado> estadoFinAll() {
		 try {
			 return estadoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteEstado(Integer id) throws Exception {
		estadoDao.delete(estadoDao.findById(id));
	}

	public void saveEstadoAdd(Estado obj) { 
		try {
			Integer result = estadoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoEstado());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateEstado(Estado obj) {   
		try {   
			estadoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Estado findById(Integer id) {
		try {
			return estadoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
