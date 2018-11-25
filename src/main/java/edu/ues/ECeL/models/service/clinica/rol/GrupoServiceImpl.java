package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.rol.GrupoDao;
import edu.ues.ECeL.models.entity.clinica.rol.Grupo;

public class GrupoServiceImpl extends GenericObjectServiceImpl<Grupo, Integer> implements GrupoService {
	
	private static final Logger logger = Logger.getLogger(GrupoServiceImpl.class);
	 
	@Autowired
	private GrupoDao grupoDao;
	 
	public Grupo getGrupoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getGrupoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return grupoDao.getGrupoDetails(accountNumber);    
	 }

	public List<Grupo> grupoFinAll() {
		 try {
			 return grupoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteGrupo(Integer id) throws Exception {
		grupoDao.delete(grupoDao.findById(id));
	}

	public void saveGrupoAdd(Grupo obj) { 
		try {
			Integer result = grupoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoGrupo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateGrupo(Grupo obj) {   
		try {   
			grupoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Grupo findById(Integer id) {
		try {
			return grupoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
