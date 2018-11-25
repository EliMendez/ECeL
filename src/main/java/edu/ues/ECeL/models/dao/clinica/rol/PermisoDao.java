package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.models.entity.clinica.rol.Permiso;

public interface PermisoDao {
	public void insert(Permiso permiso);
    public void update(Permiso permiso);
    public void delete(Integer codigoPermiso);
    public Permiso read(Integer codigoPermiso);
}
