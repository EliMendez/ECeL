package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.consulta.Diagnostico;

public interface DiagnosticoDao extends GenericHibernateDao<Diagnostico, Integer> {
	public Diagnostico getDiagnosticoDetails(Integer id);
}
