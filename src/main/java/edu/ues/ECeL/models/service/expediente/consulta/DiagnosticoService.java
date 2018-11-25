package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.Diagnostico;

public interface DiagnosticoService {
	public void DeleteDiagnostico(Integer id) throws Exception;
	public List<Diagnostico> DiagnosticoFinAll();
	public Diagnostico getDiagnosticoDetails(String accountNumber);  
	public void SaveDiagnosticoAdd(Diagnostico obj);
	public void UpdateDiagnostico(Diagnostico obj);
	public Diagnostico findById(Integer id);
}
