package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.Incapacidad;

public interface IncapacidadDao {
	public void insert(Incapacidad incapacidad);
    public void update(Incapacidad incapacidad);
    public void delete(Integer codigoIncapacidad);
    public Incapacidad read(Integer codigoIncapacidad);
}
