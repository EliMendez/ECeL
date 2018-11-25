package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.rol.PermisoDao;
import edu.ues.ECeL.models.entity.clinica.rol.Permiso;

public class PermisoServiceImpl extends GenericObjectServiceImpl<Permiso, Integer> implements PermisoService {
	
	private static final Logger logger = Logger.getLogger(PermisoServiceImpl.class);
	 
	@Autowired
	private PermisoDao permisoDao;
	 
	public Permiso getPermisoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getPermisoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return permisoDao.getPermisoDetails(accountNumber);    
	 }

	public List<Permiso> permisoFinAll() {
		 try {
			 return permisoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deletePermiso(Integer id) throws Exception {
		permisoDao.delete(permisoDao.findById(id));
	}

	public void savePermisoAdd(Permiso obj) { 
		try {
			Integer result = permisoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoPermiso());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updatePermiso(Permiso obj) {   
		try {   
			permisoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Permiso findById(Integer id) {
		try {
			return permisoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
