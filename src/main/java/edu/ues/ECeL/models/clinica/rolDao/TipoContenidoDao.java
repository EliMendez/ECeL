package edu.ues.ECeL.models.clinica.rolDao;

import edu.ues.ECeL.models.clinica.rol.TipoContenido;

public interface TipoContenidoDao {
	public void insert(TipoContenido tipoContenido);
    public void update(TipoContenido tipoContenido);
    public void delete(Integer codigoContenido);
    public TipoContenido read(Integer codigoContenido);
}
