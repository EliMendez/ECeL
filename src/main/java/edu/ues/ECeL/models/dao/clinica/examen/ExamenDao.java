package edu.ues.ECeL.models.dao.clinica.examen;

import edu.ues.ECeL.models.entity.clinica.examen.Examen;

public interface ExamenDao {
	public void insert(Examen examen);
    public void update(Examen examen);
    public void delete(Integer codigoExamen);
    public Examen read(Integer codigoExamen);
}
