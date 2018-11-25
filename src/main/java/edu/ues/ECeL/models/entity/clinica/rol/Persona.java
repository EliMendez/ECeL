package edu.ues.ECeL.models.entity.clinica.rol;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.clinica.personal.Empleado;
import edu.ues.ECeL.models.entity.expediente.expediente.Expediente;

@Entity
@Table(name="PERSONA")
public class Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1133595067714077767L;

	@Id
	@Column(name="dui")
	private String dui;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 50)
	@Column(name="nombrePersona")
	private String nombrePersona;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 50)
	@Column(name="apellidoPerson")
	private String apellidoPersona; 
	
	@NotNull
	@NotBlank
	@Column(name="fechaNacimiento")
	private Date fechaNacimiento;
	
	@NotNull
	@NotBlank
	@Size(min = 8, max = 10)
	@Column(name="telefono")
	private Integer telefono;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="direccion")
	private String direccion;
	
	@NotNull
	@NotBlank
	@Size(min = 5, max = 10)
	@Column(name="genero")
	private String genero;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Email
	@Column(name="email")
	private String email;
	
	@NotNull
	@NotBlank
	@Size(min = 8, max = 100)
	@Column(name="passwprd")
	private String password;
	
	@NotNull
	@NotBlank
	@Column(name="isAtive")
	private boolean isActive;
	
	@NotNull
	@NotBlank
	@Column(name="dateJoined")
	private Date dateJoined;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Departamento", nullable=false)
	private Departamento departamento;
	
	@ManyToMany
	@JoinTable(
		name="PERSONA_GRUPO", 
		joinColumns={
			@JoinColumn(name="Persona", nullable=false),		
		},
		inverseJoinColumns= {
			@JoinColumn(name="Grupo", nullable=false)
		}
	)
	public List<Grupo> grupos;
	
	@ManyToMany
	@JoinTable(
		name="PERSONA_PERMISO", 
		joinColumns={
			@JoinColumn(name="Persona", nullable=false),		
		},
		inverseJoinColumns= {
			@JoinColumn(name="Permiso", nullable=false)
		}
	)
	private List<Permiso> permisos;
	
	@OneToMany(mappedBy="persona")
	private List<AdminLog> adminLog;
	
	@OneToOne(mappedBy="persona", optional=true)
	private Empleado empleado;
	
	@OneToOne(mappedBy="persona", optional=true)
	private Expediente expediente;

	public String getDui() {
		return dui;
	}

	public void setDui(String dui) {
		this.dui = dui;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public List<Permiso> getPermisos() {
		return permisos;
	}

	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	public List<AdminLog> getAdminLog() {
		return adminLog;
	}

	public void setAdminLog(List<AdminLog> adminLog) {
		this.adminLog = adminLog;
	}

	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return email;
	}

	public void setCorreo(String correo) {
		this.email = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		return "Persona [getDui()=" + getDui() + ", getNombrePersona()=" + getNombrePersona() + ", getPermisos()="
				+ getPermisos() + ", getAdminLog()=" + getAdminLog() + ", getApellidoPersona()=" + getApellidoPersona()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getTelefono()=" + getTelefono()
				+ ", getDireccion()=" + getDireccion() + ", getGenero()=" + getGenero() + ", getCorreo()=" + getCorreo()
				+ ", getPassword()=" + getPassword() + ", isActive()=" + isActive() + ", getDepartamento()="
				+ getDepartamento() + ", getEmpleado()=" + getEmpleado() + ", getExpediente()=" + getExpediente()
				+ ", getEmail()=" + getEmail() + ", getDateJoined()=" + getDateJoined() + ", getGrupos()=" + getGrupos()
				+ "]";
	}
	
}