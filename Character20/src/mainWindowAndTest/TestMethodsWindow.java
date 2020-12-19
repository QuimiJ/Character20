package mainWindowAndTest;

import clasesCriatura.*;
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.JTextField;
import org.junit.Test;

public class TestMethodsWindow extends Window {
	
	public static JLabel tLabel = new JLabel();
	public static JTextField tTextField = new JTextField();
	public static JTextField tTextField2 = new JTextField();
	public static Personaje tCharacter = new Personaje();
	public static Arma tArma = new Arma("Espada", false, null, null, null, null, null, null);
	public static Arma tArmas[] = {tArma, null, null};
	
	//Tests para comprobar el funcionamiento correcto de varios metodos de:
	//(Los dos siguientes son parte de la clase Window)
	//Metodo storeOrLoadProperties si String operacion = "load"
	@Test
	public void testLoad() {
		//Datos para el test
		tCharacter.setSpeed(50);
		tCharacter.setIntsave(3);
		tCharacter.setArmas(tArmas);
		tLabel.setText("50");
		tTextField.setText("3");
		tTextField2.setText("Espada");
		//Uso del metodo a chequear
		tCharacter = storeOrLoadProperties("load", tCharacter, "test");
		assertEquals(Integer.toString(tCharacter.getSpeed()), tLabel.getText());
		assertEquals(Integer.toString(tCharacter.getIntsave()), tTextField.getText());
		assertEquals(tCharacter.getArmas()[0].getNombre(), tTextField2.getText());
	}
	//Metodo backgroundProperties. Almacena en un fichero de properties el color actual del fondo
	@Test
	public void testBackgroundProperties() {
		Properties tObjetoP = new Properties();
		try {
			tObjetoP.load(new FileInputStream("background.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (Objects.equals(tObjetoP.getProperty("color"), "WHITE")) {
			assertEquals("WHITE" , tObjetoP.getProperty("color"));
		} else {
			assertEquals("BLACK" , tObjetoP.getProperty("color"));
		}
	}
	
	//Metodo setScore de la claseCriatura Stat, que adapta el int modifier en funcion del int score.
	@Test
	public void testSetScore() {
		Stat tStat = new Stat();
		tStat.setScore(15);
		assertEquals(tStat.getModifier(), 2);
	}
}