package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.TratamientoDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Tratamiento;

public class TratamientoServiceImpl extends GenericObjectServiceImpl<Tratamiento, Integer> implements TratamientoService {
	
	private static final Logger logger = Logger.getLogger(TratamientoServiceImpl.class);
	 
	@Autowired
	private TratamientoDao tratamientoDao;
	 
	public Tratamiento getTratamientoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getTratamientoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return tratamientoDao.getTratamientoDetails(accountNumber);    
	 }

	public List<Tratamiento> tratamientoFinAll() {
		 try {
			 return tratamientoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteTratamiento(Integer id) throws Exception {
		tratamientoDao.delete(tratamientoDao.findById(id));
	}

	public void saveTratamientoAdd(Tratamiento obj) { 
		try {
			Integer result = tratamientoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoTratamiento());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateTratamiento(Tratamiento obj) {   
		try {   
			tratamientoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Tratamiento findById(Integer id) {
		try {
			return tratamientoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
