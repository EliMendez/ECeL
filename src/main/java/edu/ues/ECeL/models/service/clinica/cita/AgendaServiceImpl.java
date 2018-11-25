package edu.ues.ECeL.models.service.clinica.cita;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.cita.AgendaDao;
import edu.ues.ECeL.models.entity.clinica.cita.Agenda;

public class AgendaServiceImpl extends GenericObjectServiceImpl<Agenda, Integer> implements AgendaService {
	
	private static final Logger logger = Logger.getLogger(AgendaServiceImpl.class);
	 
	@Autowired
	private AgendaDao agendaDao;
	 
	public Agenda getAgendaDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getAgendaDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return agendaDao.getAgendaDetails(accountNumber);    
	 }

	public List<Agenda> agendaFinAll() {
		 try {
			 return agendaDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteAgenda(Integer id) throws Exception {
		agendaDao.delete(agendaDao.findById(id));
	}

	public void saveAgendaAdd(Agenda obj) { 
		try {
			Integer result = agendaDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoAgenda());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateAgenda(Agenda obj) {   
		try {   
			agendaDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Agenda findById(Integer id) {
		try {
			return agendaDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
