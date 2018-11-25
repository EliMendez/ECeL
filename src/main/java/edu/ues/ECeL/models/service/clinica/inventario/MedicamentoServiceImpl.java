package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.inventario.MedicamentoDao;
import edu.ues.ECeL.models.entity.clinica.inventario.Medicamento;

public class MedicamentoServiceImpl extends GenericObjectServiceImpl<Medicamento, Integer> implements MedicamentoService {
	
	private static final Logger logger = Logger.getLogger(MedicamentoServiceImpl.class);
	 
	@Autowired
	private MedicamentoDao medicamentoDao;
	 
	public Medicamento getMedicamentoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getMedicamentoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return medicamentoDao.getMedicamentoDetails(accountNumber);    
	 }

	public List<Medicamento> medicamentoFinAll() {
		 try {
			 return medicamentoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteMedicamento(Integer id) throws Exception {
		medicamentoDao.delete(medicamentoDao.findById(id));
	}

	public void saveMedicamentoAdd(Medicamento obj) { 
		try {
			Integer result = medicamentoDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoMedicamento());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateMedicamento(Medicamento obj) {   
		try {   
			medicamentoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public Medicamento findById(Integer id) {
		try {
			return medicamentoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
