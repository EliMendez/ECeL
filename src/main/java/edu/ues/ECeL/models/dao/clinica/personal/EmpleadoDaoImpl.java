package edu.ues.ECeL.models.dao.clinica.personal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.personal.Empleado;

@Repository
public class EmpleadoDaoImpl implements EmpleadoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Empleado empleado) {
        em.persist(empleado);
    }

    @Override
    @Transactional
    public void update(Empleado empleado) {
        em.merge(empleado);
    }

    @Override
    @Transactional
    public void delete(Integer codigoEmpleado) {
    	Empleado empleado = em.find(Empleado.class, codigoEmpleado);
        if (empleado != null) {
            em.remove(empleado);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado read(Integer codigoEmpleado) {
        return em.find(Empleado.class, codigoEmpleado);
    }

}
