package edu.ues.ECeL.models.dao.expediente.consulta;

import edu.ues.ECeL.models.entity.expediente.consulta.Consulta;

public interface ConsultaDao {
	public void insert(Consulta consulta);
    public void update(Consulta consulta);
    public void delete(Integer codigoConsulta);
    public Consulta read(Integer codigoConsulta);
}
