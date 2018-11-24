package edu.ues.ECeL.models.expediente.expediente;

import java.io.Serializable;

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
@Table(name="HISTORIACLINICA")
public class HistoriaClinica implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6935331435267549800L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoHistoria;

	@NotNull
	@NotBlank
	@Size(min = 25, max = 150)
	@Column(name="motivoHistoria")
	private String motivoHistoria;
	
	@NotNull
	@NotBlank
	@Size(min = 100, max = 250)
	@Column(name="historia")
	private String historia;
	
	@NotNull
	@Size(min = 50, max = 500)
	@Column(name="antecedentesFamiliares")
	private String antecedentesFamiliares;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 500)
	@Column(name="antecedentesPersonales")
	private String antecedentesPersonales;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 500)
	@Column(name="resumen")
	private String resumen;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="codigoExpediente", nullable=false)
	private Expediente expediente;

	public Integer getCodigoHistoria() {
		return codigoHistoria;
	}

	public void setCodigoHistoria(Integer codigoHistoria) {
		this.codigoHistoria = codigoHistoria;
	}

	public String getMotivoHistoria() {
		return motivoHistoria;
	}

	public void setMotivoHistoria(String motivoHistoria) {
		this.motivoHistoria = motivoHistoria;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getAntecedentesFamiliares() {
		return antecedentesFamiliares;
	}

	public void setAntecedentesFamiliares(String antecedentesFamiliares) {
		this.antecedentesFamiliares = antecedentesFamiliares;
	}

	public String getAntecedentesPersonales() {
		return antecedentesPersonales;
	}

	public void setAntecedentesPersonales(String antecedentesPersonales) {
		this.antecedentesPersonales = antecedentesPersonales;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	@Override
	public String toString() {
		return getCodigoHistoria().toString();
	}
}
