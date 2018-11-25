package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleTratamiento;

public interface DetalleTratamientoDao extends GenericHibernateDao<DetalleTratamiento, Integer> {
	public DetalleTratamiento getDetalleTratamientoDetails(Integer id);
}
