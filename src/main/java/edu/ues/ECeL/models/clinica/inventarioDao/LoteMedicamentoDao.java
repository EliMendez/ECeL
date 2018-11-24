package edu.ues.ECeL.models.clinica.inventarioDao;

import edu.ues.ECeL.models.clinica.inventario.LoteMedicamento;

public interface LoteMedicamentoDao {
	public void insert(LoteMedicamento loteMedicamento);
    public void update(LoteMedicamento loteMedicamento);
    public void delete(Integer numeroLote);
    public LoteMedicamento read(Integer numeroLote);
}
