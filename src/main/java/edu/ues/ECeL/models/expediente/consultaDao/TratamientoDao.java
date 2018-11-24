package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.Tratamiento;

public interface TratamientoDao {
	public void insert(Tratamiento tratamiento);
    public void update(Tratamiento tratamiento);
    public void delete(Integer codigoTratamiento);
    public Tratamiento read(Integer codigoTratamiento);
}
