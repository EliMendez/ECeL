package edu.ues.ECeL.models.clinica.personalDao;

import edu.ues.ECeL.models.clinica.personal.Cargo;

public interface CargoDao {
	public void insert(Cargo cargo);
    public void update(Cargo cargo);
    public void delete(Integer codigoCargo);
    public Cargo read(Integer codigoCargo);
}
