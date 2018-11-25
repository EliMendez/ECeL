package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenReferencias;

public interface OrdenReferenciasDao extends GenericHibernateDao<OrdenReferencias, Integer> {
	public OrdenReferencias getOrdenReferenciasDetails(Integer id);
}
