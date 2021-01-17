package clasesCriatura;

public class Arma {
	private String nombre;
	
	//Las armas son simple o martial
	private boolean marcial;
	
	private String danyo;
	private String tipo;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isMarcial() {
		return marcial;
	}
	public void setMarcial(boolean marcial) {
		this.marcial = marcial;
	}
	public String getDanyo() {
		return danyo;
	}
	public void setDanyo(String daño) {
		this.danyo = daño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//Constructor
	public Arma(String nombre, boolean marcial, String daño, String tipo, String propiedad1, String propiedad2,
			String propiedad3, String propiedad4) {
		super();
		this.nombre = nombre;
		this.marcial = marcial;
		this.danyo = daño;
		this.tipo = tipo;
	}
	
	public Arma() {
		super();
		this.nombre = "";
		this.marcial = false;
		this.danyo = "";
		this.tipo = "";
	}
	
	public String toString() {
		return "Arma [nombre=" + nombre + ", marcial=" + marcial + ", daño=" + danyo + ", tipo=" + tipo;
	}
	
	
}
