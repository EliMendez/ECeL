package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="TRATAMIENTO")
public class Tratamiento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1972606151681310269L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoTratamiento;
	
	@OneToOne
	@JoinColumn(name="PerfilDieta")
	private PerfilDieta perfilDieta;
	
	@OneToMany(mappedBy="tratamiento")
	private List<DetalleTratamiento> detalleTratamiento;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="nombreTratamiento")
	private String nombreTratamiento;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 250)
	@Column(name="descripcionTratamiento")
	private String descripcionTratamiento;

	public Integer getCodigoTratamiento() {
		return codigoTratamiento;
	}

	public void setCodigoTratamiento(Integer codigoTratamiento) {
		this.codigoTratamiento = codigoTratamiento;
	}

	public PerfilDieta getPerfilDieta() {
		return perfilDieta;
	}

	public void setPerfilDieta(PerfilDieta perfilDieta) {
		this.perfilDieta = perfilDieta;
	}

	public List<DetalleTratamiento> getDetalleTratamiento() {
		return detalleTratamiento;
	}

	public void setDetalleTratamiento(List<DetalleTratamiento> detalleTratamiento) {
		this.detalleTratamiento = detalleTratamiento;
	}

	public String getNombreTratamiento() {
		return nombreTratamiento;
	}

	public void setNombreTratamiento(String nombreTratamiento) {
		this.nombreTratamiento = nombreTratamiento;
	}

	public String getDescripcionTratamiento() {
		return descripcionTratamiento;
	}

	public void setDescripcionTratamiento(String descripcionTratamiento) {
		this.descripcionTratamiento = descripcionTratamiento;
	}
	
	@Override 
	public String toString() {
		return getCodigoTratamiento().toString();
	}
	
}
