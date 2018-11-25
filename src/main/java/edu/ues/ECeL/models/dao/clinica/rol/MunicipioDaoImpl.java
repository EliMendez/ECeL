package edu.ues.ECeL.models.dao.clinica.rol;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.entity.clinica.rol.Municipio;

@Repository
public class MunicipioDaoImpl implements MunicipioDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Municipio municipio) {
        em.persist(municipio);
    }

    @Override
    @Transactional
    public void update(Municipio municipio) {
        em.merge(municipio);
    }

    @Override
    @Transactional
    public void delete(Integer codigoMunicipio) {
    	Municipio municipio = em.find(Municipio.class, codigoMunicipio);
        if (municipio != null) {
            em.remove(municipio);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Municipio read(Integer codigoMunicipio) {
        return em.find(Municipio.class, codigoMunicipio);
    }

}