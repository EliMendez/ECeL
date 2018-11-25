package edu.ues.ECeL.models.dao.clinica.cita;

import edu.ues.ECeL.models.entity.clinica.cita.Cita;
public interface CitaDao {

	public void insert(Cita cita);
    public void update(Cita cita);
    public void delete(Integer codigoCita);
    public Cita read(Integer codigoCita);
}
