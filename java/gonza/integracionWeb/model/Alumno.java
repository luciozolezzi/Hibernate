package gonza.integracionWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ALUMNO")
	private Long id;
	
	@Column(name="NOMBRE_ALUMNO")
	private String nombre;
	
	@Column(name="APELLIDO_ALUMNO")
	private String apellido;
	
	@Column(name="LEGAJO_ALUMNO")
	private int legajo;
	
	@Column(name="ID_REGIONAL")
	private String regional;

	public Alumno() {}
	
	public Alumno(int legajo, String nombre, String apellido, String regional) {
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
	
	public void setRegional(String regional) {
		this.regional = regional;
	}
	
	public String getRegional() {
		return regional;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

