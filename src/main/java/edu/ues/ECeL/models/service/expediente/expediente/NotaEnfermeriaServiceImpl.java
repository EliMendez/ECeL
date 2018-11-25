package edu.ues.ECeL.models.service.expediente.expediente;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.expediente.NotaEnfermeriaDao;
import edu.ues.ECeL.models.entity.expediente.expediente.NotaEnfermeria;

public class NotaEnfermeriaServiceImpl extends GenericObjectServiceImpl<NotaEnfermeria, Integer> implements NotaEnfermeriaService {
	
	private static final Logger logger = Logger.getLogger(NotaEnfermeriaServiceImpl.class);
	 
	@Autowired
	private NotaEnfermeriaDao notaEnfermeriaDao;
	 
	public NotaEnfermeria getNotaEnfermeriaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getNotaEnfermeriaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return notaEnfermeriaDao.getNotaEnfermeriaDetails(accountNumber);    
	 }

	public List<NotaEnfermeria> notaEnfermeriaFinAll() {
		 try {
			 return notaEnfermeriaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteNotaEnfermeria(Integer id) throws Exception {
		notaEnfermeriaDao.delete(notaEnfermeriaDao.findById(id));
	}

	public void saveNotaEnfermeriaAdd(NotaEnfermeria obj) { 
		try {
			Integer result = notaEnfermeriaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoNotaEnfermeria());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateNotaEnfermeria(NotaEnfermeria obj) {   
		try {   
			notaEnfermeriaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public NotaEnfermeria findById(Integer id) {
		try {
			return notaEnfermeriaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
