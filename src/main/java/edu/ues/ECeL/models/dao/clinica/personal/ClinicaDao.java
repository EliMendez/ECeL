package edu.ues.ECeL.models.dao.clinica.personal;

import edu.ues.ECeL.models.entity.clinica.personal.Clinica;

public interface ClinicaDao {
	public void insert(Clinica clinica);
    public void update(Clinica clinica);
    public void delete(Integer codigoClinica);
    public Clinica read(Integer codigoClinica);
}
