package edu.ues.ECeL.models.dao.clinica.personal;

import edu.ues.ECeL.models.entity.clinica.personal.Unidad;

public interface UnidadDao {
	public void insert(Unidad unidad);
    public void update(Unidad unidad);
    public void delete(Integer codigoUnidad);
    public Unidad read(Integer codigoUnidad);
}
