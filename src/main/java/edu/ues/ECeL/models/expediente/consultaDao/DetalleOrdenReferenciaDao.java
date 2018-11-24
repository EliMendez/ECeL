package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.DetalleOrdenReferencia;

public interface DetalleOrdenReferenciaDao {
	public void insert(DetalleOrdenReferencia detalleOrdenReferencia);
    public void update(DetalleOrdenReferencia detalleOrdenReferencia);
    public void delete(Integer codigoDetalleReferencia);
    public DetalleOrdenReferencia read(Integer codigoDetalleReferencia);
}
