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

@Entity
@Table(name="ORDENREFERENCIAS")
public class OrdenReferencias implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3947365113587529236L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoReferencia;
	
	@OneToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;
	
	@OneToMany(mappedBy="ordenReferencias")
	private List<DetalleOrdenReferencia> detalleOrdenReferencia;

	public Integer getCodigoReferencia() {
		return codigoReferencia;
	}

	public void setCodigoReferencia(Integer codigoReferencia) {
		this.codigoReferencia = codigoReferencia;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<DetalleOrdenReferencia> getDetalleOrdenReferencia() {
		return detalleOrdenReferencia;
	}
	
	@Override
	public String toString() {
		return getCodigoReferencia().toString();
	}
}
