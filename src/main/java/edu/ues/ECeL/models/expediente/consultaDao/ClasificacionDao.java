package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.Clasificacion;

public interface ClasificacionDao {
	public void insert(Clasificacion clasificacion);
    public void update(Clasificacion clasificacion);
    public void delete(Integer codigoClasificacion);
    public Clasificacion read(Integer codigoClasificacion);
}
