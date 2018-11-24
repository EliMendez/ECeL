package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.OrdenMedicamentos;

public interface OrdenMedicamentosDao {
	public void insert(OrdenMedicamentos ordenMedicamentos);
    public void update(OrdenMedicamentos ordenMedicamentos);
    public void delete(Integer codigoOrdenMedicamentos);
    public OrdenMedicamentos read(Integer codigoOrdenMedicamentos);
}
