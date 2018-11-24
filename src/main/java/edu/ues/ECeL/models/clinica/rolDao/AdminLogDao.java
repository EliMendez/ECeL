package edu.ues.ECeL.models.clinica.rolDao;

import edu.ues.ECeL.models.clinica.rol.AdminLog;

public interface AdminLogDao {
	public void insert(AdminLog adminLog);
    public void update(AdminLog adminLog);
    public void delete(Integer codigoAdminLog);
    public AdminLog read(Integer codigoAdminLog);
}