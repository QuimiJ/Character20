package mainWindowAndTest;

import clasesCriatura.*;
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import org.junit.Test;

public class TestMethods {
	
	//Tests para comprobar el funcionamiento correcto de varios metodos:
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
		assertEquals(2, tStat.getModifier());
	}
	
	
}