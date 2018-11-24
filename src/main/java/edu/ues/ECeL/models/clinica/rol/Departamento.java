package edu.ues.ECeL.models.clinica.rol;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.clinica.personal.Clinica;


@Entity
@Table(name="DEPARTAMENTO")
public class Departamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8497424620163284784L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoDepartamento;
	
	@NotNull
	@NotBlank
	@Size(min=5, max=25)
	@Column(name="nombreDepartamento")
	private String nombreDepartamento;

	@OneToMany(mappedBy = "departamento")
	private List<Municipio> municipios;
	
	@OneToMany(mappedBy = "departamento")
	private List<Persona> personas;
	
	@OneToMany(mappedBy = "departamento", cascade=CascadeType.ALL)
	private List<Clinica> clinicas;

	public Integer getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(Integer codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public List<Clinica> getClinicas() {
		return clinicas;
	}

	public void setClinicas(List<Clinica> clinicas) {
		this.clinicas = clinicas;
	}
	
	
	@Override
	public String toString() {
		return getNombreDepartamento();
	}
}