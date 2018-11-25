package edu.ues.ECeL.models.entity.clinica.examen;

import java.io.Serializable;

import javax.persistence.CascadeType;
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

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.clinica.cita.Cita;
import edu.ues.ECeL.models.entity.expediente.consulta.OrdenExamenes;

@Entity
@Table(name="DETALLEORDENEXAMENES")
public class DetalleOrdenExamenes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3978482400890540245L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoDetalleExamen;
	
	@NotNull
	@NotBlank
	@Column(name="isRealizado")
	private boolean isRealizado;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Examen", nullable=true)
	private Examen examen;
	
	@OneToOne
	private Cita cita;
	
	@OneToOne(mappedBy = "detalleOrdenExamenes",cascade= CascadeType.ALL)
	private ContestacionExamen contestacionExamen;

	@ManyToOne(optional=false)
	@JoinColumn(name="OrdenExamenes", nullable=false)
	private OrdenExamenes ordenExamenes;

	public Integer getCodigoDetalleExamen() {
		return codigoDetalleExamen;
	}

	public void setCodigoDetalleExamen(Integer codigoDetalleExamen) {
		this.codigoDetalleExamen = codigoDetalleExamen;
	}

	public boolean isRealizado() {
		return isRealizado;
	}

	public void setRealizado(boolean isRealizado) {
		this.isRealizado = isRealizado;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public ContestacionExamen getContestacionExamen() {
		return contestacionExamen;
	}

	public void setContestacionExamen(ContestacionExamen contestacionExamen) {
		this.contestacionExamen = contestacionExamen;
	}

	public OrdenExamenes getOrdenExamenes() {
		return ordenExamenes;
	}

	public void setOrdenExamenes(OrdenExamenes ordenExamenes) {
		this.ordenExamenes = ordenExamenes;
	}
	
	@Override
	public String toString() {
		return "DetalleOrdenExamenes [getCodigoDetalleExamen()=" + getCodigoDetalleExamen() + ", isRealizado()="
				+ isRealizado() + ", getExamen()=" + getExamen() + ", getCita()=" + getCita()
				+ ", getContestacionExamen()=" + getContestacionExamen() + ", getOrdenExamenes()=" + getOrdenExamenes()
				+ "]";
	}
}