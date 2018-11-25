package edu.ues.ECeL.models.dao.expediente.expediente;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.expediente.expediente.NotaEnfermeria;

public interface NotaEnfermeriaDao extends GenericHibernateDao<NotaEnfermeria, Integer> {
	public NotaEnfermeria getNotaEnfermeriaDetails(Integer id);
}