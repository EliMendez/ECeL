package edu.ues.ECeL.models.clinica.rolDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.rol.AdminLog;

@Repository
public class AdminLogDaoImpl implements AdminLogDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(AdminLog adminLog) {
        em.persist(adminLog);
    }

    @Override
    @Transactional
    public void update(AdminLog adminLog) {
        em.merge(adminLog);
    }

    @Override
    @Transactional
    public void delete(Integer codigoAdminLog) {
    	AdminLog adminLog = em.find(AdminLog.class, codigoAdminLog);
        if (adminLog != null) {
            em.remove(adminLog);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public AdminLog read(Integer codigoAdminLog) {
        return em.find(AdminLog.class, codigoAdminLog);
    }

}
