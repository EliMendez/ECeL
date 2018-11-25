package edu.ues.ECeL.models.dao.clinica.inventario;

import edu.ues.ECeL.models.entity.clinica.inventario.LoteMedicamento;

public interface LoteMedicamentoDao {
	public void insert(LoteMedicamento loteMedicamento);
    public void update(LoteMedicamento loteMedicamento);
    public void delete(Integer numeroLote);
    public LoteMedicamento read(Integer numeroLote);
}
