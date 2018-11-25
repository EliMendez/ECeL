package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.OrdenMedicamentos;

public interface OrdenMedicamentosDao {
	public void insert(OrdenMedicamentos ordenMedicamentos);
    public void update(OrdenMedicamentos ordenMedicamentos);
    public void delete(Integer codigoOrdenMedicamentos);
    public OrdenMedicamentos read(Integer codigoOrdenMedicamentos);
}
