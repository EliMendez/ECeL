package edu.ues.ECeL.models.expediente.consultaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.consulta.PerfilDieta;

@Repository
public class PerfilDietaDaoImpl implements PerfilDietaDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(PerfilDieta perfilDieta) {
        em.persist(perfilDieta);
    }

    @Override
    @Transactional
    public void update(PerfilDieta perfilDieta) {
        em.merge(perfilDieta);
    }

    @Override
    @Transactional
    public void delete(Integer codigoDieta) {
    	PerfilDieta perfilDieta = em.find(PerfilDieta.class, codigoDieta);
        if (perfilDieta != null) {
            em.remove(perfilDieta);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public PerfilDieta read(Integer codigoDieta) {
        return em.find(PerfilDieta.class, codigoDieta);
    }

}