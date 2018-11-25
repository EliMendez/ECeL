package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.rol.Grupo;

public interface GrupoDao extends GenericHibernateDao<Grupo, Integer> {
	public Grupo getGrupoDetails(Integer id);
}
