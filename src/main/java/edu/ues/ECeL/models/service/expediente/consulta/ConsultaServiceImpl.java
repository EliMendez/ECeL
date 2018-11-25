package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.expediente.consulta.ConsultaDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Consulta;

public class ConsultaServiceImpl extends GenericObjectServiceImpl<Consulta, Integer> implements ConsultaService {
	
	private static final Logger logger = Logger.getLogger(ConsultaServiceImpl.class);
	 
	@Autowired
	private ConsultaDao consultaDao;
	 
	public Consulta getConsultaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getConsultaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return consultaDao.getConsultaDetails(accountNumber);    
	 }

	public List<Consulta> consultaFinAll() {
		 try {
			 return consultaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteConsulta(Integer id) throws Exception {
		consultaDao.delete(consultaDao.findById(id));
	}

	public void saveConsultaAdd(Consulta obj) { 
		try {
			Integer result = consultaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoConsulta());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateConsulta(Consulta obj) {   
		try {   
			consultaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Consulta findById(Integer id) {
		try {
			return consultaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
