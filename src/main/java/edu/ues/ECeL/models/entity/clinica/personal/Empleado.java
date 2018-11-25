package edu.ues.ECeL.models.entity.clinica.personal;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import edu.ues.ECeL.models.entity.clinica.cita.Agenda;
import edu.ues.ECeL.models.entity.clinica.rol.Persona;

@Entity
@Table(name="EMPLEADO")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5684840308505094012L;

	@Id
	@Column(name="codigoEmpleado")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoEmpleado;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "Cargo", nullable=true)
	private Cargo cargo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "Unidad", nullable=false)
	private Unidad unidad;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "Clinica", nullable=false)
	private Clinica clinica;
	
	@ManyToMany
	@JoinTable(name="EMPLEADO_ESPECIALIDAD", 
	joinColumns={
			@JoinColumn(name="Empleado", nullable=true),		
	},
	inverseJoinColumns= {
			@JoinColumn(name="Especialidad", nullable=true)
	})
	private List<Especialidad> especialidades;
	
	@OneToMany(mappedBy="jefe")
	private List<Empleado> empleados;
	
	@ManyToOne(optional=false)
	@JoinTable(name="JEFE_EMPLEADO", 
	joinColumns={
			@JoinColumn(name="Jefe", nullable=true),		
	},
	inverseJoinColumns= {
			@JoinColumn(name="Empleado", nullable=true)
	})
	private Empleado jefe;
	
	@OneToOne
	@JoinColumn(name = "Persona", nullable=false)
	private Persona persona;
	
	@OneToOne
	@JoinColumn(name="Agenda")
	private Agenda agenda;

	public Integer getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(Integer codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return getCodigoEmpleado().toString();
	}
}