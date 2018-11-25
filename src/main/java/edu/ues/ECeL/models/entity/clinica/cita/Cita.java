package edu.ues.ECeL.models.entity.clinica.cita;

import java.io.Serializable;
import java.sql.Timestamp;
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

import edu.ues.ECeL.models.entity.clinica.examen.DetalleOrdenExamenes;
import edu.ues.ECeL.models.entity.clinica.personal.Clinica;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleOrdenReferencia;
import edu.ues.ECeL.models.entity.expediente.expediente.Expediente;

@Entity
@Table(name="CITA")
public class Cita implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3111237134051544150L;

	@Id
	@Column(name="codigoCita")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoCita;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Estado", nullable=true)
	private Estado estado;
	
	@OneToOne(mappedBy = "cita")
	@JoinColumn(name="DetalleExamen", nullable=true)
	private DetalleOrdenExamenes detalleOrdenExamenes;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Expediente", nullable=false)
	private Expediente expediente;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Agenda", nullable=true)
	private Agenda agenda;
	
	@OneToOne(mappedBy = "cita")
	@JoinColumn(name="DetalleReferencia", nullable=true)
	private DetalleOrdenReferencia detalleOrdenReferencia;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Clinica", nullable=false)
	private Clinica clinica;
	
	@NotNull
	@NotBlank
	@Column(name="fechaCita")
	private Date fechaCita;
	
	@NotNull
	@NotBlank
	@Column(name="horaCita")
	private Timestamp horaCita;

	public Integer getCodigoCita() {
		return codigoCita;
	}

	public void setCodigoCita(Integer codigoCita) {
		this.codigoCita = codigoCita;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public DetalleOrdenExamenes getDetalleOrdenExamenes() {
		return detalleOrdenExamenes;
	}

	public void setDetalleOrdenExamenes(DetalleOrdenExamenes detalleOrdenExamenes) {
		this.detalleOrdenExamenes = detalleOrdenExamenes;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public DetalleOrdenReferencia getDetalleOrdenReferencia() {
		return detalleOrdenReferencia;
	}

	public void setDetalleOrdenReferencia(DetalleOrdenReferencia detalleOrdenReferencia) {
		this.detalleOrdenReferencia = detalleOrdenReferencia;
	}

	public Date getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Timestamp getHoraCita() {
		return horaCita;
	}

	public void setHoraCita(Timestamp horaCita) {
		this.horaCita = horaCita;
	}

	@Override
	public String toString() {
		return getCodigoCita().toString();
	}
}