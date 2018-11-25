package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenExamenes;

public interface OrdenExamenesDao {
	public void insert(OrdenExamenes ordenExamenes);
    public void update(OrdenExamenes ordenExamenes);
    public void delete(Integer codigoOrdenExamenes);
    public OrdenExamenes read(Integer codigoOrdenExamenes);
}
