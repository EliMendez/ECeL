package edu.ues.ECeL.models.clinica.rolDao;

import edu.ues.ECeL.models.clinica.rol.Departamento;

public interface DepartamentoDao {
	public void insert(Departamento departamento);
    public void update(Departamento departamento);
    public void delete(Integer codigoDepartamento);
    public Departamento read(Integer codigoDepartamento);
}
