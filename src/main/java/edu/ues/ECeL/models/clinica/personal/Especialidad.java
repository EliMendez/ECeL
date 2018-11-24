package edu.ues.ECeL.models.clinica.personal;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.expediente.consulta.DetalleOrdenReferencia;

@Entity
@Table(name="ESPECIALIDAD")
public class Especialidad implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 411069134921384285L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoEspecialidad;
	
	@NotNull
	@NotBlank
	@Size(min=8, max=20)
	@Column(name="nombreEspecialidad")
	private String nombreEspecialidad;
	
	@NotNull
	@NotBlank
	@Size(min=50, max=250)
	@Column(name="descripcionEspecialidad")
	private String descripcionEspecialidad;
	
	@ManyToMany(mappedBy="especialidades")
	private List<Empleado> empleados; 
	
	@ManyToMany(mappedBy="especialidades")
	public List<Clinica> clinicas;

	@OneToMany(mappedBy = "especialidad", cascade=CascadeType.ALL)
	private List<DetalleOrdenReferencia> detalleOrdenReferencia;
	
	public Integer getCodigoEspecialidad() {
		return codigoEspecialidad;
	}

	public void setCodigoEspecialidad(Integer codigoEspecialidad) {
		this.codigoEspecialidad = codigoEspecialidad;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Clinica> getClinicas() {
		return clinicas;
	}

	public void setClinicas(List<Clinica> clinicas) {
		this.clinicas = clinicas;
	}

	public List<DetalleOrdenReferencia> getDetalleOrdenReferencia() {
		return detalleOrdenReferencia;
	}

	public void setDetalleOrdenReferencia(List<DetalleOrdenReferencia> detalleOrdenReferencia) {
		this.detalleOrdenReferencia = detalleOrdenReferencia;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public String getDescripcionEspecialidad() {
		return descripcionEspecialidad;
	}

	public void setDescripcionEspecialidad(String descripcionEspecialidad) {
		this.descripcionEspecialidad = descripcionEspecialidad;
	}
	
	@Override
	public String toString() {
		return getCodigoEspecialidad().toString();
	} 

}