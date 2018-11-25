package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.inventario.Medicamento;

public interface MedicamentoService {
	public void DeleteMedicamento(Integer id) throws Exception;
	public List<Medicamento> MedicamentoFinAll();
	public Medicamento getMedicamentoDetails(String accountNumber);  
	public void SaveMedicamentoAdd(Medicamento obj);
	public void UpdateMedicamento(Medicamento obj);
	public Medicamento findById(Integer id);
}
