package edu.ues.ECeL.models.expediente.expedienteDao;

import edu.ues.ECeL.models.expediente.expediente.HistoriaClinica;

public interface HistoriaClinicaDao {
	public void insert(HistoriaClinica historiaClinica);
    public void update(HistoriaClinica historiaClinica);
    public void delete(Integer codigoHistoria);
    public HistoriaClinica read(Integer codigoHistoria);
}
