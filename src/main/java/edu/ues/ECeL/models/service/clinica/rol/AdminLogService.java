package edu.ues.ECeL.models.service.clinica.rol;

import java.util.List;

import edu.ues.ECeL.models.entity.clinica.rol.AdminLog;

public interface AdminLogService {
	public void DeleteAdminLog(Integer id) throws Exception;
	public List<AdminLog> AdminLogFinAll();
	public AdminLog getAdminLogDetails(String accountNumber);  
	public void SaveAdminLogAdd(AdminLog obj);
	public void UpdateAdminLog(AdminLog obj);
	public AdminLog findById(Integer id);
}