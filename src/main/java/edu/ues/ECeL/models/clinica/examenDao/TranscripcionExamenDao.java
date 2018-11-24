package edu.ues.ECeL.models.clinica.examenDao;

import edu.ues.ECeL.models.clinica.examen.TranscripcionExamen;

public interface TranscripcionExamenDao {
	public void insert(TranscripcionExamen transcripcionExamen);
    public void update(TranscripcionExamen transcripcionExamen);
    public void delete(Integer codigoTranscripcion);
    public TranscripcionExamen read(Integer codigoTranscripcion);
}
