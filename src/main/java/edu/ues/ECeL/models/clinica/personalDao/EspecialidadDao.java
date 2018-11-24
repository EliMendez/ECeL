package edu.ues.ECeL.models.clinica.personalDao;

import edu.ues.ECeL.models.clinica.personal.Especialidad;

public interface EspecialidadDao {
	public void insert(Especialidad especialidad);
    public void update(Especialidad especialidad);
    public void delete(Integer codigoEspecialidad);
    public Especialidad read(Integer codigoEspecialidad);
}
