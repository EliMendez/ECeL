package edu.ues.ECeL.models.clinica.inventarioDao;

import edu.ues.ECeL.models.clinica.inventario.DetalleOrdenMedicamentos;

public interface DetalleOrdenMedicamentosDao {
	public void insert(DetalleOrdenMedicamentos detalleOrdenMedicamentos);
    public void update(DetalleOrdenMedicamentos detalleOrdenMedicamentos);
    public void delete(Integer codigoDetalleOrdenMedicamento);
    public DetalleOrdenMedicamentos read(Integer codigoDetalleOrdenMedicamento);
}
