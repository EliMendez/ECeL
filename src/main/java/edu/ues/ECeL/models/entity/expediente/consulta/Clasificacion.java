package edu.ues.ECeL.models.entity.expediente.consulta;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.clinica.examen.Examen;
import edu.ues.ECeL.models.entity.clinica.inventario.Medicamento;

@Entity
@Table(name="CLASIFICACION")
public class Clasificacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3927493456595265943L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoClasificacion;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="nombreClasificacion")
	private String nombreClasificacion;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 250)
	@Column(name="descripcionClasificacion")
	private String descripcionClasificacion;
	
	@OneToMany(mappedBy="clasificacion")
	private List<Medicamento> medicamentos;

	@OneToMany(mappedBy="clasificacion")
	private List<Examen> examenes;
	
	@OneToMany(mappedBy="clasificacion")
	private List<Enfermedad> enfermedades;
	
	@OneToMany(mappedBy="clasificacion")
	private List<Clasificacion> subClasificaciones;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name="CLASIFICACION_SUBCLASIFICACION",
		joinColumns={
				@JoinColumn(name="SubClasificacion")
		},
		inverseJoinColumns= {
				@JoinColumn(name="Clasificacion")
		}
	)
	private Clasificacion clasificacion;

	public Integer getCodigoClasificacion() {
		return codigoClasificacion;
	}

	public void setCodigoClasificacion(Integer codigoClasificacion) {
		this.codigoClasificacion = codigoClasificacion;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}

	public List<Enfermedad> getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(List<Enfermedad> enfermedades) {
		this.enfermedades = enfermedades;
	}

	public List<Clasificacion> getSubClasificaciones() {
		return subClasificaciones;
	}

	public void setSubClasificaciones(List<Clasificacion> subClasificaciones) {
		this.subClasificaciones = subClasificaciones;
	}

	public String getNombreClasificacion() {
		return nombreClasificacion;
	}

	public void setNombreClasificacion(String nombreClasificacion) {
		this.nombreClasificacion = nombreClasificacion;
	}

	public String getDescripcionClasificacion() {
		return descripcionClasificacion;
	}

	public void setDescripcionClasificacion(String descripcionClasificacion) {
		this.descripcionClasificacion = descripcionClasificacion;
	}
	
	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return getCodigoClasificacion().toString();
	}

}