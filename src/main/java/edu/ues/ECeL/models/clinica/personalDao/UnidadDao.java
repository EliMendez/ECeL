package edu.ues.ECeL.models.clinica.personalDao;

import edu.ues.ECeL.models.clinica.personal.Unidad;

public interface UnidadDao {
	public void insert(Unidad unidad);
    public void update(Unidad unidad);
    public void delete(Integer codigoUnidad);
    public Unidad read(Integer codigoUnidad);
}
