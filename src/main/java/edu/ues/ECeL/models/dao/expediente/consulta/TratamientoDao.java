package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.Tratamiento;

public interface TratamientoDao {
	public void insert(Tratamiento tratamiento);
    public void update(Tratamiento tratamiento);
    public void delete(Integer codigoTratamiento);
    public Tratamiento read(Integer codigoTratamiento);
}
