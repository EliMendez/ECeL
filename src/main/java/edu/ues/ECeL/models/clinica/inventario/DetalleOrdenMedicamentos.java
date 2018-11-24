package edu.ues.ECeL.models.clinica.inventario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.expediente.consulta.OrdenMedicamentos;

@Entity
@Table(name="DETALLEORDENMEDICAMENTOS")
public class DetalleOrdenMedicamentos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1494493047462355958L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoDetalleOrdenMedicamento;

	@ManyToOne(optional=false)
	@JoinColumn(name="Medicamento", nullable=false)
	private Medicamento medicamento;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="OrdenMedicamentos", nullable=false)
	private OrdenMedicamentos ordenMedicamentos;
	
	@NotNull
	@NotBlank
	@Min(1)
	@Column(name="cantidad")
	private Integer cantidad;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="indicacion")
	private String indicacion;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="frecuencia")
	private String frecuencia;
	
	public Integer getCodigoDetalleOrdenMedicamento() {
		return codigoDetalleOrdenMedicamento;
	}

	public void setCodigoDetalleOrdenMedicamento(Integer codigoDetalleOrdenMedicamento) {
		this.codigoDetalleOrdenMedicamento = codigoDetalleOrdenMedicamento;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getIndicacion() {
		return indicacion;
	}

	public void setIndicacion(String indicacion) {
		this.indicacion = indicacion;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public OrdenMedicamentos getOrdenMedicamento() {
		return ordenMedicamentos;
	}

	public void setOrdenMedicamento(OrdenMedicamentos ordenMedicamento) {
		this.ordenMedicamentos = ordenMedicamento;
	}

	@Override
	public String toString() {
		return getCodigoDetalleOrdenMedicamento().toString();
	}
}