package clasesCriatura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Un Personaje tiene una Raza
public class Raza {
	protected String nombre;
	protected List<String> rasgos;
	protected String tamanyo;
	protected int velocidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getRasgos() {
		return rasgos;
	}
	public void setRasgos(List<String> rasgos) {
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
	
	public Raza(String nombre, List<String> rasgos, String tamanyo, int velocidad) {
		super();
		this.nombre = nombre;
		this.rasgos = rasgos;
		this.tamanyo = tamanyo;
		this.velocidad = velocidad;
	}
	
	public Raza() {
		super();
		this.nombre = "";
		String rasgs = "";
		List<String> rasgos = new ArrayList<String>();
		rasgos.add(rasgs);
		this.rasgos = rasgos;
		this.tamanyo = "";
		this.velocidad = 0;
	}
	
	@Override
	public String toString() {
		return "Raza [nombre=" + nombre + ", rasgos=" + rasgos + ", tamanyo=" + tamanyo + ", velocidad=" + velocidad
				+ "]";
	}
}