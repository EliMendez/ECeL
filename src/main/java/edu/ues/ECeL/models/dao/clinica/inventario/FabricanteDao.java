package edu.ues.ECeL.models.dao.clinica.inventario;

import edu.ues.ECeL.models.entity.clinica.inventario.Fabricante;

public interface FabricanteDao {
	public void insert(Fabricante fabricante);
    public void update(Fabricante fabricante);
    public void delete(Integer codigoFabricante);
    public Fabricante read(Integer codigoFabricante);
}
