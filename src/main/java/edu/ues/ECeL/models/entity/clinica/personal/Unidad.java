package edu.ues.ECeL.models.entity.clinica.personal;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="UNIDAD")
public class Unidad implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5800798265687699194L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoUnidad;

	@NotNull
	@NotBlank
	@Size(min=5, max=25)
	@Column(name="nombreUnidad")
	private String nombreUnidad;
	
	@NotNull
	@NotBlank
	@Size(min=50, max=250)
	@Column(name="descripcionUnidad")
	private String descripcionUnidad;
	
	@OneToMany(mappedBy = "unidad")
	private List<Empleado> empleados; 
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "Clinica", nullable=false)
	private Clinica clinica;

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public Integer getCodigoUnidad() {
		return codigoUnidad;
	}

	public void setCodigoUnidad(Integer codigoUnidad) {
		this.codigoUnidad = codigoUnidad;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}
	
	public String getDescripcionUnidad() {
		return descripcionUnidad;
	}

	public void setDescripcionUnidad(String descripcionUnidad) {
		this.descripcionUnidad = descripcionUnidad;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Unidad [nombreUnidad=" + nombreUnidad + "]";
	}
}
