package edu.ues.ECeL.models.service.clinica.cita;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.cita.Estado;

public interface EstadoService {
	public void DeleteEstado(Integer id) throws Exception;
	public List<Estado> EstadoFinAll();
	public Estado getEstadoDetails(String accountNumber);  
	public void SaveEstadoAdd(Estado obj);
	public void UpdateEstado(Estado obj);
	public Estado findById(Integer id);
}

