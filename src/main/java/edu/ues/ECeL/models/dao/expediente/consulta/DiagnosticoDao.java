package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.Diagnostico;

public interface DiagnosticoDao {
	public void insert(Diagnostico diagnostico);
    public void update(Diagnostico diagnostico);
    public void delete(Integer codigoDiagnostico);
    public Diagnostico read(Integer codigoDiagnostico);
}
