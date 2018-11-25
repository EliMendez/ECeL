package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.DetalleOrdenReferencia;

public interface DetalleOrdenReferenciaService {
	public void DeleteDetalleOrdenReferencia(Integer id) throws Exception;
	public List<DetalleOrdenReferencia> DetalleOrdenReferenciaFinAll();
	public DetalleOrdenReferencia getDetalleOrdenReferenciaDetails(String accountNumber);  
	public void SaveDetalleOrdenReferenciaAdd(DetalleOrdenReferencia obj);
	public void UpdateDetalleOrdenReferencia(DetalleOrdenReferencia obj);
	public DetalleOrdenReferencia findById(Integer id);
}
