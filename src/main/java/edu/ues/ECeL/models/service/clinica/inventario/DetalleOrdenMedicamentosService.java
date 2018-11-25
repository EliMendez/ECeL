package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.inventario.DetalleOrdenMedicamentos;

public interface DetalleOrdenMedicamentosService {
	public void DeleteDetalleOrdenMedicamentos(Integer id) throws Exception;
	public List<DetalleOrdenMedicamentos> DetalleOrdenMedicamentosFinAll();
	public DetalleOrdenMedicamentos getDetalleOrdenMedicamentosDetails(String accountNumber);  
	public void SaveDetalleOrdenMedicamentosAdd(DetalleOrdenMedicamentos obj);
	public void UpdateDetalleOrdenMedicamentos(DetalleOrdenMedicamentos obj);
	public DetalleOrdenMedicamentos findById(Integer id);
}
