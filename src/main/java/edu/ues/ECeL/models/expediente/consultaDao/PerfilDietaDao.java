package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.PerfilDieta;

public interface PerfilDietaDao {
	public void insert(PerfilDieta perfilDieta);
    public void update(PerfilDieta perfilDieta);
    public void delete(Integer codigoDieta);
    public PerfilDieta read(Integer codigoDieta);
}
