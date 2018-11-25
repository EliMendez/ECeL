package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="DETALLETRATAMIENTO")
public class DetalleTratamiento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -807931213510973512L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoDetalleTratamiento;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Tratamiento", nullable=false)
	private Tratamiento tratamiento;

	@ManyToOne(optional=false)
	@JoinColumn(name="Diagnostico", nullable=false)
	private Diagnostico diagnostico;
	
	@NotNull
	@NotBlank
	@Column(name="fechaInicioTratamiento")
	private Date fechaInicioDetalleTratamiento;
	
	@NotNull
	@NotBlank
	@Column(name="fechaFinTratamiento")
	private Date fechaFinDetalleTratamiento;

	public Integer getCodigoDetalleTratamiento() {
		return codigoDetalleTratamiento;
	}

	public void setCodigoDetalleTratamiento(Integer codigoDetalleTratamiento) {
		this.codigoDetalleTratamiento = codigoDetalleTratamiento;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Date getFechaInicioDetalleTratamiento() {
		return fechaInicioDetalleTratamiento;
	}

	public void setFechaInicioDetalleTratamiento(Date fechaInicioDetalleTratamiento) {
		this.fechaInicioDetalleTratamiento = fechaInicioDetalleTratamiento;
	}

	public Date getFechaFinDetalleTratamiento() {
		return fechaFinDetalleTratamiento;
	}

	public void setFechaFinDetalleTratamiento(Date fechaFinDetalleTratamiento) {
		this.fechaFinDetalleTratamiento = fechaFinDetalleTratamiento;
	}
	
	@Override
	public String toString() {
		return "DetalleTratamiento [getCodigoDetalleTratamiento()=" + getCodigoDetalleTratamiento()
				+ ", getTratamiento()=" + getTratamiento() + ", getDiagnostico()=" + getDiagnostico()
				+ ", getFechaInicioDetalleTratamiento()=" + getFechaInicioDetalleTratamiento()
				+ ", getFechaFinDetalleTratamiento()=" + getFechaFinDetalleTratamiento() + "]";
	}

}
