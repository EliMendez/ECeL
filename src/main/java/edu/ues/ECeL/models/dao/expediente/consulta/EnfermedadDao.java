package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.Enfermedad;

public interface EnfermedadDao {
	public void insert(Enfermedad enfermedad);
    public void update(Enfermedad enfermedad);
    public void delete(Integer codigoEnfermedad);
    public Enfermedad read(Integer codigoEnfermedad);
}
