package edu.ues.ECeL.models.dao.clinica.inventario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.inventario.Fabricante;

@Repository
public class FabricanteDaoImpl implements FabricanteDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Fabricante fabricante) {
        em.persist(fabricante);
    }

    @Override
    @Transactional
    public void update(Fabricante fabricante) {
        em.merge(fabricante);
    }

    @Override
    @Transactional
    public void delete(Integer codigoFabricante) {
    	Fabricante fabricante = em.find(Fabricante.class, codigoFabricante);
        if (fabricante != null) {
            em.remove(fabricante);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Fabricante read(Integer codigoFabricante) {
        return em.find(Fabricante.class, codigoFabricante);
    }

}
