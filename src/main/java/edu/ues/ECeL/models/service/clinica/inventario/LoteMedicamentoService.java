package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.inventario.LoteMedicamento;

public interface LoteMedicamentoService {
	public void DeleteLoteMedicamento(Integer id) throws Exception;
	public List<LoteMedicamento> LoteMedicamentoFinAll();
	public LoteMedicamento getLoteMedicamentoDetails(String accountNumber);  
	public void SaveLoteMedicamentoAdd(LoteMedicamento obj);
	public void UpdateLoteMedicamento(LoteMedicamento obj);
	public LoteMedicamento findById(Integer id);
}

