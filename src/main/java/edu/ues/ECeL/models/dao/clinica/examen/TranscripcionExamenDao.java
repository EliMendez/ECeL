package edu.ues.ECeL.models.dao.clinica.examen;

import edu.ues.ECeL.models.entity.clinica.examen.TranscripcionExamen;

public interface TranscripcionExamenDao {
	public void insert(TranscripcionExamen transcripcionExamen);
    public void update(TranscripcionExamen transcripcionExamen);
    public void delete(Integer codigoTranscripcion);
    public TranscripcionExamen read(Integer codigoTranscripcion);
}
