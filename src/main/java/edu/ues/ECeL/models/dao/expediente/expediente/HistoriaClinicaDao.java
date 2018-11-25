package edu.ues.ECeL.models.dao.expediente.expediente;

import edu.ues.ECeL.models.entity.expediente.expediente.HistoriaClinica;

public interface HistoriaClinicaDao {
	public void insert(HistoriaClinica historiaClinica);
    public void update(HistoriaClinica historiaClinica);
    public void delete(Integer codigoHistoria);
    public HistoriaClinica read(Integer codigoHistoria);
}
