package edu.ues.ECeL.models.entity.expediente.consulta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="SIGNOSVITALES")
public class SignosVitales implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5020567352124442837L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoSignosVitales;
	
	@OneToOne(optional=false)
	@JoinColumn(name="Consulta", nullable=false)
	private Consulta consulta;
	
	@NotNull
	@NotBlank
	@Min(1)
	@Max(500)
	@Column(name="presionArterialDiastolica")
	private double presionArterialDiastolica;
	
	@NotNull
	@NotBlank
	@Min(1)
	@Max(500)
	@Column(name="presionArterialSistolica")
	private double presionArterialSistolica;
	
	@NotNull
	@NotBlank
	@DecimalMin(value="0")
	@DecimalMax(value="50")
	@Column(name="temperatura")
	private double temperatura;
	
	@NotNull
	@NotBlank
	@DecimalMin(value="1", message="Ingrese un valor en libras mayor a 10")
	@DecimalMax(value="700", message="Ingrese un valor en libras menor que 700")
	@Column(name="masaCorporal")
	private double masaCorporal;
	
	@NotNull
	@NotBlank
	@DecimalMin(value="0.20", message="Ingrese un valor en metros mayor a 0.20")
	@DecimalMax(value="2.50", message="Ingrese un valor en metros menor que 2.50")
	@Column(name="estatura")
	private double estatura;

	@NotNull
	@NotBlank
	@Min(value=40, message="Ingrese un valor mayor que 40 latidos por minuto")
	@Max(value=200, message="Ingrese un valor menor que 200 latidos por minuto")
	@Column(name="ritmoCardiaco")
	private double ritmoCardiaco;

	public Integer getCodigoSignosVitales() {
		return codigoSignosVitales;
	}

	public void setCodigoSignosVitales(Integer codigoSignosVitales) {
		this.codigoSignosVitales = codigoSignosVitales;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public double getPresionArterialDiastolica() {
		return presionArterialDiastolica;
	}

	public void setPresionArterialDiastolica(double presionArterialDiastolica) {
		this.presionArterialDiastolica = presionArterialDiastolica;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getMasaCorporal() {
		return masaCorporal;
	}

	public void setMasaCorporal(double masa) {
		this.masaCorporal = masa;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getRitmoCardiaco() {
		return ritmoCardiaco;
	}

	public void setRitmoCardiaco(double ritmoCardiaco) {
		this.ritmoCardiaco = ritmoCardiaco;
	}
	
	public double getPresionArterialSistolica() {
		return presionArterialSistolica;
	}

	public void setPresionArterialSistolica(double presionArterialSistolica) {
		this.presionArterialSistolica = presionArterialSistolica;
	}

	@Override
	public String toString() {
		return getCodigoSignosVitales().toString();
	}
}