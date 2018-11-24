package edu.ues.ECeL.models.clinica.rol;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="MUNICIPIO")
public class Municipio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3755608350903641762L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoMunicipio;	
	
	@NotNull
	@NotBlank
	@Size(min=5, max=25)
	@Column(name="nombreMunicipio")
	private String nombreMunicipio;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Departamento", nullable=false)
	private Departamento departamento;

	public Integer getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return getNombreMunicipio();
	}

}