package clasesCriatura;

import java.util.Arrays;

public class Subraza extends Raza {
	private String subNombre;
	private Rasgo[] subRasgos;
	
	public String getSubNombre() {
		return subNombre;
	}
	public void setSubNombre(String subNombre) {
		this.subNombre = subNombre;
	}
	public Rasgo[] getSubRasgos() {
		return subRasgos;
	}
	public void setSubRasgos(Rasgo[] subRasgos) {
		this.subRasgos = subRasgos;
	}
	
	public Subraza(String nombre, Rasgo[] rasgos, String tamanyo, int velocidad, String subNombre, Rasgo[] subRasgos) {
		super(nombre, rasgos, tamanyo, velocidad);
		this.subNombre = subNombre;
		this.subRasgos = subRasgos;
	}
	
	public Subraza() {
		super();
		this.subNombre = "";
		Rasgo rasgo = new Rasgo();
		Rasgo[] rasgos = {rasgo};
		this.subRasgos = rasgos;
	}
	
	public String toString() {
		return "Subraza [subNombre=" + subNombre + ", subRasgos="
				+ (subRasgos != null ? Arrays.asList(subRasgos) : null) + "]";
	}

}