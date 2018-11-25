package edu.ues.ECeL.models.service.clinica.inventario;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.inventario.LoteMedicamentoDao;
import edu.ues.ECeL.models.entity.clinica.inventario.LoteMedicamento;

public class LoteMedicamentoServiceImpl extends GenericObjectServiceImpl<LoteMedicamento, Integer> implements LoteMedicamentoService {
	
	private static final Logger logger = Logger.getLogger(LoteMedicamentoServiceImpl.class);
	 
	@Autowired
	private LoteMedicamentoDao loteMedicamentoDao;
	 
	public LoteMedicamento getLoteMedicamentoDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getLoteMedicamentoDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return loteMedicamentoDao.getLoteMedicamentoDetails(accountNumber);    
	 }

	public List<LoteMedicamento> loteMedicamentoFinAll() {
		 try {
			 return loteMedicamentoDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteLoteMedicamento(Integer id) throws Exception {
		loteMedicamentoDao.delete(loteMedicamentoDao.findById(id));
	}

	public void saveLoteMedicamentoAdd(LoteMedicamento obj) { 
		try {
			Integer result = loteMedicamentoDao.save(obj);
			System.out.println("id grabado " + obj.getNumeroLote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateLoteMedicamento(LoteMedicamento obj) {   
		try {   
			loteMedicamentoDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public LoteMedicamento findById(Integer id) {
		try {
			return loteMedicamentoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
