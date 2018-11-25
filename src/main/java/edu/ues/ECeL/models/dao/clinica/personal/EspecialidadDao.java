package edu.ues.ECeL.models.dao.clinica.personal;

import edu.ues.ECeL.models.entity.clinica.personal.Especialidad;

public interface EspecialidadDao {
	public void insert(Especialidad especialidad);
    public void update(Especialidad especialidad);
    public void delete(Integer codigoEspecialidad);
    public Especialidad read(Integer codigoEspecialidad);
}
