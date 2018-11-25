package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.clinica.cita.Cita;
import edu.ues.ECeL.models.entity.clinica.personal.Especialidad;

@Entity 
@Table(name="DETALLEORDENREFERENCIA")
public class DetalleOrdenReferencia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6821499013701486249L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoDetalleReferencia;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 250)
	@Column(name="motivoReferencia")
	private String motivoReferencia;
	
	@OneToOne
	@JoinColumn(name="Cita")
	private Cita cita;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Referencia", nullable=false)
	private OrdenReferencias ordenReferencias;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Especialidad", nullable=false)
	private Especialidad especialidad;

	public Integer getCodigoDetalleReferencia() {
		return codigoDetalleReferencia;
	}

	public void setCodigoDetalleReferencia(Integer codigoDetalleReferencia) {
		this.codigoDetalleReferencia = codigoDetalleReferencia;
	}

	public String getMotivoReferencia() {
		return motivoReferencia;
	}

	public void setMotivoReferencia(String motivoReferencia) {
		this.motivoReferencia = motivoReferencia;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public OrdenReferencias getOrdenReferencias() {
		return ordenReferencias;
	}

	public void setOrdenReferencias(OrdenReferencias ordenReferencias) {
		this.ordenReferencias = ordenReferencias;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return "DetalleOrdenReferencia [getCodigoDetalleReferencia()=" + getCodigoDetalleReferencia()
				+ ", getMotivoReferencia()=" + getMotivoReferencia() + ", getCita()=" + getCita()
				+ ", getOrdenReferencias()=" + getOrdenReferencias() + ", getEspecialidad()=" + getEspecialidad() + "]";
	}
}
