package gonza.integracionWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facultad {
	
	@Id
	@Column
	private	int iD_Facultad;
	@Column
	private String lugar;
	
	
	public Facultad(int iD_Facultad, String lugar) {
		this.iD_Facultad = iD_Facultad;
		this.lugar = lugar;
	}

	public int getID_Facultad() {
		return iD_Facultad;
	}
	
	public void setID_Facultad(int iD_Facultad) {
		this.iD_Facultad = iD_Facultad;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	@Override
	public String toString() {
		return "Facultad [ID_Facultad=" + iD_Facultad + ", lugar=" + lugar + "]";
	}
	
	
}
