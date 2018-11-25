package edu.ues.ECeL.generic;

import java.io.Serializable;
import java.util.List;

public interface GenericObjectService<T extends Serializable, E> {
	public void deleteObject(Integer id) throws Exception;
	public List<Object> objectFinAll();
	public Object getObjectDetails(String accountNumber);  
	public void saveObjectAdd(Object obj);
	public void updateObject(Object obj);
	public Object findById(Integer id);
}

