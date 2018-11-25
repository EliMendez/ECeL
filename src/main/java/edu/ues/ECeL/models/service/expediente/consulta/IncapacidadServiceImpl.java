package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.IncapacidadDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Incapacidad;

public class IncapacidadServiceImpl extends GenericObjectServiceImpl<Incapacidad, Integer> implements IncapacidadService {
	
	private static final Logger logger = Logger.getLogger(IncapacidadServiceImpl.class);
	 
	@Autowired
	private IncapacidadDao incapacidadDao;
	 
	public Incapacidad getIncapacidadDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getIncapacidadDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return incapacidadDao.getIncapacidadDetails(accountNumber);    
	 }

	public List<Incapacidad> incapacidadFinAll() {
		 try {
			 return incapacidadDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteIncapacidad(Integer id) throws Exception {
		incapacidadDao.delete(incapacidadDao.findById(id));
	}

	public void saveIncapacidadAdd(Incapacidad obj) { 
		try {
			Integer result = incapacidadDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoIncapacidad());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateIncapacidad(Incapacidad obj) {   
		try {   
			incapacidadDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Incapacidad findById(Integer id) {
		try {
			return incapacidadDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
