package edu.ues.ECeL.models.clinica.rol;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="GRUPO")
public class Grupo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7966514686175173453L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoGrupo;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="nombreGrupo")
	private String nombreGrupo;
	
	@ManyToMany(mappedBy = "grupos")
	private List<Persona> personas;
	
	@ManyToMany(mappedBy = "grupos")
	private List<Permiso> permisos;

	public Integer getCodigoGrupo() {
		return codigoGrupo;
	}

	public void setCodigoGrupo(Integer codigoGrupo) {
		this.codigoGrupo = codigoGrupo;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	
	@Override
	public String toString() {
		return getCodigoGrupo().toString();
	}
	
}
