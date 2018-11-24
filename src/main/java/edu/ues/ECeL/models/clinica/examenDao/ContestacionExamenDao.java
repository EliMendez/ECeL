package edu.ues.ECeL.models.clinica.examenDao;

import edu.ues.ECeL.models.clinica.examen.ContestacionExamen;

public interface ContestacionExamenDao {

	public void insert(ContestacionExamen contestacionExamen);
    public void update(ContestacionExamen contestacionExamen);
    public void delete(Integer codigoContestacion);
    public ContestacionExamen read(Integer codigoContestacion);
}