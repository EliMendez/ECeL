package edu.ues.ECeL.models.service.clinica.personal;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.personal.CargoDao;
import edu.ues.ECeL.models.entity.clinica.personal.Cargo;

public class CargoServiceImpl extends GenericObjectServiceImpl<Cargo, Integer> implements CargoService {
	
	private static final Logger logger = Logger.getLogger(CargoServiceImpl.class);
	 
	@Autowired
	private CargoDao cargoDao;
	 
	public Cargo getCargoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getCargoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return cargoDao.getCargoDetails(accountNumber);    
	 }

	public List<Cargo> cargoFinAll() {
		 try {
			 return cargoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteCargo(Integer id) throws Exception {
		cargoDao.delete(cargoDao.findById(id));
	}

	public void saveCargoAdd(Cargo obj) { 
		try {
			Integer result = cargoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoCargo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateCargo(Cargo obj) {   
		try {   
			cargoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Cargo findById(Integer id) {
		try {
			return cargoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
