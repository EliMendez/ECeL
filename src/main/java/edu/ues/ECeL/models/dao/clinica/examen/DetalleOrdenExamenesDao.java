package edu.ues.ECeL.models.dao.clinica.examen;

import edu.ues.ECeL.models.entity.clinica.examen.DetalleOrdenExamenes;

public interface DetalleOrdenExamenesDao {
	public void insert(DetalleOrdenExamenes detalleOrdenExamenes);
    public void update(DetalleOrdenExamenes detalleOrdenExamenes);
    public void delete(Integer codigoDetalleExamen);
    public DetalleOrdenExamenes read(Integer codigoDetalleExamen);
}
