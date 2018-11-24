package edu.ues.ECeL.models.clinica.personalDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.personal.Cargo;

@Repository
public class CargoDaoImpl implements CargoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Cargo cargo) {
        em.persist(cargo);
    }

    @Override
    @Transactional
    public void update(Cargo cargo) {
        em.merge(cargo);
    }

    @Override
    @Transactional
    public void delete(Integer codigoCargo) {
    	Cargo cargo = em.find(Cargo.class, codigoCargo);
        if (cargo != null) {
            em.remove(cargo);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Cargo read(Integer codigoCargo) {
        return em.find(Cargo.class, codigoCargo);
    }

}

