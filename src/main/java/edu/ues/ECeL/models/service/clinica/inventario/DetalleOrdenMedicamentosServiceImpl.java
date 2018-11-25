package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.inventario.DetalleOrdenMedicamentosDao;
import edu.ues.ECeL.models.entity.clinica.inventario.DetalleOrdenMedicamentos;

public class DetalleOrdenMedicamentosServiceImpl extends GenericObjectServiceImpl<DetalleOrdenMedicamentos, Integer> implements DetalleOrdenMedicamentosService {
	
	private static final Logger logger = Logger.getLogger(DetalleOrdenMedicamentosServiceImpl.class);
	 
	@Autowired
	private DetalleOrdenMedicamentosDao detalleOrdenDao;
	 
	public DetalleOrdenMedicamentos getDetalleOrdenMedicamentosDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getDetalleOrdenMedicamentosDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return detalleOrdenDao.getDetalleOrdenMedicamentosDetails(accountNumber);    
	 }

	public List<DetalleOrdenMedicamentos> detalleOrdenFinAll() {
		 try {
			 return detalleOrdenDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteDetalleOrdenMedicamentos(Integer id) throws Exception {
		detalleOrdenDao.delete(detalleOrdenDao.findById(id));
	}

	public void saveDetalleOrdenMedicamentosAdd(DetalleOrdenMedicamentos obj) { 
		try {
			Integer result = detalleOrdenDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoDetalleOrdenMedicamento());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateDetalleOrdenMedicamentos(DetalleOrdenMedicamentos obj) {   
		try {   
			detalleOrdenDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public DetalleOrdenMedicamentos findById(Integer id) {
		try {
			return detalleOrdenDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
