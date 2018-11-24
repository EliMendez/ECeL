package edu.ues.ECeL.models.clinica.citaDao;

import edu.ues.ECeL.models.clinica.cita.Cita;
public interface CitaDao {

	public void insert(Cita cita);
    public void update(Cita cita);
    public void delete(Integer codigoCita);
    public Cita read(Integer codigoCita);
}
