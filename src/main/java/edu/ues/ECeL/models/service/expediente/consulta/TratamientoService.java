package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.Tratamiento;

public interface TratamientoService {
	public void DeleteTratamiento(Integer id) throws Exception;
	public List<Tratamiento> TratamientoFinAll();
	public Tratamiento getTratamientoDetails(String accountNumber);  
	public void SaveTratamientoAdd(Tratamiento obj);
	public void UpdateTratamiento(Tratamiento obj);
	public Tratamiento findById(Integer id);
}

