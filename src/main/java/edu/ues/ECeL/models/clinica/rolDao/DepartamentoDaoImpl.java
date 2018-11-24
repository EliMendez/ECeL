package edu.ues.ECeL.models.clinica.rolDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.rol.Departamento;

@Repository
public class DepartamentoDaoImpl implements DepartamentoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Departamento departamento) {
        em.persist(departamento);
    }

    @Override
    @Transactional
    public void update(Departamento departamento) {
        em.merge(departamento);
    }

    @Override
    @Transactional
    public void delete(Integer codigoDepartamento) {
    	Departamento departamento = em.find(Departamento.class, codigoDepartamento);
        if (departamento != null) {
            em.remove(departamento);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento read(Integer codigoDepartamento) {
        return em.find(Departamento.class, codigoDepartamento);
    }

}