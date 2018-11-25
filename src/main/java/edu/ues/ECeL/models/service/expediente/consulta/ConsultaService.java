package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.Consulta;

public interface ConsultaService {
	public void DeleteConsulta(Integer id) throws Exception;
	public List<Consulta> ConsultaFinAll();
	public Consulta getConsultaDetails(String accountNumber);  
	public void SaveConsultaAdd(Consulta obj);
	public void UpdateConsulta(Consulta obj);
	public Consulta findById(Integer id);
}
