package edu.ues.ECeL.models.dao.clinica.rol;

import edu.ues.ECeL.models.entity.clinica.rol.TipoContenido;

public interface TipoContenidoDao {
	public void insert(TipoContenido tipoContenido);
    public void update(TipoContenido tipoContenido);
    public void delete(Integer codigoContenido);
    public TipoContenido read(Integer codigoContenido);
}
