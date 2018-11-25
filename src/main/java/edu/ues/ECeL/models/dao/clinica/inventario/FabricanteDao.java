package edu.ues.ECeL.models.dao.clinica.inventario;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.inventario.Fabricante;

public interface FabricanteDao extends GenericHibernateDao<Fabricante, Integer>{
	public Fabricante getFabricanteDetails(Integer id);
}
