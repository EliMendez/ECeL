package edu.ues.ECeL.models.clinica.inventario;

import java.io.Serializable;
import java.util.List;

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

import edu.ues.ECeL.models.expediente.consulta.Clasificacion;

@Entity
@Table(name="MEDICAMENTO")
public class Medicamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5227367251496477827L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoMedicamento;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="numeroLote", nullable=false)
	private LoteMedicamento numeroLote;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Clasificacion", nullable=true)
	private Clasificacion clasificacion;
	
	@OneToMany(mappedBy="medicamento")
	private List<DetalleOrdenMedicamentos> detalleOrdenMedicamentos;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="")
	private String condicionAlmacenamiento;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="viaAdministracion")
	private String viaAdministracion;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="contraIndicaciones")
	private String contraIndicaciones;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="descripcionMedicamento")
	private String descripcionMedicamento;
	
	@NotNull
	@NotBlank
	@Size(min = 2, max = 10)
	@Column(name="unidadMedida")
	private String unidadMedida;
	
	@NotNull
	@NotBlank
	@Column(name="isAgitable")
	private boolean isAgitable;
	
	@NotNull
	@NotBlank
	@Column(name="isAlejadoMenores")
	private boolean isAlejadoMenores;

	public Integer getCodigoMedicamento() {
		return codigoMedicamento;
	}

	public void setCodigoMedicamento(Integer codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}

	public LoteMedicamento getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(LoteMedicamento numeroLote) {
		this.numeroLote = numeroLote;
	}

	public Clasificacion getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasificacion clasificacion) {
		this.clasificacion = clasificacion;
	}

	public List<DetalleOrdenMedicamentos> getDetalleOrdenMedicamentos() {
		return detalleOrdenMedicamentos;
	}

	public void setDetalleOrdenMedicamentos(List<DetalleOrdenMedicamentos> detalleOrdenMedicamentos) {
		this.detalleOrdenMedicamentos = detalleOrdenMedicamentos;
	}

	public String getCondicionAlmacenamiento() {
		return condicionAlmacenamiento;
	}

	public void setCondicionAlmacenamiento(String condicionAlmacenamiento) {
		this.condicionAlmacenamiento = condicionAlmacenamiento;
	}

	public String getViaAdministracion() {
		return viaAdministracion;
	}

	public void setViaAdministracion(String viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
	}

	public String getContraIndicaciones() {
		return contraIndicaciones;
	}

	public void setContraIndicaciones(String contraIndicaciones) {
		this.contraIndicaciones = contraIndicaciones;
	}

	public String getDescripcionMedicamento() {
		return descripcionMedicamento;
	}

	public void setDescripcionMedicamento(String descripcionMedicamento) {
		this.descripcionMedicamento = descripcionMedicamento;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public boolean isAgitable() {
		return isAgitable;
	}

	public void setAgitable(boolean isAgitable) {
		this.isAgitable = isAgitable;
	}

	public boolean isAlejadoMenores() {
		return isAlejadoMenores;
	}

	public void setAlejadoMenores(boolean isAlejadoMenores) {
		this.isAlejadoMenores = isAlejadoMenores;
	}

	@Override
	public String toString() {
		return getCodigoMedicamento().toString();
	}
	
}
