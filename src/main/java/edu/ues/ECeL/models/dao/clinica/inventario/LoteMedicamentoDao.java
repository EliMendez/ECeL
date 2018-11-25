package edu.ues.ECeL.models.dao.clinica.inventario;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.inventario.LoteMedicamento;

public interface LoteMedicamentoDao extends GenericHibernateDao<LoteMedicamento, Integer> {
	public LoteMedicamento getLoteMedicamentoDetails(Integer id);
}
