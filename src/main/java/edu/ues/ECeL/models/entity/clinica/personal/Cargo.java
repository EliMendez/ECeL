package edu.ues.ECeL.models.entity.clinica.personal;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="CARGO")
public class Cargo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4237616967451753744L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoCargo;
	
	@NotNull
	@NotBlank
	@Size(min=10, max=25)
	@Column(name="nombreCargo")
	private String nombreCargo;
	
	@NotNull
	@NotBlank
	@Size(min=50, max=250)
	@Column(name="descripcionCargo")
	private String descripcionCargo; 
	
	@NotNull
	@NotBlank
	@DecimalMin(value="1", message="El monto del salario debe ser mayor a 1")
	@Column(name="salario")
	private Double salario;
	
	@OneToMany(mappedBy = "cargo")
	private List<Empleado> empleados;
	
	@ManyToMany(mappedBy="cargos")
	public List<Clinica> clinicas;
	
	public Integer getCodigoCargo() {
		return codigoCargo;
	}

	public void setCodigoCargo(Integer codigoCargo) {
		this.codigoCargo = codigoCargo;
	}

	public List<Clinica> getClinicas() {
		return clinicas;
	}

	public void setClinicas(List<Clinica> clinicas) {
		this.clinicas = clinicas;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getNombreCargo() {
		return nombreCargo;
	}

	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}

	public String getDescripcionCargo() {
		return descripcionCargo;
	}

	public void setDescripcionCargo(String descripcionCargo) {
		this.descripcionCargo = descripcionCargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return getCodigoCargo().toString();
	}
}