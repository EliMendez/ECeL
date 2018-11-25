package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import edu.ues.ECeL.generic.GenericObjectServiceImpl;
import edu.ues.ECeL.models.dao.clinica.rol.AdminLogDao;
import edu.ues.ECeL.models.entity.clinica.rol.AdminLog;

public class AdminLogServiceImpl extends GenericObjectServiceImpl<AdminLog, Integer> implements AdminLogService {
	
	private static final Logger logger = Logger.getLogger(AdminLogServiceImpl.class);
	 
	@Autowired
	private AdminLogDao adminLogDao;
	 
	public AdminLog getAdminLogDetails(Integer accountNumber) {
		logger.info("Llamada al metodo getAdminLogDetails con parametro accountNumber="+accountNumber);
		System.out.println("paso por servicio");   
		return adminLogDao.getAdminLogDetails(accountNumber);    
	 }

	public List<AdminLog> adminLogFinAll() {
		 try {
			 return adminLogDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }

	public void deleteAdminLog(Integer id) throws Exception {
		adminLogDao.delete(adminLogDao.findById(id));
	}

	public void saveAdminLogAdd(AdminLog obj) { 
		try {
			Integer result = adminLogDao.save(obj);
			System.out.println("id grabado " + obj.getCodigoAdminLog());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }

	public void updateAdminLog(AdminLog obj) {   
		try {   
			adminLogDao.saveOrUpdate(obj);   
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	

	public AdminLog findById(Integer id) {
		try {
			return adminLogDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
