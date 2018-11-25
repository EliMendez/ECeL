package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.DetalleChequeFisico;

public interface DetalleChequeFisicoDao {
	public void insert(DetalleChequeFisico detalleChequeFisico);
    public void update(DetalleChequeFisico detalleChequeFisico);
    public void delete(Integer codigoChequeo);
    public DetalleChequeFisico read(Integer codigoChequeo);
}
