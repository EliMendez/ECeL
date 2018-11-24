package edu.ues.ECeL.models.expediente.consulta;

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

import edu.ues.ECeL.models.clinica.examen.DetalleOrdenExamenes;

@Entity
@Table(name="ORDENEXAMENES")
public class OrdenExamenes implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7890733777684539895L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoOrdenExamenes;
	
	@OneToMany(mappedBy="ordenExamenes")
	private List<DetalleOrdenExamenes> detalleOrdenExamenes;
	
	@OneToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;

	public Integer getCodigoOrdenExamenes() {
		return codigoOrdenExamenes;
	}

	public void setCodigoOrdenExamenes(Integer codigoOrdenExamenes) {
		this.codigoOrdenExamenes = codigoOrdenExamenes;
	}

	public List<DetalleOrdenExamenes> getDetalleOrdenExamenes() {
		return detalleOrdenExamenes;
	}

	public void setDetalleOrdenExamenes(List<DetalleOrdenExamenes> detalleOrdenExamenes) {
		this.detalleOrdenExamenes = detalleOrdenExamenes;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	@Override
	public String toString() {
		return getCodigoOrdenExamenes().toString();
	}
	
}