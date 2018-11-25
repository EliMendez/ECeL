package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenExamenes;

public interface OrdenExamenesDao extends GenericHibernateDao<OrdenExamenes, Integer>{
	public OrdenExamenes getOrdenExamenesDetails(Integer id);
}
