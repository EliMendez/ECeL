package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.DetalleChequeoFisico;

public interface DetalleChequeoFisicoService {
	public void DeleteDetalleChequeoFisico(Integer id) throws Exception;
	public List<DetalleChequeoFisico> DetalleChequeoFisicoFinAll();
	public DetalleChequeoFisico getDetalleChequeoFisicoDetails(String accountNumber);  
	public void SaveDetalleChequeoFisicoAdd(DetalleChequeoFisico obj);
	public void UpdateDetalleChequeoFisico(DetalleChequeoFisico obj);
	public DetalleChequeoFisico findById(Integer id);
}
