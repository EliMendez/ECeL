package edu.ues.ECeL.models.expediente.consulta;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="PERFILDIETA")
public class PerfilDieta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2430434563627241647L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoDieta;
	
	@NotNull
	@NotBlank
	@Size(min = 100, max = 250)
	@Column(name="descripcionDieta")
	private String descripcionDieta;
	
	@NotNull
	@NotBlank
	@Column(name="fechaInicio")
	private Date fechaInicio;
	
	@OneToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;
	
	@OneToOne(mappedBy="perfilDieta")
	private Tratamiento tratamiento;

	public Integer getCodigoDieta() {
		return codigoDieta;
	}

	public void setCodigoDieta(Integer codigoDieta) {
		this.codigoDieta = codigoDieta;
	}

	public String getDescripcionDieta() {
		return descripcionDieta;
	}

	public void setDescripcionDieta(String descripcionDieta) {
		this.descripcionDieta = descripcionDieta;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	@Override
	public String toString() {
		return getCodigoDieta().toString();
	}
	
}
