package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.personal.Cargo;

public interface CargoService {
	public void DeleteCargo(Integer id) throws Exception;
	public List<Cargo> CargoFinAll();
	public Cargo getCargoDetails(String accountNumber);  
	public void SaveCargoAdd(Cargo obj);
	public void UpdateCargo(Cargo obj);
	public Cargo findById(Integer id);
}
