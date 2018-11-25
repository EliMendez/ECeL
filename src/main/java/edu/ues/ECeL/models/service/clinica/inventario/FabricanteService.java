package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.inventario.Fabricante;

public interface FabricanteService {
	public void DeleteFabricante(Integer id) throws Exception;
	public List<Fabricante> FabricanteFinAll();
	public Fabricante getFabricanteDetails(String accountNumber);  
	public void SaveFabricanteAdd(Fabricante obj);
	public void UpdateFabricante(Fabricante obj);
	public Fabricante findById(Integer id);
}

