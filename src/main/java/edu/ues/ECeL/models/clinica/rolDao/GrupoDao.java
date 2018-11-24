package edu.ues.ECeL.models.clinica.rolDao;

import edu.ues.ECeL.models.clinica.rol.Grupo;

public interface GrupoDao {
	public void insert(Grupo grupo);
    public void update(Grupo grupo);
    public void delete(Integer codigoGrupo);
    public Grupo read(Integer codigoGrupo);
}
