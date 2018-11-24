package edu.ues.ECeL.models.clinica.inventario;

import java.io.Serializable;
import java.util.Date;
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

@Entity
@Table(name="LOTEMEDICAMENTO")
public class LoteMedicamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7960777117400174195L;
	
	@Id
	@Column(name="numeroLote")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer numeroLote;
	
	@ManyToOne(optional=false)
	//@ForeignKey(name = "ES PRODUCIDO POR")
	@JoinColumn(name="Fabricante", nullable=false)
	private Fabricante fabricante;
	
	/*Cuando se hace uso del @OneToMany, el mappedBy hace referencia 
	al nombre de la variable que esta al otro lado de la relacion*/ 
	@OneToMany(mappedBy="numeroLote")
	private List<Medicamento> medicamentos;
	
	@NotNull
	@NotBlank
	@Size(min = 8, max = 50)
	@Column(name="nombreComercial")
	private String nombreComercial;
	
	@NotNull
	@NotBlank
	@Size(min = 8, max = 50)
	@Column(name="nombreGenerico")
	private String nombreGenerico;
	
	@NotNull
	@NotBlank
	@Column(name="fechaFabricacion")
	private Date fechaFabricacion;
	
	@NotNull
	@NotBlank
	@Column(name="fechaExpiracion")
	private Date fehcaExpiracion;
	
	@NotNull
	@NotBlank
	@Column(name="numeroRegistroSanitario")
	private Integer numeroRegistroSanitario;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="formulacion")
	private String formulacion;

	public Integer getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(Integer numeroLote) {
		this.numeroLote = numeroLote;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreGenerico() {
		return nombreGenerico;
	}

	public void setNombreGenerico(String nombreGenerico) {
		this.nombreGenerico = nombreGenerico;
	}

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public Date getFehcaExpiracion() {
		return fehcaExpiracion;
	}

	public void setFehcaExpiracion(Date fehcaExpiracion) {
		this.fehcaExpiracion = fehcaExpiracion;
	}

	public Integer getNumeroRegistroSanitario() {
		return numeroRegistroSanitario;
	}

	public void setNumeroRegistroSanitario(Integer numeroRegistroSanitario) {
		this.numeroRegistroSanitario = numeroRegistroSanitario;
	}

	public String getFormulacion() {
		return formulacion;
	}

	public void setFormulacion(String formulacion) {
		this.formulacion = formulacion;
	}
	
	@Override
	public String toString() {
		return getNumeroLote().toString();
	}

}
