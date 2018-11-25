package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.personal.EmpleadoDao;
import edu.ues.ECeL.models.entity.clinica.personal.Empleado;

public class EmpleadoServiceImpl extends GenericObjectServiceImpl<Empleado, Integer> implements EmpleadoService {
	
	private static final Logger logger = Logger.getLogger(EmpleadoServiceImpl.class);
	 
	@Autowired
	private EmpleadoDao empleadoDao;
	 
	public Empleado getEmpleadoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getEmpleadoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return empleadoDao.getEmpleadoDetails(accountNumber);    
	 }

	public List<Empleado> empleadoFinAll() {
		 try {
			 return empleadoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteEmpleado(Integer id) throws Exception {
		empleadoDao.delete(empleadoDao.findById(id));
	}

	public void saveEmpleadoAdd(Empleado obj) { 
		try {
			Integer result = empleadoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoEmpleado());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateEmpleado(Empleado obj) {   
		try {   
			empleadoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Empleado findById(Integer id) {
		try {
			return empleadoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

