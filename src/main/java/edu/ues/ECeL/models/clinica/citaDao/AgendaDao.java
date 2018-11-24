package edu.ues.ECeL.models.clinica.citaDao;

import edu.ues.ECeL.models.clinica.cita.Agenda;

public interface AgendaDao {
	public void insert(Agenda agenda);
    public void update(Agenda agenda);
    public void delete(Integer codigoAgenda);
    public Agenda read(Integer codigoAgenda);
}
