package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.inventario.FabricanteDao;
import edu.ues.ECeL.models.entity.clinica.inventario.Fabricante;

public class FabricanteServiceImpl extends GenericObjectServiceImpl<Fabricante, Integer> implements FabricanteService {
	
	private static final Logger logger = Logger.getLogger(FabricanteServiceImpl.class);
	 
	@Autowired
	private FabricanteDao fabricanteDao;
	 
	public Fabricante getFabricanteDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getFabricanteDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return fabricanteDao.getFabricanteDetails(accountNumber);    
	 }

	public List<Fabricante> fabricanteFinAll() {
		 try {
			 return fabricanteDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteFabricante(Integer id) throws Exception {
		fabricanteDao.delete(fabricanteDao.findById(id));
	}

	public void saveFabricanteAdd(Fabricante obj) { 
		try {
			Integer result = fabricanteDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoFabricante());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateFabricante(Fabricante obj) {   
		try {   
			fabricanteDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Fabricante findById(Integer id) {
		try {
			return fabricanteDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

