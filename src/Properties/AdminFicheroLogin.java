package Properties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class AdminFicheroLogin {
	public static void main(String[] args) {
		Properties objetoP = new Properties();
		
		try {
			objetoP.load(new FileInputStream("login.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i = 0;
		String usuario = "", contrasenya = "";
		
		for (i = 0; i < 200; i++) {
			if (objetoP.getProperty("numero" + Integer.toString(i)) == null) {
				System.out.println("Introduce un nombre de usuario.");
				Scanner sc = new Scanner(System.in);
				usuario = sc.nextLine();
				objetoP.setProperty("usuario" + Integer.toString(i), usuario);
				System.out.println("Introduce una contrasenya (de no mas de 10 caracteres).");
				contrasenya = sc.nextLine();
				objetoP.setProperty("contrasenya" + Integer.toString(i), contrasenya);
				objetoP.setProperty("numero" + Integer.toString(i), Integer.toString(i));
				i=200;
			}
		}

		try {
			objetoP.store(new FileWriter("login.properties"), "operacion exitosa");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}