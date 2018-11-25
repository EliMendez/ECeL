package edu.ues.ECeL.models.entity.expediente.consulta;

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

import edu.ues.ECeL.models.entity.clinica.examen.Examen;

@Entity
@Table(name="DETALLECHEQUEFISICO")
public class DetalleChequeFisico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8674045410067565373L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoChequeo;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Examen", nullable=false)
	private Examen examen;
	
	@NotNull
	@NotBlank
	@Size(min = 50, max = 250)
	@Column(name="resultadoChequeo")
	private String resultadoChequeo;

	public Integer getCodigoChequeo() {
		return codigoChequeo;
	}

	public void setCodigoChequeo(Integer codigoChequeo) {
		this.codigoChequeo = codigoChequeo;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public String getResultadoChequeo() {
		return resultadoChequeo;
	}

	public void setResultadoChequeo(String resultadoChequeo) {
		this.resultadoChequeo = resultadoChequeo;
	}
	
	@Override
	public String toString() {
		return "DetalleChequeFisico [resultadoChequeo=" + resultadoChequeo
				+ "]";
	}
	
}
