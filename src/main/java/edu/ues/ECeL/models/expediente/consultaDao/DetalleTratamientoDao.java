package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.DetalleTratamiento;

public interface DetalleTratamientoDao {
	public void insert(DetalleTratamiento detalleTratamiento);
    public void update(DetalleTratamiento detalleTratamiento);
    public void delete(Integer codigoDetalleTratamiento);
    public DetalleTratamiento read(Integer codigoDetalleTratamiento);
}
