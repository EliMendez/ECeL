package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.OrdenReferenciasDao;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenReferencias;

public class OrdenReferenciasServiceImpl extends GenericObjectServiceImpl<OrdenReferencias, Integer> implements OrdenReferenciasService {
	
	private static final Logger logger = Logger.getLogger(OrdenReferenciasServiceImpl.class);
	 
	@Autowired
	private OrdenReferenciasDao ordenReferenciasDao;
	 
	public OrdenReferencias getOrdenReferenciasDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getOrdenReferenciasDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return ordenReferenciasDao.getOrdenReferenciasDetails(accountNumber);    
	 }

	public List<OrdenReferencias> ordenReferenciasFinAll() {
		 try {
			 return ordenReferenciasDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteOrdenReferencias(Integer id) throws Exception {
		ordenReferenciasDao.delete(ordenReferenciasDao.findById(id));
	}

	public void saveOrdenReferenciasAdd(OrdenReferencias obj) { 
		try {
			Integer result = ordenReferenciasDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoReferencia());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateOrdenReferencias(OrdenReferencias obj) {   
		try {   
			ordenReferenciasDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public OrdenReferencias findById(Integer id) {
		try {
			return ordenReferenciasDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
