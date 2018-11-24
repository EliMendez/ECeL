package edu.ues.ECeL.models.clinica.rolDao;

import edu.ues.ECeL.models.clinica.rol.Municipio;

public interface MunicipioDao {
	public void insert(Municipio municipio);
    public void update(Municipio municipio);
    public void delete(Integer codigoMunicipio);
    public Municipio read(Integer codigoMunicipio);
}
