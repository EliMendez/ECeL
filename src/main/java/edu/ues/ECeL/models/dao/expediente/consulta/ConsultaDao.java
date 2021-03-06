package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Consulta;

public interface ConsultaDao extends GenericHibernateDao<Consulta, Integer> {
	public Consulta getConsultaDetails(Integer id);
}
