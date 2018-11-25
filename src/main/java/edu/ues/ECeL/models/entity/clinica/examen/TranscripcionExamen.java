package edu.ues.ECeL.models.entity.clinica.examen;

import java.io.Serializable;

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
@Table(name="TRANSCRIPCIONEXAMEN")
public class TranscripcionExamen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8461448946181236151L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoTranscripcion;
	
	@OneToOne
	@JoinColumn(name="codigoContestacion", nullable=true)
	private ContestacionExamen contestacionExamen;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 500)
	@Column(name="resultadoTranscripcion")
	private String resultadoTranscripcion;
	
	@NotNull
	@NotBlank
	@Column(name="isAprovada")
	private boolean isAprovada;

	public Integer getCodigoTranscripcion() {
		return codigoTranscripcion;
	}

	public void setCodigoTranscripcion(Integer codigoTranscripcion) {
		this.codigoTranscripcion = codigoTranscripcion;
	}

	public ContestacionExamen getContestacionExamen() {
		return contestacionExamen;
	}

	public void setContestacionExamen(ContestacionExamen contestacionExamen) {
		this.contestacionExamen = contestacionExamen;
	}

	public String getResultadoTranscripcion() {
		return resultadoTranscripcion;
	}

	public void setResultadoTranscripcion(String resultadoTranscripcion) {
		this.resultadoTranscripcion = resultadoTranscripcion;
	}

	public boolean isAprovada() {
		return isAprovada;
	}

	public void setAprovada(boolean isAprovada) {
		this.isAprovada = isAprovada;
	}

	@Override
	public String toString() {
		return getCodigoTranscripcion().toString();
	}

}

