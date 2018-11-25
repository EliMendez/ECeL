package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.DetalleChequeoFisicoDao;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleChequeoFisico;

public class DetalleChequeoFisicoServiceImpl extends GenericObjectServiceImpl<DetalleChequeoFisico, Integer> implements DetalleChequeoFisicoService {
	
	private static final Logger logger = Logger.getLogger(DetalleChequeoFisicoServiceImpl.class);
	 
	@Autowired
	private DetalleChequeoFisicoDao detalleChequeoFisicoDao;
	 
	public DetalleChequeoFisico getDetalleChequeoFisicoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getDetalleChequeoFisicoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return detalleChequeoFisicoDao.getDetalleChequeoFisicoDetails(accountNumber);    
	 }

	public List<DetalleChequeoFisico> detalleChequeoFisicoFinAll() {
		 try {
			 return detalleChequeoFisicoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteDetalleChequeoFisico(Integer id) throws Exception {
		detalleChequeoFisicoDao.delete(detalleChequeoFisicoDao.findById(id));
	}

	public void saveDetalleChequeoFisicoAdd(DetalleChequeoFisico obj) { 
		try {
			Integer result = detalleChequeoFisicoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoDetalleChequeoFisico());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateDetalleChequeoFisico(DetalleChequeoFisico obj) {   
		try {   
			detalleChequeoFisicoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public DetalleChequeoFisico findById(Integer id) {
		try {
			return detalleChequeoFisicoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
