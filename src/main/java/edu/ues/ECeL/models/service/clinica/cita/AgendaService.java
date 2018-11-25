package edu.ues.ECeL.models.service.clinica.cita;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.cita.Agenda;

public interface AgendaService {
	public void DeleteAgenda(Integer id) throws Exception;
	public List<Agenda> AgendaFinAll();
	public Agenda getAgendaDetails(String accountNumber);  
	public void SaveAgendaAdd(Agenda obj);
	public void UpdateAgenda(Agenda obj);
	public Agenda findById(Integer id);
}
