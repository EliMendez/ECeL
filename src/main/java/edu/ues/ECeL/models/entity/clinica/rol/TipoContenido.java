package edu.ues.ECeL.models.entity.clinica.rol;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="TIPOCONTENIDO")
public class TipoContenido implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8172131849577413043L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoContenido;
	
	@OneToMany(mappedBy="tipoContenido")
	private List<Permiso> permisos;
	
	@OneToMany(mappedBy="tipoContenido")
	private List<AdminLog> adminLogs;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="appLabel")
	private String appLabel;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="model")
	private String model;

	public Integer getCodigoContenido() {
		return codigoContenido;
	}


	public void setCodigoContenido(Integer codigoContenido) {
		this.codigoContenido = codigoContenido;
	}


	public List<Permiso> getPermisos() {
		return permisos;
	}


	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}


	public List<AdminLog> getAdminLogs() {
		return adminLogs;
	}


	public void setAdminLogs(List<AdminLog> adminLogs) {
		this.adminLogs = adminLogs;
	}


	public String getAppLabel() {
		return appLabel;
	}


	public void setAppLabel(String appLabel) {
		this.appLabel = appLabel;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return getCodigoContenido().toString();
	}	
	
}
