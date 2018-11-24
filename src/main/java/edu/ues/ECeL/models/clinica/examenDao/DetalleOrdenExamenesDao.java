package edu.ues.ECeL.models.clinica.examenDao;

import edu.ues.ECeL.models.clinica.examen.DetalleOrdenExamenes;

public interface DetalleOrdenExamenesDao {
	public void insert(DetalleOrdenExamenes detalleOrdenExamenes);
    public void update(DetalleOrdenExamenes detalleOrdenExamenes);
    public void delete(Integer codigoDetalleExamen);
    public DetalleOrdenExamenes read(Integer codigoDetalleExamen);
}
