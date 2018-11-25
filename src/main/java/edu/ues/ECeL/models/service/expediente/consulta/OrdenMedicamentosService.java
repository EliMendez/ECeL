package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenMedicamentos;

public interface OrdenMedicamentosService {
	public void DeleteOrdenMedicamentos(Integer id) throws Exception;
	public List<OrdenMedicamentos> OrdenMedicamentosFinAll();
	public OrdenMedicamentos getOrdenMedicamentosDetails(String accountNumber);  
	public void SaveOrdenMedicamentosAdd(OrdenMedicamentos obj);
	public void UpdateOrdenMedicamentos(OrdenMedicamentos obj);
	public OrdenMedicamentos findById(Integer id);
}
