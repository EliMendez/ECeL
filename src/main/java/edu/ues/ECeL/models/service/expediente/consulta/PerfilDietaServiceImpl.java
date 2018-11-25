package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.PerfilDietaDao;
import edu.ues.ECeL.models.entity.expediente.consulta.PerfilDieta;

public class PerfilDietaServiceImpl extends GenericObjectServiceImpl<PerfilDieta, Integer> implements PerfilDietaService {
	
	private static final Logger logger = Logger.getLogger(PerfilDietaServiceImpl.class);
	 
	@Autowired
	private PerfilDietaDao perfilDietaDao;
	 
	public PerfilDieta getPerfilDietaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getPerfilDietaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return perfilDietaDao.getPerfilDietaDetails(accountNumber);    
	 }

	public List<PerfilDieta> perfilDietaFinAll() {
		 try {
			 return perfilDietaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deletePerfilDieta(Integer id) throws Exception {
		perfilDietaDao.delete(perfilDietaDao.findById(id));
	}

	public void savePerfilDietaAdd(PerfilDieta obj) { 
		try {
			Integer result = perfilDietaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoPerfilDieta());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updatePerfilDieta(PerfilDieta obj) {   
		try {   
			perfilDietaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public PerfilDieta findById(Integer id) {
		try {
			return perfilDietaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
