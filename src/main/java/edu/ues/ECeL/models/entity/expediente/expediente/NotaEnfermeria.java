package edu.ues.ECeL.models.entity.expediente.expediente;


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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="NOTAENFERMERIA")
public class NotaEnfermeria implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -549142773268853213L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoNota;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 50)
	@Column(name="tituloNota")
	private String tituloNota;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 500)
	@Column(name="nota")
	private String notaNota;
	
	@NotNull
	@NotBlank
	@Column(name="fechaRedaccion")
	private Date fechaRedaccion;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="codigoExpediente", nullable=false)
	private Expediente expediente;

	public Integer getCodigoNota() {
		return codigoNota;
	}

	public void setCodigoNota(Integer codigoNota) {
		this.codigoNota = codigoNota;
	}

	public String getTituloNota() {
		return tituloNota;
	}

	public void setTituloNota(String tituloNota) {
		this.tituloNota = tituloNota;
	}

	public String getNotaNota() {
		return notaNota;
	}

	public void setNotaNota(String notaNota) {
		this.notaNota = notaNota;
	}

	public Date getFechaRedaccion() {
		return fechaRedaccion;
	}

	public void setFechaRedaccion(Date fechaRedaccion) {
		this.fechaRedaccion = fechaRedaccion;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}
	
	@Override
	public String toString() {
		return "NotaEnfermeria [getCodigoNota()=" + getCodigoNota() + ", getTituloNota()=" + getTituloNota()
				+ ", getNotaNota()=" + getNotaNota() + ", getFechaRedaccion()=" + getFechaRedaccion()
				+ ", getExpediente()=" + getExpediente() + "]";
	}
}