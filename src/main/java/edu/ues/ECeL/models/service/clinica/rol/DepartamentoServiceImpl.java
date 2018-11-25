package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.rol.DepartamentoDao;
import edu.ues.ECeL.models.entity.clinica.rol.Departamento;

public class DepartamentoServiceImpl extends GenericObjectServiceImpl<Departamento, Integer> implements DepartamentoService {
	
	private static final Logger logger = Logger.getLogger(DepartamentoServiceImpl.class);
	 
	@Autowired
	private DepartamentoDao departamentoDao;
	 
	public Departamento getDepartamentoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getDepartamentoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return departamentoDao.getDepartamentoDetails(accountNumber);    
	 }

	public List<Departamento> departamentoFinAll() {
		 try {
			 return departamentoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteDepartamento(Integer id) throws Exception {
		departamentoDao.delete(departamentoDao.findById(id));
	}

	public void saveDepartamentoAdd(Departamento obj) { 
		try {
			Integer result = departamentoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoDepartamento());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateDepartamento(Departamento obj) {   
		try {   
			departamentoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Departamento findById(Integer id) {
		try {
			return departamentoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
