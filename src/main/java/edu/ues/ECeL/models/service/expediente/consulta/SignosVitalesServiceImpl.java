package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.SignosVitalesDao;
import edu.ues.ECeL.models.entity.expediente.consulta.SignosVitales;

public class SignosVitalesServiceImpl extends GenericObjectServiceImpl<SignosVitales, Integer> implements SignosVitalesService {
	
	private static final Logger logger = Logger.getLogger(SignosVitalesServiceImpl.class);
	 
	@Autowired
	private SignosVitalesDao signosVitalesDao;
	 
	public SignosVitales getSignosVitalesDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getSignosVitalesDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return signosVitalesDao.getSignosVitalesDetails(accountNumber);    
	 }

	public List<SignosVitales> signosVitalesFinAll() {
		 try {
			 return signosVitalesDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteSignosVitales(Integer id) throws Exception {
		signosVitalesDao.delete(signosVitalesDao.findById(id));
	}

	public void saveSignosVitalesAdd(SignosVitales obj) { 
		try {
			Integer result = signosVitalesDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoSignosVitales());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateSignosVitales(SignosVitales obj) {   
		try {   
			signosVitalesDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public SignosVitales findById(Integer id) {
		try {
			return signosVitalesDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
