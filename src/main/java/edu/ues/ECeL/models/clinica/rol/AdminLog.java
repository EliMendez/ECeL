package edu.ues.ECeL.models.clinica.rol;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="ADMINLOG")
public class AdminLog implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6795004214456700226L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoAdminLog;
	
	@NotNull
	@NotBlank
	@Column(name="actionTime")
	private Date actionTime;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="codigoObjeto")
	private String codigoObjeto;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 200)
	@Column(name="reprObjeto")
	private String reprObjeto;
	
	@NotNull
	@NotBlank
	@Min(1)
	@Column(name="actionFlag")
	private Integer actionFlag;
	
	@ManyToOne(optional=true)
	@JoinColumn(name="TipoContenido", nullable=true)
	private TipoContenido tipoContenido;
	
	@ManyToOne(optional=true)
	@JoinColumn(name="Persona", nullable=true)
	private Persona persona;

	public Integer getCodigoAdminLog() {
		return codigoAdminLog;
	}

	public void setCodigoAdminLog(Integer codigoAdminLog) {
		this.codigoAdminLog = codigoAdminLog;
	}

	public Date getActionTime() {
		return actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getCodigoObjeto() {
		return codigoObjeto;
	}

	public void setCodigoObjeto(String codigoObjeto) {
		this.codigoObjeto = codigoObjeto;
	}

	public String getReprObjeto() {
		return reprObjeto;
	}

	public void setReprObjeto(String reprObjeto) {
		this.reprObjeto = reprObjeto;
	}

	public Integer getActionFlag() {
		return actionFlag;
	}

	public void setActionFlag(Integer actionFlag) {
		this.actionFlag = actionFlag;
	}

	public TipoContenido getTipoContenido() {
		return tipoContenido;
	}

	public void setTipoContenido(TipoContenido tipoContenido) {
		this.tipoContenido = tipoContenido;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return getCodigoAdminLog().toString();
	}
	
}
