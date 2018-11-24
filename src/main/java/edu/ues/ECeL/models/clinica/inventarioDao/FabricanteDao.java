package edu.ues.ECeL.models.clinica.inventarioDao;

import edu.ues.ECeL.models.clinica.inventario.Fabricante;

public interface FabricanteDao {
	public void insert(Fabricante fabricante);
    public void update(Fabricante fabricante);
    public void delete(Integer codigoFabricante);
    public Fabricante read(Integer codigoFabricante);
}
