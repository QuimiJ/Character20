package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CharacterDB {

	private static Connection con;
	
	protected void BD() {
		// TODO
		Thread hilo = new Thread(new Runnable() {

			@Override
			public void run() {
				iniciaDB();
				
				//Meterlo mejor en SQL
				/*if () {
					createDB();
				}*/
				
				try {
					/*for (int i=0; i<t.size(); i++) {
						String nombre = t.get( i, "Nombre" );
						String correo = t.get( i, "Correo" );
						int duracion = calcMinutos( t.get( i, "Duración" ) );*/
						updateDB();
						
						selectDB();
					//}
				} catch (Exception e) {
					e.printStackTrace();
				}
				closeDB();	
			}
		});
		hilo.start();
	}
	
	private void iniciaDB() throws ClassNotFoundException {
		//PROBLEMA AQUI
		Class.forName("com.mysql.sqlite.jdbc.driver");
		con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:sqlite:character.db");
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private void createDB() {
		try {
			Statement statement = con.createStatement();
			statement.executeUpdate("drop table *");
			//tinyint es el boolean de mysql, considerar si quitar los booleanos
			statement.executeUpdate("create table Personaje (name String, "
					+ "life Integer, AC Integer, speed Integer, "
					+ "str Stat, dex Stat, con Stat, intel Stat, wis Stat, cha Stat, "
					+ "strsave Integer, dexsave Integer, consave Integer, intsave Integer, wissave Integer, chasave Integer, "
					+ "acrobacias Integer, tratoAnimales Integer, arcana Integer, atletismo Integer, enganyo Integer, historia Integer, perspicacia Integer, intimidacion Integer, investigacion Integer, medicina Integer, naturaleza Integer, percepcion Integer, interpretacion Integer, persuasion Integer, religion Integer, juegoManos Integer, sigilo Integer, supervivencia Integer, "
					//Para almacenar los arrays hay que pasarlos a texto
					+ "bonoCompetencia Integer, iniciativa Integer, armas Arma[], clasePj Clase, hechizos Hechizo[]"
					+ "piezaCobre Integer, piezaPlata Integer, piezaOro Integer, piezaElectrum Integer, piezaPlatino Integer, "
					+ "equipo String, tesoro String, "
					+ "idiomas String, rasgosPersonalidad String, ideales String, vinculos String, defectos String, raza Raza, subraza Subraza)");
			statement.executeUpdate("create table Stat(score Integer, modifier Integer)");
			statement.executeUpdate("create table Arma(nombre String, marcial tinyint, danyo String, tipo String, "
					+ "propiedad1 String, propiedad2 String, propiedad3 String, propiedad4 String)");
			statement.executeUpdate("create table Hechizo(spellName String, level Integer, school String, castingTime String, range Integer, components String, duration String, description String)");
			statement.executeUpdate("create table Clase(nombre String, hitdie String, rasgos Rasgo[], simpleProficiency tinyint, martialProficiency tinyint)");
			statement.executeUpdate("create table Rasgo(contenido String)");
			statement.executeUpdate("create table Raza(nombre String, rasgos Rasgo[], tamanyo String, velocidad Integer)");
			statement.executeUpdate("create table Subraza(subNombre String, subRasgos Rasgo[])");			
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private void updateDB() {
		try {
			Statement statement = con.createStatement();
			
			
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private void selectDB() {
		try {
			Statement statement = con.createStatement();
			
			
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	private void closeDB() {
		try {
			con.close();
		} catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
