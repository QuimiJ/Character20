package clasesCriatura;

public class Rasgo {
	String contenido;

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Rasgo(String contenido) {
		super();
		this.contenido = contenido;
	}
	
	public Rasgo() {
		super();
		this.contenido = null;
	}

	public String toString() {
		return "Rasgo [contenido=" + contenido + "]";
	}
	
}