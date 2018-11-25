package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.models.entity.clinica.rol.Departamento;

public interface DepartamentoDao {
	public void insert(Departamento departamento);
    public void update(Departamento departamento);
    public void delete(Integer codigoDepartamento);
    public Departamento read(Integer codigoDepartamento);
}
