package edu.ues.ECeL.models.dao.clinica.rol;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.rol.TipoContenido;

@Repository
public class TipoContenidoDaoImpl implements TipoContenidoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(TipoContenido tipoContenido) {
        em.persist(tipoContenido);
    }

    @Override
    @Transactional
    public void update(TipoContenido tipoContenido) {
        em.merge(tipoContenido);
    }

    @Override
    @Transactional
    public void delete(Integer codigoContenido) {
    	TipoContenido tipoContenido = em.find(TipoContenido.class, codigoContenido);
        if (tipoContenido != null) {
            em.remove(tipoContenido);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public TipoContenido read(Integer codigoContenido) {
        return em.find(TipoContenido.class, codigoContenido);
    }

}