package clasesCriatura;

import java.util.Arrays;

public class Raza {
	protected String nombre;
	protected String[] rasgos;
	protected String tamanyo;
	protected int velocidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String[] getRasgos() {
		return rasgos;
	}
	public void setRasgos(String[] rasgos) {
		this.rasgos = rasgos;
	}
	public String getTamanyo() {
		return tamanyo;
	}
	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public Raza(String nombre, String[] rasgos, String tamanyo, int velocidad) {
		super();
		this.nombre = nombre;
		this.rasgos = rasgos;
		this.tamanyo = tamanyo;
		this.velocidad = velocidad;
	}
	
	public Raza() {
		super();
		this.nombre = "";
		String rasgs[] = {"", "", ""};
		String[] rasgos = rasgs;
		this.rasgos = rasgos;
		this.tamanyo = "";
		this.velocidad = 0;
	}
	
	public String toString() {
		return "Raza [nombre=" + nombre + ", rasgos=" + (rasgos != null ? Arrays.asList(rasgos) : null) + ", tamanyo="
				+ tamanyo + ", velocidad=" + velocidad + "]";
	}
	

}