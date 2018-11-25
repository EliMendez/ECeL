package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.models.entity.clinica.rol.Municipio;

public interface MunicipioDao {
	public void insert(Municipio municipio);
    public void update(Municipio municipio);
    public void delete(Integer codigoMunicipio);
    public Municipio read(Integer codigoMunicipio);
}
