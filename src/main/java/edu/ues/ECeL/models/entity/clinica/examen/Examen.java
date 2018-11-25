package edu.ues.ECeL.models.entity.clinica.examen;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.expediente.consulta.Clasificacion;
import edu.ues.ECeL.models.entity.expediente.consulta.DetalleChequeFisico;

@Entity
@Table(name="EXAMEN")
public class Examen implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 406021926235041088L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoExamen;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Clasificacion", nullable = false)
	private Clasificacion clasificacion;
	
	@OneToMany(mappedBy = "examen",cascade= CascadeType.ALL)
	private List<DetalleOrdenExamenes> detalleOrdenExamenes;
	
	@OneToMany(mappedBy = "examen",cascade= CascadeType.ALL)
	private List<DetalleChequeFisico> detalleChequeFisico;
	
	@NotNull
	@NotBlank
	@Size(min = 8, max = 75)
	@Column(name="nombreExamen")
	private String nombreExamen;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="descripcionExamen")
	private String descripcionExamen;
	
	public Integer getCodigoExamen() {
		return codigoExamen;
	}

	public void setCodigoExamen(Integer codigoExamen) {
		this.codigoExamen = codigoExamen;
	}

	public String getDescripcionExamen() {
		return descripcionExamen;
	}

	public void setDescripcionExamen(String descripcionExamen) {
		this.descripcionExamen = descripcionExamen;
	}

	public String getNombreExamen() {
		return nombreExamen;
	}

	public void setNombreExamen(String nombreExamen) {
		this.nombreExamen = nombreExamen;
	}
	
	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public List<DetalleOrdenExamenes> getDetalleOrdenExamenes() {
		return detalleOrdenExamenes;
	}

	public void setDetalleOrdenExamenes(List<DetalleOrdenExamenes> detalleOrdenExamenes) {
		this.detalleOrdenExamenes = detalleOrdenExamenes;
	}

	public List<DetalleChequeFisico> getDetalleChequeFisico() {
		return detalleChequeFisico;
	}

	public void setDetalleChequeFisico(List<DetalleChequeFisico> detalleChequeFisico) {
		this.detalleChequeFisico = detalleChequeFisico;
	}

	@Override
	public String toString() {
		return getCodigoExamen().toString();
	}
}