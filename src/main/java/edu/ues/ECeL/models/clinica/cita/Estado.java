package edu.ues.ECeL.models.clinica.cita;

import java.io.Serializable;
import java.util.List;

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

@Entity
@Table(name="ESTADO")
public class Estado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2709721067280908985L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoEstado;
	
	@OneToMany(mappedBy = "estado")
	private List<Cita> citas;
	
	@NotNull
	@NotBlank
	@Size(min = 8, max = 20)
	@Column(name="nombreEstado")
	private String nombreEstado;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="descripcionEstado")
	private String descripcionEstado;

	public Integer getCodigoEstado() {
		return codigoEstado;
	}

	public void setCodigoEstado(Integer codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

	public String getDescripcionEstado() {
		return descripcionEstado;
	}

	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}

	@Override
	public String toString() {
		return getCodigoEstado().toString();
	}
}
