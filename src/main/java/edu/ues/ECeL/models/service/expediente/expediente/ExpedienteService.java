package edu.ues.ECeL.models.service.expediente.expediente;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.expediente.Expediente;

public interface ExpedienteService {
	public void DeleteExpediente(Integer id) throws Exception;
	public List<Expediente> ExpedienteFinAll();
	public Expediente getExpedienteDetails(String accountNumber);  
	public void SaveExpedienteAdd(Expediente obj);
	public void UpdateExpediente(Expediente obj);
	public Expediente findById(Integer id);
}