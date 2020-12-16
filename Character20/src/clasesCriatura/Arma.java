package clasesCriatura;

public class Arma {
	private String nombre;
	
	//Las armas son simple o martial
	private boolean marcial;
	
	private String danyo;
	private String tipo;
	
	//Las propiedades son cosas como Finesse, light, heavy o two-handed
	//llegan a acumularse hasta 4 con las ballestas
	private String propiedad1;
	private String propiedad2;
	private String propiedad3;
	private String propiedad4;
	
	
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
	public String getPropiedad1() {
		return propiedad1;
	}
	public void setPropiedad1(String propiedad1) {
		this.propiedad1 = propiedad1;
	}
	public String getPropiedad2() {
		return propiedad2;
	}
	public void setPropiedad2(String propiedad2) {
		this.propiedad2 = propiedad2;
	}
	public String getPropiedad3() {
		return propiedad3;
	}
	public void setPropiedad3(String propiedad3) {
		this.propiedad3 = propiedad3;
	}
	public String getPropiedad4() {
		return propiedad4;
	}
	public void setPropiedad4(String propiedad4) {
		this.propiedad4 = propiedad4;
	}
	
	//Constructor
	public Arma(String nombre, boolean marcial, String daño, String tipo, String propiedad1, String propiedad2,
			String propiedad3, String propiedad4) {
		super();
		this.nombre = nombre;
		this.marcial = marcial;
		this.danyo = daño;
		this.tipo = tipo;
		this.propiedad1 = propiedad1;
		this.propiedad2 = propiedad2;
		this.propiedad3 = propiedad3;
		this.propiedad4 = propiedad4;
	}
	
	public Arma() {
		super();
		this.nombre = "";
		this.marcial = false;
		this.danyo = "";
		this.tipo = "";
		this.propiedad1 = "";
		this.propiedad2 = "";
		this.propiedad3 = "";
		this.propiedad4 = "";
	}
	
	public String toString() {
		return "Arma [nombre=" + nombre + ", marcial=" + marcial + ", daño=" + danyo + ", tipo=" + tipo + ", propiedad1="
				+ propiedad1 + ", propiedad2=" + propiedad2 + ", propiedad3=" + propiedad3 + ", propiedad4="
				+ propiedad4 + "]";
	}
	
	
}
