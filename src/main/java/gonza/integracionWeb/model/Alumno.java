package gonza.integracionWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ALUMNOS")
public class Alumno {

	@Id
	@Column(name = "LEGAJO")
	private int legajo;
	
	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO")
	private String apellido;
	
	@OneToOne
	@Column(name = "REGIONAL")
	private Facultad regional;

	public Alumno() {}
	
	public Alumno(int legajo, String nombre, String apellido, Facultad regional) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.regional = regional;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	
	public void setRegional(Facultad regional) {
		this.regional = regional;
	}
	
	public Facultad getRegional() {
		return regional;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", regional=" + regional.getLugar()
				+ "]";
	}
	
}

