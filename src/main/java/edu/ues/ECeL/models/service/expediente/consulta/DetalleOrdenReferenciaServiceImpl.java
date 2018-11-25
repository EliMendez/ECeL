package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.DetalleOrdenReferenciaDao;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleOrdenReferencia;

public class DetalleOrdenReferenciaServiceImpl extends GenericObjectServiceImpl<DetalleOrdenReferencia, Integer> implements DetalleOrdenReferenciaService {
	
	private static final Logger logger = Logger.getLogger(DetalleOrdenReferenciaServiceImpl.class);
	 
	@Autowired
	private DetalleOrdenReferenciaDao detalleReferenciaDao;
	 
	public DetalleOrdenReferencia getDetalleOrdenReferenciaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getDetalleOrdenReferenciaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return detalleReferenciaDao.getDetalleOrdenReferenciaDetails(accountNumber);    
	 }

	public List<DetalleOrdenReferencia> detalleReferenciaFinAll() {
		 try {
			 return detalleReferenciaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteDetalleOrdenReferencia(Integer id) throws Exception {
		detalleReferenciaDao.delete(detalleReferenciaDao.findById(id));
	}

	public void saveDetalleOrdenReferenciaAdd(DetalleOrdenReferencia obj) { 
		try {
			Integer result = detalleReferenciaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoDetalleReferencia());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateDetalleOrdenReferencia(DetalleOrdenReferencia obj) {   
		try {   
			detalleReferenciaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public DetalleOrdenReferencia findById(Integer id) {
		try {
			return detalleReferenciaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
