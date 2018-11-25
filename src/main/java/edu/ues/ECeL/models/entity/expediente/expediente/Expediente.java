package edu.ues.ECeL.models.entity.expediente.expediente;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.clinica.cita.Cita;
import edu.ues.ECeL.models.entity.clinica.examen.ContestacionExamen;
import edu.ues.ECeL.models.entity.clinica.rol.Persona;
import edu.ues.ECeL.models.entity.expediente.consulta.Consulta;

@Entity
@Table(name="EXPEDIENTE")
public class Expediente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8979749559733827857L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoExpediente;
	
	@NotNull
	@NotBlank
	@Column(name="fechaCreacion")
	private Date fechaCreacion;
	
	@OneToOne
	@JoinColumn(name="codigoPersona")
	private Persona persona;

	@OneToMany(mappedBy = "expediente")
	private List<NotaEnfermeria> notaEnfermeria;

	@OneToMany(mappedBy = "expediente")
	private List<Consulta> consultas;
	
	@OneToMany(mappedBy = "expediente")
	private List<Cita> citas;
	
	@OneToMany(mappedBy = "expediente")
	private List<HistoriaClinica> historiaClinica;

	@OneToMany(mappedBy = "expediente")
	private List<ContestacionExamen> contestacionExamen;

	public Integer getCodigoExpediente() {
		return codigoExpediente;
	}

	public void setCodigoExpediente(Integer codigoExpediente) {
		this.codigoExpediente = codigoExpediente;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<NotaEnfermeria> getNotaEnfermeria() {
		return notaEnfermeria;
	}

	public void setNotaEnfermeria(List<NotaEnfermeria> notaEnfermeria) {
		this.notaEnfermeria = notaEnfermeria;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public List<HistoriaClinica> getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(List<HistoriaClinica> historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	
	public List<ContestacionExamen> getContestacionExamen() {
		return contestacionExamen;
	}

	public void setContestacionExamen(List<ContestacionExamen> contestacionExamen) {
		this.contestacionExamen = contestacionExamen;
	}

	@Override
	public String toString() {
		return getCodigoExpediente().toString();
	};
}