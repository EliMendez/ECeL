package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.OrdenMedicamentosDao;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenMedicamentos;

public class OrdenMedicamentosServiceImpl extends GenericObjectServiceImpl<OrdenMedicamentos, Integer> implements OrdenMedicamentosService {
	
	private static final Logger logger = Logger.getLogger(OrdenMedicamentosServiceImpl.class);
	 
	@Autowired
	private OrdenMedicamentosDao ordenMedicamentosDao;
	 
	public OrdenMedicamentos getOrdenMedicamentosDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getOrdenMedicamentosDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return ordenMedicamentosDao.getOrdenMedicamentosDetails(accountNumber);    
	 }

	public List<OrdenMedicamentos> ordenMedicamentosFinAll() {
		 try {
			 return ordenMedicamentosDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteOrdenMedicamentos(Integer id) throws Exception {
		ordenMedicamentosDao.delete(ordenMedicamentosDao.findById(id));
	}

	public void saveOrdenMedicamentosAdd(OrdenMedicamentos obj) { 
		try {
			Integer result = ordenMedicamentosDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoOrdenMedicamentos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateOrdenMedicamentos(OrdenMedicamentos obj) {   
		try {   
			ordenMedicamentosDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public OrdenMedicamentos findById(Integer id) {
		try {
			return ordenMedicamentosDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
