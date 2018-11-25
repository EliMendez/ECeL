package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.Enfermedad;

public interface EnfermedadService {
	public void DeleteEnfermedad(Integer id) throws Exception;
	public List<Enfermedad> EnfermedadFinAll();
	public Enfermedad getEnfermedadDetails(String accountNumber);  
	public void SaveEnfermedadAdd(Enfermedad obj);
	public void UpdateEnfermedad(Enfermedad obj);
	public Enfermedad findById(Integer id);
}
