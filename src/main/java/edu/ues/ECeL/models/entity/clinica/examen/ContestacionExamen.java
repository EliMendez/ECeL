package edu.ues.ECeL.models.entity.clinica.examen;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

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

import edu.ues.ECeL.models.entity.expediente.expediente.Expediente;

@Entity
@Table(name="CONTESTACIONEXAMEN")
public class ContestacionExamen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 660141981692107013L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoContestacion;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Expediente", nullable=true)
	private Expediente expediente;
	
	@OneToOne(mappedBy="contestacionExamen")
	private TranscripcionExamen transcripcionExamen;
	
	@OneToOne
	@JoinColumn(name="DetalleOrdenExamen", nullable=false)
	private DetalleOrdenExamenes detalleOrdenExamenes;
	
	@NotBlank
	@Column(name="lectura")
	private byte[] lectura;
	
	@NotNull
	@NotBlank
	@Column(name="fechaContestacion")
	private Date fechaContestacion;

	public Integer getCodigoContestacion() {
		return codigoContestacion;
	}

	public void setCodigoContestacion(Integer codigoContestacion) {
		this.codigoContestacion = codigoContestacion;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public TranscripcionExamen getTranscripcionExamen() {
		return transcripcionExamen;
	}

	public void setTranscripcionExamen(TranscripcionExamen transcripcionExamen) {
		this.transcripcionExamen = transcripcionExamen;
	}

	public DetalleOrdenExamenes getDetalleOrdenExamenes() {
		return detalleOrdenExamenes;
	}

	public void setDetalleOrdenExamenes(DetalleOrdenExamenes detalleOrdenExamenes) {
		this.detalleOrdenExamenes = detalleOrdenExamenes;
	}

	public byte[] getLectura() {
		return lectura;
	}

	public void setLectura(byte[] lectura) {
		this.lectura = lectura;
	}
	
	public Date getFechaContestacion() {
		return fechaContestacion;
	}

	public void setFechaContestacion(Date fechaContestacion) {
		this.fechaContestacion = fechaContestacion;
	}

	@Override
	public String toString() {
		return "ContestacionExamen [getCodigoContestacion()=" + getCodigoContestacion() + ", getExpediente()="
				+ getExpediente() + ", getTranscripcionExamen()=" + getTranscripcionExamen()
				+ ", getDetalleOrdenExamenes()=" + getDetalleOrdenExamenes() + ", getLectura()="
				+ Arrays.toString(getLectura()) + ", getFechaContestacion()=" + getFechaContestacion() + "]";
	}

}