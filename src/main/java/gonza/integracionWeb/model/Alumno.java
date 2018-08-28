package gonza.integracionWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ALUMNOS")
public class Alumno {

	@Id
	@GeneratedValue
	@Column
	private int id_Alumno;
	
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

	public void setId_Alumno(int id_Alumno) {
		this.id_Alumno = id_Alumno;
	}
	
	public int getId_Alumno() {
		return id_Alumno;
	}

	@Override
	public String toString() {
		return "Alumno [id_Alumno=" + id_Alumno + ", legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", regional=" + regional.getLugar() + "]";
	}
	
	
	
}

