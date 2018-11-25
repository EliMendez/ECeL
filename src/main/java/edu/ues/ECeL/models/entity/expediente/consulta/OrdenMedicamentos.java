package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;
import java.util.Date;
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

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.clinica.inventario.DetalleOrdenMedicamentos;

@Entity
@Table(name="ORDENEMEDICAMENTOS")
public class OrdenMedicamentos implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1464377950625623985L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoOrdenMedicamentos;
	
	@OneToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;
	
	@OneToMany(mappedBy="ordenMedicamentos")
	private List<DetalleOrdenMedicamentos> detalleOrdenMedicamentos;
	
	@NotNull
	@NotBlank
	@Column(name="fechaCaducidad")
	private Date fechaCaducidad;
	
	@NotBlank
	@Column(name="fechaEntrega")
	private Date fechaEntrega;
	
	@NotNull
	@NotBlank
	@Column(name="isDespachada")
	private boolean isDespachada;

	public Integer getCodigoOrdenMedicamentos() {
		return codigoOrdenMedicamentos;
	}

	public void setCodigoOrdenMedicamentos(Integer codigoOrdenMedicamentos) {
		this.codigoOrdenMedicamentos = codigoOrdenMedicamentos;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<DetalleOrdenMedicamentos> getDetalleOrdenMedicamentos() {
		return detalleOrdenMedicamentos;
	}

	public void setDetalleOrdenMedicamentos(List<DetalleOrdenMedicamentos> detalleOrdenMedicamentos) {
		this.detalleOrdenMedicamentos = detalleOrdenMedicamentos;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public boolean isDespachada() {
		return isDespachada;
	}

	public void setDespachada(boolean isDespachada) {
		this.isDespachada = isDespachada;
	}
	
	@Override
	public String toString() {
		return getCodigoOrdenMedicamentos().toString();
	}
}