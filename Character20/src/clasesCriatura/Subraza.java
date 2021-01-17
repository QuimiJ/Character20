package clasesCriatura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Un personaje tiene una Subraza (que hereda de Raza)
public class Subraza extends Raza {
	private String subNombre;
	private List<String> subRasgos;
	
	public String getSubNombre() {
		return subNombre;
	}
	public void setSubNombre(String subNombre) {
		this.subNombre = subNombre;
	}
	public List<String> getSubRasgos() {
		return subRasgos;
	}
	public void setSubRasgos(List<String> subRasgos) {
		this.subRasgos = subRasgos;
	}
	public Subraza(String nombre, List<String> rasgos, String tamanyo, int velocidad, String subNombre, List<String> subRasgos) {
		super(nombre, rasgos, tamanyo, velocidad);
		this.subNombre = subNombre;
		this.subRasgos = subRasgos;
	}
	
	public Subraza() {
		super();
		this.subNombre = "";
		String rasgs = "";
		List<String> rasgos = new ArrayList<String>();
		rasgos.add(rasgs);
		this.subRasgos = rasgos;
	}
	
	@Override
	public String toString() {
		return "Subraza [subNombre=" + subNombre + ", subRasgos=" + subRasgos + "]";
	}
}