package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.OrdenReferencias;

public interface OrdenReferenciasDao {
	public void insert(OrdenReferencias ordenReferencias);
    public void update(OrdenReferencias ordenReferencias);
    public void delete(Integer codigoReferencia);
    public OrdenReferencias read(Integer codigoReferencia);
}
