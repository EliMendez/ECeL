package edu.ues.ECeL.models.expediente.expedienteDao;

import edu.ues.ECeL.models.expediente.expediente.NotaEnfermeria;

public interface NotaEnfermeriaDao {
	public void insert(NotaEnfermeria notaEnfermeria);
    public void update(NotaEnfermeria notaEnfermeria);
    public void delete(Integer codigoNota);
    public NotaEnfermeria read(Integer codigoNota);
}