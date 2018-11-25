package edu.ues.ECeL.generic;

import java.io.Serializable;
import java.util.List;

public interface GenericObjectService<T extends Serializable, E> {
	public void DeleteObject(Integer id) throws Exception;
	public List<Object> ObjectFinAll();
	public Object getObjectDetails(String accountNumber);  
	public void SaveObjectAdd(Object obj);
	public void UpdateObject(Object obj);
	public Object findById(Integer id);
}

