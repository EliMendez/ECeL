package edu.ues.ECeL.models.clinica.rolDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.clinica.rol.Grupo;

@Repository
public class GrupoDaoImpl implements GrupoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Grupo grupo) {
        em.persist(grupo);
    }

    @Override
    @Transactional
    public void update(Grupo grupo) {
        em.merge(grupo);
    }

    @Override
    @Transactional
    public void delete(Integer codigoGrupo) {
    	Grupo grupo = em.find(Grupo.class, codigoGrupo);
        if (grupo != null) {
            em.remove(grupo);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Grupo read(Integer codigoGrupo) {
        return em.find(Grupo.class, codigoGrupo);
    }

}