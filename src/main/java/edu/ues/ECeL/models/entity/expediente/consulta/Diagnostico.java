package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="DIAGNOSTICO")
public class Diagnostico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5128594505883462710L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoDiagnostico;
	
	@OneToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;
	
	@ManyToMany
	@JoinTable(name="DIAGNOSTICO_ENFERMEDAD", 
	joinColumns={
			@JoinColumn(name="codigoEnfermedad", nullable=false),		
	},
	inverseJoinColumns= {
			@JoinColumn(name="codigoDiagnostico", nullable=false)
	})
	private List<Enfermedad> enfermedades;
	
	@OneToMany(mappedBy = "diagnostico")
	private List<DetalleTratamiento> detalleTratamientos;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 250)
	@Column(name="descripcionDiagnostico")
	private String descripcionDiagnostico;

	public Integer getCodigoDiagnostico() {
		return codigoDiagnostico;
	}

	public void setCodigoDiagnostico(Integer codigoDiagnostico) {
		this.codigoDiagnostico = codigoDiagnostico;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}

	public List<DetalleTratamiento> getDetalleTratamientos() {
		return detalleTratamientos;
	}

	public void setDetalleTratamientos(List<DetalleTratamiento> detalleTratamientos) {
		this.detalleTratamientos = detalleTratamientos;
	}

	public String getDescripcionDiagnostico() {
		return descripcionDiagnostico;
	}

	public void setDescripcionDiagnostico(String descripcionDiagnostico) {
		this.descripcionDiagnostico = descripcionDiagnostico;
	}
	
	@Override
	public String toString() {
		return "Diagnostico [getCodigoDiagnostico()=" + getCodigoDiagnostico() + ", getConsulta()=" + getConsulta()
				+ ", getEnfermedades()=" + getEnfermedades() + ", getDetalleTratamientos()=" + getDetalleTratamientos()
				+ ", getDescripcionDiagnostico()=" + getDescripcionDiagnostico() + "]";
	}
}
