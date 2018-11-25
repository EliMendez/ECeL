package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="INCAPACIDAD")
public class Incapacidad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5875224551162599634L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoIncapacidad;

	@NotNull
	@NotBlank
	@Size(min = 100, max = 250)
	@Column(name="motivoIncapacidad")
	private String motivoIncapacidad;
	
	@NotNull
	@NotBlank
	@Min(1)
	@Column(name="duracionIncapacidad")
	private Integer duracionIncapacidad;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 10)
	@Column(name="unidadTiempo")
	private String unidadTiempo;
	
	@OneToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;

	public Integer getCodigoIncapacidad() {
		return codigoIncapacidad;
	}

	public void setCodigoIncapacidad(Integer codigoIncapacidad) {
		this.codigoIncapacidad = codigoIncapacidad;
	}

	public String getMotivoIncapacidad() {
		return motivoIncapacidad;
	}

	public void setMotivoIncapacidad(String motivoIncapacidad) {
		this.motivoIncapacidad = motivoIncapacidad;
	}

	public Integer getDuracionIncapacidad() {
		return duracionIncapacidad;
	}

	public void setDuracionIncapacidad(Integer duracionIncapacidad) {
		this.duracionIncapacidad = duracionIncapacidad;
	}

	public String getUnidadTiempo() {
		return unidadTiempo;
	}

	public void setUnidadTiempo(String unidadTiempo) {
		this.unidadTiempo = unidadTiempo;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	@Override
	public String toString() {
		return getCodigoIncapacidad().toString();
	}
}
