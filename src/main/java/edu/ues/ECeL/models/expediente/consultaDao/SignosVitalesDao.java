package edu.ues.ECeL.models.expediente.consultaDao;

import edu.ues.ECeL.models.expediente.consulta.SignosVitales;

public interface SignosVitalesDao {
	public void insert(SignosVitales signosVitales);
    public void update(SignosVitales signosVitales);
    public void delete(Integer codigoSignosVitales);
    public SignosVitales read(Integer codigoSignosVitales);
}
