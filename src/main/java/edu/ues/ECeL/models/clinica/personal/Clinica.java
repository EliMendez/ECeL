package edu.ues.ECeL.models.clinica.personal;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.clinica.cita.Cita;
import edu.ues.ECeL.models.clinica.rol.Departamento;

@Entity
@Table(name="CLINICA")
public class Clinica implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9079002764287945845L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoClinica;

	@NotNull
	@NotBlank
	@Size(min=10, max=25)
	@Column(name="nombreClinica")
	private String nombreClinica;
	
	@NotNull
	@NotBlank
	@Size(min=50, max=200)
	@Column(name="direccionClinica")
	private String direccionClinica;
	
	@ManyToMany
	@JoinTable(name="CARGO_CLINICA", 
	joinColumns={
			@JoinColumn(name="Clinica", nullable=false),		
	},
	inverseJoinColumns= {
			@JoinColumn(name="Cargo", nullable=false)
	})
	public List<Cargo> cargos;
	
	@ManyToMany
	@JoinTable(name="ESPECIALIDAD_CLINICA", 
	joinColumns={
			@JoinColumn(name="Clinica", nullable=false),		
	},
	inverseJoinColumns= {
			@JoinColumn(name="Especialidad", nullable=false)
	})
	public List<Especialidad> especialidades;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="codigoDepartamento", nullable=true)
	public Departamento departamento;
	
	@OneToMany(mappedBy="clinica", cascade=CascadeType.ALL)
	public List<Empleado> empleados;
	
	@OneToMany(mappedBy="clinica", cascade=CascadeType.ALL)
	public List<Unidad> unidades;
	
	@OneToMany(mappedBy="clinica", cascade=CascadeType.ALL)
	public List<Cita> citas;
	
	public Integer getCodigoClinica() {
		return codigoClinica;
	}

	public void setCodigoClinica(Integer codigoClinica) {
		this.codigoClinica = codigoClinica;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

	public List<Unidad> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidad> unidades) {
		this.unidades = unidades;
	}

	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public String getNombreClinica() {
		return nombreClinica;
	}

	public void setNombreClinica(String nombreClinica) {
		this.nombreClinica = nombreClinica;
	}

	public String getDireccionClinica() {
		return direccionClinica;
	}

	public void setDireccionClinica(String direccionClinica) {
		this.direccionClinica = direccionClinica;
	}

	@Override
	public String toString() {
		return "Clinica [nombreClinica=" + nombreClinica + "]";
	}
}
