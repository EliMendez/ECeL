package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.rol.TipoContenido;

public interface TipoContenidoService {
	public void DeleteTipoContenido(Integer id) throws Exception;
	public List<TipoContenido> TipoContenidoFinAll();
	public TipoContenido getTipoContenidoDetails(String accountNumber);  
	public void SaveTipoContenidoAdd(TipoContenido obj);
	public void UpdateTipoContenido(TipoContenido obj);
	public TipoContenido findById(Integer id);
}