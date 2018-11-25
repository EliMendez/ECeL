package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.DetalleTratamiento;

public interface DetalleTratamientoDao {
	public void insert(DetalleTratamiento detalleTratamiento);
    public void update(DetalleTratamiento detalleTratamiento);
    public void delete(Integer codigoDetalleTratamiento);
    public DetalleTratamiento read(Integer codigoDetalleTratamiento);
}
