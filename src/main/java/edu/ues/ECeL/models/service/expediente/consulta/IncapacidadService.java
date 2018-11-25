package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.Incapacidad;

public interface IncapacidadService {
	public void DeleteIncapacidad(Integer id) throws Exception;
	public List<Incapacidad> IncapacidadFinAll();
	public Incapacidad getIncapacidadDetails(String accountNumber);  
	public void SaveIncapacidadAdd(Incapacidad obj);
	public void UpdateIncapacidad(Incapacidad obj);
	public Incapacidad findById(Integer id);
}
