package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.rol.MunicipioDao;
import edu.ues.ECeL.models.entity.clinica.rol.Municipio;

public class MunicipioServiceImpl extends GenericObjectServiceImpl<Municipio, Integer> implements MunicipioService {
	
	private static final Logger logger = Logger.getLogger(MunicipioServiceImpl.class);
	 
	@Autowired
	private MunicipioDao municipioDao;
	 
	public Municipio getMunicipioDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getMunicipioDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return municipioDao.getMunicipioDetails(accountNumber);    
	 }

	public List<Municipio> municipioFinAll() {
		 try {
			 return municipioDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteMunicipio(Integer id) throws Exception {
		municipioDao.delete(municipioDao.findById(id));
	}

	public void saveMunicipioAdd(Municipio obj) { 
		try {
			Integer result = municipioDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoMunicipio());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateMunicipio(Municipio obj) {   
		try {   
			municipioDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Municipio findById(Integer id) {
		try {
			return municipioDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
