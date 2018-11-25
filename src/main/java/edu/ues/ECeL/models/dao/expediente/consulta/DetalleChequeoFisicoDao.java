package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleChequeoFisico;

public interface DetalleChequeoFisicoDao extends GenericHibernateDao<DetalleChequeoFisico, Integer> {
	public DetalleChequeoFisico getDetalleChequeoFisicoDetails(Integer id);
}
