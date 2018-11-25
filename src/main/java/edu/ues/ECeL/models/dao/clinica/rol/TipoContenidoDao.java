package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.rol.TipoContenido;

public interface TipoContenidoDao extends GenericHibernateDao<TipoContenido, Integer> {
	public TipoContenido getTipoContenidoDetails(Integer id);
}
