package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.rol.TipoContenidoDao;
import edu.ues.ECeL.models.entity.clinica.rol.TipoContenido;

public class TipoContenidoServiceImpl extends GenericObjectServiceImpl<TipoContenido, Integer> implements TipoContenidoService {
	
	private static final Logger logger = Logger.getLogger(TipoContenidoServiceImpl.class);
	 
	@Autowired
	private TipoContenidoDao tipoContenidoDao;
	 
	public TipoContenido getTipoContenidoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getTipoContenidoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return tipoContenidoDao.getTipoContenidoDetails(accountNumber);    
	 }

	public List<TipoContenido> tipoContenidoFinAll() {
		 try {
			 return tipoContenidoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteTipoContenido(Integer id) throws Exception {
		tipoContenidoDao.delete(tipoContenidoDao.findById(id));
	}

	public void saveTipoContenidoAdd(TipoContenido obj) { 
		try {
			Integer result = tipoContenidoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoTipoContenido());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateTipoContenido(TipoContenido obj) {   
		try {   
			tipoContenidoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public TipoContenido findById(Integer id) {
		try {
			return tipoContenidoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
