package edu.ues.ECeL.models.dao.clinica.rol;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.rol.Permiso;

@Repository
public class PermisoDaoImpl implements PermisoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Permiso permiso) {
        em.persist(permiso);
    }

    @Override
    @Transactional
    public void update(Permiso permiso) {
        em.merge(permiso);
    }

    @Override
    @Transactional
    public void delete(Integer codigoPermiso) {
    	Permiso permiso = em.find(Permiso.class, codigoPermiso);
        if (permiso != null) {
            em.remove(permiso);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Permiso read(Integer codigoPermiso) {
        return em.find(Permiso.class, codigoPermiso);
    }

}