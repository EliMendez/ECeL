package edu.ues.ECeL.models.clinica.inventarioDao;

import edu.ues.ECeL.models.clinica.inventario.Medicamento;

public interface MedicamentoDao {
	public void insert(Medicamento medicamento);
    public void update(Medicamento medicamento);
    public void delete(Integer codigoMedicamento);
    public Medicamento read(Integer codigoMedicamento);
}
