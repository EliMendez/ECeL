package edu.ues.ECeL.models.entity.clinica.rol;

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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="PERMISO")
public class Permiso implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2433835916990335889L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoPermiso;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="nombrePermiso")
	private String nombrePermiso;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 255)
	@Column(name="codeName")
	private String codeName;
	
	@ManyToOne(optional=false)
	private TipoContenido tipoContenido;
	
	@ManyToMany(mappedBy = "permisos")
	private List<Persona> personas;
	
	@ManyToMany
	@JoinTable(
		name="PERMISOS_GRUPOS",
		joinColumns={
				@JoinColumn(name="Permiso", nullable=false)
			},
		inverseJoinColumns= {
				@JoinColumn(name="Grupo", nullable=false)
		}
	)
	public List<Grupo> grupos;

	public Integer getCodigoPermiso() {
		return codigoPermiso;
	}

	public void setCodigoPermiso(Integer codigoPermiso) {
		this.codigoPermiso = codigoPermiso;
	}

	public String getNombrePermiso() {
		return nombrePermiso;
	}

	public void setNombrePermiso(String nombrePermiso) {
		this.nombrePermiso = nombrePermiso;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public TipoContenido getTipoContenido() {
		return tipoContenido;
	}

	public void setTipoContenido(TipoContenido tipoContenido) {
		this.tipoContenido = tipoContenido;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		return "Permiso [getCodigoPermiso()=" + getCodigoPermiso() + ", getNombrePermiso()=" + getNombrePermiso()
				+ ", getCodeName()=" + getCodeName() + ", getTipoContenido()=" + getTipoContenido() + ", getPersonas()="
				+ getPersonas() + ", getGrupos()=" + getGrupos() + "]";
	}
}
