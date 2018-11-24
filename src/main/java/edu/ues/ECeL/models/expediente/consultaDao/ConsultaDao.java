package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.Consulta;

public interface ConsultaDao {
	public void insert(Consulta consulta);
    public void update(Consulta consulta);
    public void delete(Integer codigoConsulta);
    public Consulta read(Integer codigoConsulta);
}
