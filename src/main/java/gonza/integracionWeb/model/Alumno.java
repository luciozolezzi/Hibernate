package gonza.integracionWeb.model;

import org.springframework.stereotype.Component;

@Component
public class Alumno {

	private String nombre;
	private String apellido;
	private int legajo;
	private String regional;

	public Alumno() {
		
		System.out.println("No bardees Gonza");
	}
	
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
	
}

