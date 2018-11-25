package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.SignosVitales;

public interface SignosVitalesService {
	public void DeleteSignosVitales(Integer id) throws Exception;
	public List<SignosVitales> SignosVitalesFinAll();
	public SignosVitales getSignosVitalesDetails(String accountNumber);  
	public void SaveSignosVitalesAdd(SignosVitales obj);
	public void UpdateSignosVitales(SignosVitales obj);
	public SignosVitales findById(Integer id);
}
