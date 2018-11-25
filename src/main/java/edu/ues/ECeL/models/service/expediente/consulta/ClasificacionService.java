package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.Clasificacion;

public interface ClasificacionService {
	public void DeleteClasificacion(Integer id) throws Exception;
	public List<Clasificacion> ClasificacionFinAll();
	public Clasificacion getClasificacionDetails(String accountNumber);  
	public void SaveClasificacionAdd(Clasificacion obj);
	public void UpdateClasificacion(Clasificacion obj);
	public Clasificacion findById(Integer id);
}