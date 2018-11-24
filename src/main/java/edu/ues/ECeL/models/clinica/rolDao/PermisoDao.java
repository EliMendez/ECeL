package edu.ues.ECeL.models.clinica.rolDao;

import edu.ues.ECeL.models.clinica.rol.Permiso;

public interface PermisoDao {
	public void insert(Permiso permiso);
    public void update(Permiso permiso);
    public void delete(Integer codigoPermiso);
    public Permiso read(Integer codigoPermiso);
}
