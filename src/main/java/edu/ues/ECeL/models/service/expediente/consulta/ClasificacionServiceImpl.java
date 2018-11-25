package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.ClasificacionDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Clasificacion;

public class ClasificacionServiceImpl extends GenericObjectServiceImpl<Clasificacion, Integer> implements ClasificacionService {
	
	private static final Logger logger = Logger.getLogger(ClasificacionServiceImpl.class);
	 
	@Autowired
	private ClasificacionDao clasificacionDao;
	 
	public Clasificacion getClasificacionDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getClasificacionDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return clasificacionDao.getClasificacionDetails(accountNumber);    
	 }

	public List<Clasificacion> clasificacionFinAll() {
		 try {
			 return clasificacionDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteClasificacion(Integer id) throws Exception {
		clasificacionDao.delete(clasificacionDao.findById(id));
	}

	public void saveClasificacionAdd(Clasificacion obj) { 
		try {
			Integer result = clasificacionDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoClasificacion());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateClasificacion(Clasificacion obj) {   
		try {   
			clasificacionDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Clasificacion findById(Integer id) {
		try {
			return clasificacionDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
