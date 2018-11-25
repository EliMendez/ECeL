package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.Clasificacion;

public interface ClasificacionDao {
	public void insert(Clasificacion clasificacion);
    public void update(Clasificacion clasificacion);
    public void delete(Integer codigoClasificacion);
    public Clasificacion read(Integer codigoClasificacion);
}
