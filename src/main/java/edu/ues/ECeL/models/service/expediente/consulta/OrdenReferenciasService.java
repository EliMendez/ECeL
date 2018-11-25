package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenReferencias;

public interface OrdenReferenciasService {
	public void DeleteOrdenReferencias(Integer id) throws Exception;
	public List<OrdenReferencias> OrdenReferenciasFinAll();
	public OrdenReferencias getOrdenReferenciasDetails(String accountNumber);  
	public void SaveOrdenReferenciasAdd(OrdenReferencias obj);
	public void UpdateOrdenReferencias(OrdenReferencias obj);
	public OrdenReferencias findById(Integer id);
}
