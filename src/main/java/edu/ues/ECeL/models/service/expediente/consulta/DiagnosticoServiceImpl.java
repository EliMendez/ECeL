package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.DiagnosticoDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Diagnostico;

public class DiagnosticoServiceImpl extends GenericObjectServiceImpl<Diagnostico, Integer> implements DiagnosticoService {
	
	private static final Logger logger = Logger.getLogger(DiagnosticoServiceImpl.class);
	 
	@Autowired
	private DiagnosticoDao diagnosticoDao;
	 
	public Diagnostico getDiagnosticoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getDiagnosticoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return diagnosticoDao.getDiagnosticoDetails(accountNumber);    
	 }

	public List<Diagnostico> diagnosticoFinAll() {
		 try {
			 return diagnosticoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteDiagnostico(Integer id) throws Exception {
		diagnosticoDao.delete(diagnosticoDao.findById(id));
	}

	public void saveDiagnosticoAdd(Diagnostico obj) { 
		try {
			Integer result = diagnosticoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoDiagnostico());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateDiagnostico(Diagnostico obj) {   
		try {   
			diagnosticoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Diagnostico findById(Integer id) {
		try {
			return diagnosticoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
