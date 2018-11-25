package edu.ues.ECeL.models.entity.clinica.cita;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import edu.ues.ECeL.models.entity.clinica.personal.Empleado;

@Entity
@Table(name="AGENDA")
public class Agenda implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8001768206872170754L;

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer codigoAgenda;
	
	@OneToOne(mappedBy = "agenda")
	private Empleado empleado;
	
	@OneToMany(mappedBy = "agenda")
	private List<Cita> citas;
	
	@NotNull
	@NotBlank
	@Column(name="horaInicio")
	private Date horaInicio;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 100)
	@Column(name="horaFin")
	private Date horaFin;

	public Integer getCodigoAgenda() {
		return codigoAgenda;
	}

	public void setCodigoAgenda(Integer codigoAgenda) {
		this.codigoAgenda = codigoAgenda;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Cita> getCitas() {
		return citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Agenda [getCodigoAgenda()=" + getCodigoAgenda() + ", getEmpleado()=" + getEmpleado() + ", getCitas()="
				+ getCitas() + ", getHoraInicio()=" + getHoraInicio() + ", getHoraFin()=" + getHoraFin() + "]";
	}
	
}

