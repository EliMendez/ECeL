package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.Diagnostico;

public interface DiagnosticoDao {
	public void insert(Diagnostico diagnostico);
    public void update(Diagnostico diagnostico);
    public void delete(Integer codigoDiagnostico);
    public Diagnostico read(Integer codigoDiagnostico);
}
