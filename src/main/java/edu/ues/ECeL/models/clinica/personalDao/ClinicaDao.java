package edu.ues.ECeL.models.clinica.personalDao;

import edu.ues.ECeL.models.clinica.personal.Clinica;

public interface ClinicaDao {
	public void insert(Clinica clinica);
    public void update(Clinica clinica);
    public void delete(Integer codigoClinica);
    public Clinica read(Integer codigoClinica);
}
