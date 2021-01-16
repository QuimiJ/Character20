package clasesCriatura;

import java.util.Arrays;

public class Subraza extends Raza {
	private String subNombre;
	private String[] subRasgos;
	
	public String getSubNombre() {
		return subNombre;
	}
	public void setSubNombre(String subNombre) {
		this.subNombre = subNombre;
	}
	public String[] getSubRasgos() {
		return subRasgos;
	}
	public void setSubRasgos(String[] subRasgos) {
		this.subRasgos = subRasgos;
	}
	
	public Subraza(String nombre, String[] rasgos, String tamanyo, int velocidad, String subNombre, String[] subRasgos) {
		super(nombre, rasgos, tamanyo, velocidad);
		this.subNombre = subNombre;
		this.subRasgos = subRasgos;
	}
	
	public Subraza() {
		super();
		this.subNombre = "";
		String rasgs[] = {"", "", ""};
		String[] rasgos = rasgs;
		this.subRasgos = rasgos;
	}
	
	public String toString() {
		return "Subraza [subNombre=" + subNombre + ", subRasgos="
				+ (subRasgos != null ? Arrays.asList(subRasgos) : null) + "]";
	}

}