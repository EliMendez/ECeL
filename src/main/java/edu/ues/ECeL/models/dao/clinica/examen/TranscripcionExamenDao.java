package edu.ues.ECeL.models.dao.clinica.examen;

import edu.ues.ECeL.generic.GenericHibernateDao;
import edu.ues.ECeL.models.entity.clinica.examen.TranscripcionExamen;

public interface TranscripcionExamenDao extends GenericHibernateDao<TranscripcionExamen, Integer>{
	public TranscripcionExamen getTranscripcionExamenDetails(Integer id);
}
