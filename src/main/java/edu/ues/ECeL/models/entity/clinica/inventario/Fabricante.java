package edu.ues.ECeL.models.entity.clinica.inventario;

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
@Table(name="FABRICANTE")
public class Fabricante implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1243641138879994933L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoFabricante;
	
	@OneToMany(mappedBy="fabricante")
	private List<LoteMedicamento> lotes;
	
	@NotNull
	@NotBlank
	@Size(min = 8, max = 100)
	@Column(name="nombreFabricante")
	private String nombreFabricante;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 75)
	@Column(name="nombreTitular")
	private String nombreTitular;

	public Integer getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(Integer codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}

	public List<LoteMedicamento> getLotes() {
		return lotes;
	}

	public void setLotes(List<LoteMedicamento> lotes) {
		this.lotes = lotes;
	}

	public String getNombreFabricante() {
		return nombreFabricante;
	}

	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	@Override
	public String toString() {
		return "Fabricante [getCodigoFabricante()=" + getCodigoFabricante() + ", getLotes()=" + getLotes()
				+ ", getNombreFabricante()=" + getNombreFabricante() + ", getNombreTitular()=" + getNombreTitular()
				+ "]";
	}	
}
