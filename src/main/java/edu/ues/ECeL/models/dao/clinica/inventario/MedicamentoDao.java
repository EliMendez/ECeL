package edu.ues.ECeL.models.dao.clinica.inventario;

import edu.ues.ECeL.models.entity.clinica.inventario.Medicamento;

public interface MedicamentoDao {
	public void insert(Medicamento medicamento);
    public void update(Medicamento medicamento);
    public void delete(Integer codigoMedicamento);
    public Medicamento read(Integer codigoMedicamento);
}
