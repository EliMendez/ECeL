package edu.ues.ECeL.models.expediente.consulta;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.expediente.consulta.OrdenExamenes;
import edu.ues.ECeL.models.expediente.expediente.Expediente;

@Entity
@Table(name="CONSULTA")
public class Consulta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4540956810831576019L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoConsulta;
	
	@OneToOne(optional=true,cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="ConsultaAntecesora", nullable=true)
	private Consulta consultaAntecesora;
	
	@OneToOne(optional=true, cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name="ConsultaSucesora", nullable=true)
	private Consulta consultaSucesora;
	
	@OneToOne(optional=true, mappedBy="consulta")
	private OrdenExamenes ordenExamenes;
	
	@OneToOne(optional=true, mappedBy="consulta")
	private OrdenReferencias ordenReferencias;
	
	@OneToOne(optional=true, mappedBy="consulta")
	private OrdenMedicamentos ordenMedicamentos;
	
	@OneToOne(optional=true, mappedBy="consulta")
	private SignosVitales signosVitales;

	@OneToOne(optional=true, mappedBy="consulta")
	private PerfilDieta perfilDieta;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="codigoExpediente", nullable=false)
	private Expediente expediente;
	
	@OneToOne(optional=true, mappedBy="consulta")
	private Diagnostico diagnostico;
	
	@OneToOne(optional=true, mappedBy="consulta")
	private Incapacidad incapacidad;

	@OneToMany(mappedBy = "consulta")
	private List<DetalleChequeFisico> detalleChequeoFisico;

	@NotNull
	@NotBlank
	@Size(min = 100, max = 250)
	@Column(name="resumenCaso")
	private String resumenCaso;
	
	@NotNull
	@NotBlank
	@Column(name="fechaConsulta")
	private Date fechaConsulta;

	public Integer getCodigoConsulta() {
		return codigoConsulta;
	}

	public void setCodigoConsulta(Integer codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
	}

	public OrdenExamenes getOrdenExamenes() {
		return ordenExamenes;
	}

	public void setOrdenExamenes(OrdenExamenes ordenExamenes) {
		this.ordenExamenes = ordenExamenes;
	}

	public SignosVitales getSignosVitales() {
		return signosVitales;
	}

	public void setSignosVitales(SignosVitales signosVitales) {
		this.signosVitales = signosVitales;
	}

	public OrdenMedicamentos getOrdenMedicamentos() {
		return ordenMedicamentos;
	}

	public void setOrdenMedicamentos(OrdenMedicamentos ordenMedicamentos) {
		this.ordenMedicamentos = ordenMedicamentos;
	}

	public PerfilDieta getPerfilDieta() {
		return perfilDieta;
	}

	public void setPerfilDieta(PerfilDieta perfilDieta) {
		this.perfilDieta = perfilDieta;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	public OrdenReferencias getOrdenReferencias() {
		return ordenReferencias;
	}

	public void setOrdenReferencias(OrdenReferencias ordenReferencias) {
		this.ordenReferencias = ordenReferencias;
	}

	public Incapacidad getIncapacidad() {
		return incapacidad;
	}

	public void setIncapacidad(Incapacidad incapacidad) {
		this.incapacidad = incapacidad;
	}

	public List<DetalleChequeFisico> getDetalleChequeoFisico() {
		return detalleChequeoFisico;
	}

	public void setDetalleChequeoFisico(List<DetalleChequeFisico> detalleChequeoFisico) {
		this.detalleChequeoFisico = detalleChequeoFisico;
	}

	public String getResumenCaso() {
		return resumenCaso;
	}

	public void setResumenCaso(String resumenCaso) {
		this.resumenCaso = resumenCaso;
	}

	public Date getFecha() {
		return fechaConsulta;
	}

	public void setFecha(Date fecha) {
		this.fechaConsulta = fecha;
	}
	
	public Consulta getConsultaAntecesora() {
		return consultaAntecesora;
	}

	public void setConsultaAntecesora(Consulta consultaAntecesora) {
		this.consultaAntecesora = consultaAntecesora;
	}

	public Consulta getConsultaSucesora() {
		return consultaSucesora;
	}

	public void setConsultaSucesora(Consulta consultaSucesora) {
		this.consultaSucesora = consultaSucesora;
	}

	public Date getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}    

	@Override
	public String toString() {
		return getCodigoConsulta().toString();
	}
	
}