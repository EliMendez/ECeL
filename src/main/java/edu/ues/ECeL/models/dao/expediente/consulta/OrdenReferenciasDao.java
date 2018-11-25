package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenReferencias;

public interface OrdenReferenciasDao {
	public void insert(OrdenReferencias ordenReferencias);
    public void update(OrdenReferencias ordenReferencias);
    public void delete(Integer codigoReferencia);
    public OrdenReferencias read(Integer codigoReferencia);
}
