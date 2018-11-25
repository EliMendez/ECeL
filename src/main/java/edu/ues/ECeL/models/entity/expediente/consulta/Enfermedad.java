package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="ENFERMEDAD")
public class Enfermedad implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -535386346445752470L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoEnfermedad;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 75)
	@Column(name="nombreEnfermedad")
	private String nombreEnfermedad;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 250)
	@Column(name="descripcionEnfermedad")
	private String descripcionEnfermedad;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="codigoClasificacion", nullable = false)
	private Clasificacion clasificacion;
	
	@ManyToMany(mappedBy="enfermedades")
	private List<Diagnostico> diagnosticos;

	public Integer getCodigoEnfermedad() {
		return codigoEnfermedad;
	}

	public void setCodigoEnfermedad(Integer codigoEnfermedad) {
		this.codigoEnfermedad = codigoEnfermedad;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getNombreEnfermedad() {
		return nombreEnfermedad;
	}

	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}

	public String getDescripcionEnfermedad() {
		return descripcionEnfermedad;
	}

	public void setDescripcionEnfermedad(String descripcionEnfermedad) {
		this.descripcionEnfermedad = descripcionEnfermedad;
	}
	
	public List<Diagnostico> getDiagnosticos() {
		return diagnosticos;
	}

	public void setDiagnosticos(List<Diagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}

	@Override
	public String toString() {
		return "Enfermedad [getCodigoEnfermedad()=" + getCodigoEnfermedad() + ", getClasificacion()="
				+ getClasificacion() + ", getNombreEnfermedad()=" + getNombreEnfermedad()
				+ ", getDescripcionEnfermedad()=" + getDescripcionEnfermedad() + ", getDiagnosticos()="
				+ getDiagnosticos() + "]";
	}
}
