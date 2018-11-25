package edu.ues.ECeL.models.service.expediente.consulta;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.consulta.DetalleTratamiento;

public interface DetalleTratamientoService {
	public void DeleteDetalleTratamiento(Integer id) throws Exception;
	public List<DetalleTratamiento> DetalleTratamientoFinAll();
	public DetalleTratamiento getDetalleTratamientoDetails(String accountNumber);  
	public void SaveDetalleTratamientoAdd(DetalleTratamiento obj);
	public void UpdateDetalleTratamiento(DetalleTratamiento obj);
	public DetalleTratamiento findById(Integer id);
}
