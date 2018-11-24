package edu.ues.ECeL.models.expediente.consultaDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.ues.ECeL.models.expediente.consulta.Tratamiento;

@Repository
public class TratamientoDaoImpl implements TratamientoDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void insert(Tratamiento tratamiento) {
        em.persist(tratamiento);
    }

    @Override
    @Transactional
    public void update(Tratamiento tratamiento) {
        em.merge(tratamiento);
    }

    @Override
    @Transactional
    public void delete(Integer codigoTratamiento) {
    	Tratamiento tratamiento = em.find(Tratamiento.class, codigoTratamiento);
        if (tratamiento != null) {
            em.remove(tratamiento);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Tratamiento read(Integer codigoTratamiento) {
        return em.find(Tratamiento.class, codigoTratamiento);
    }

}