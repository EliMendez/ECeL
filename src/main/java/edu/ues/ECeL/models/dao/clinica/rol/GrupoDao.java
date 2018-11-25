package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.models.entity.clinica.rol.Grupo;

public interface GrupoDao {
	public void insert(Grupo grupo);
    public void update(Grupo grupo);
    public void delete(Integer codigoGrupo);
    public Grupo read(Integer codigoGrupo);
}
