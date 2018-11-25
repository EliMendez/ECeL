package edu.ues.ECeL.models.service.expediente.expediente;

import java.util.List;

import edu.ues.ECeL.models.entity.expediente.expediente.NotaEnfermeria;

public interface NotaEnfermeriaService {
	public void DeleteNotaEnfermeria(Integer id) throws Exception;
	public List<NotaEnfermeria> NotaEnfermeriaFinAll();
	public NotaEnfermeria getNotaEnfermeriaDetails(String accountNumber);  
	public void SaveNotaEnfermeriaAdd(NotaEnfermeria obj);
	public void UpdateNotaEnfermeria(NotaEnfermeria obj);
	public NotaEnfermeria findById(Integer id);
}