package clasesCriatura;

import java.util.Arrays;

public class Clase {
	String nombre;
	String hitdie;
	String[] rasgos;
	boolean simpleproficiency;
	boolean martialproficiency;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHitdie() {
		return hitdie;
	}
	public void setHitdie(String hitdie) {
		this.hitdie = hitdie;
	}
	public String[] getRasgos() {
		return rasgos;
	}
	public void setRasgos(String[] rasgos) {
		this.rasgos = rasgos;
	}
	public boolean isSimpleproficiency() {
		return simpleproficiency;
	}
	public void setSimpleproficiency(boolean simpleproficiency) {
		this.simpleproficiency = simpleproficiency;
	}
	public boolean isMartialproficiency() {
		return martialproficiency;
	}
	public void setMartialproficiency(boolean martialproficiency) {
		this.martialproficiency = martialproficiency;
	}
	
	public Clase(String nombre, String hitdie, String[] rasgos, boolean simpleproficiency, boolean martialproficiency) {
		super();
		this.nombre = nombre;
		this.hitdie = hitdie;
		this.rasgos = rasgos;
		this.simpleproficiency = simpleproficiency;
		this.martialproficiency = martialproficiency;
	}
	
	public Clase() {
		super();
		this.nombre = "";
		this.hitdie = "";
		this.rasgos = null;
		this.simpleproficiency = false;
		this.martialproficiency = false;
	}
	
	public String toString() {
		return "Clase [nombre=" + nombre + ", hitdie=" + hitdie + ", rasgos="
				+ (rasgos != null ? Arrays.asList(rasgos) : null) + ", simpleproficiency=" + simpleproficiency
				+ ", martialproficiency=" + martialproficiency + "]";
	}

	
	
}