package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.DetalleTratamientoDao;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleTratamiento;

public class DetalleTratamientoServiceImpl extends GenericObjectServiceImpl<DetalleTratamiento, Integer> implements DetalleTratamientoService {
	
	private static final Logger logger = Logger.getLogger(DetalleTratamientoServiceImpl.class);
	 
	@Autowired
	private DetalleTratamientoDao detalleTratamientoDao;
	 
	public DetalleTratamiento getDetalleTratamientoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getDetalleTratamientoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return detalleTratamientoDao.getDetalleTratamientoDetails(accountNumber);    
	 }

	public List<DetalleTratamiento> detalleTratamientoFinAll() {
		 try {
			 return detalleTratamientoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteDetalleTratamiento(Integer id) throws Exception {
		detalleTratamientoDao.delete(detalleTratamientoDao.findById(id));
	}

	public void saveDetalleTratamientoAdd(DetalleTratamiento obj) { 
		try {
			Integer result = detalleTratamientoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoDetalleTratamiento());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateDetalleTratamiento(DetalleTratamiento obj) {   
		try {   
			detalleTratamientoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public DetalleTratamiento findById(Integer id) {
		try {
			return detalleTratamientoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
