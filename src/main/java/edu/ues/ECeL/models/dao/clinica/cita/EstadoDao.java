package edu.ues.ECeL.models.dao.clinica.cita;

import edu.ues.ECeL.models.entity.clinica.cita.Estado;

public interface EstadoDao {
	public void insert(Estado estado);
    public void update(Estado estado);
    public void delete(Integer codigoEstado);
    public Estado read(Integer codigoEstado);
}
