package edu.ues.ECeL.generic;

import java.io.Serializable;
import java.util.List;

public abstract class GenericObjectServiceImpl<T extends Serializable, E> implements GenericObjectService<T, E>{

	@Override
	public void DeleteObject(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> ObjectFinAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getObjectDetails(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SaveObjectAdd(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateObject(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
