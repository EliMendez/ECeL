package edu.ues.ECeL.models.expediente.expedienteDao;

import edu.ues.ECeL.models.expediente.expediente.Expediente;

public interface ExpedienteDao {
	public void insert(Expediente expediente);
    public void update(Expediente expediente);
    public void delete(Integer codigoExpediente);
    public Expediente read(Integer codigoExpediente);
}
