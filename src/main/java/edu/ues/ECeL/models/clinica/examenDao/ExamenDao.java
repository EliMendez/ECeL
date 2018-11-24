package edu.ues.ECeL.models.clinica.examenDao;

import edu.ues.ECeL.models.clinica.examen.Examen;

public interface ExamenDao {
	public void insert(Examen examen);
    public void update(Examen examen);
    public void delete(Integer codigoExamen);
    public Examen read(Integer codigoExamen);
}
