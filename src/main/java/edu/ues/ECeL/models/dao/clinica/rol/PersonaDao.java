package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.rol.Persona;

public interface PersonaDao extends GenericHibernateDao<Persona, Integer> {
	public Persona getPersonaDetails(Integer id);
}