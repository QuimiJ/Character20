package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CharacterDB {

	private Connection con;

	public CharacterDB() throws CharacterDBException {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new CharacterDBException("Error al cargar el driver.", e);
		}
	}
	
	public void iniciaDB() throws CharacterDBException {
		try {
			con = DriverManager.getConnection("jdbc:sqlite:characterDB.db");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CharacterDBException("Error al inciar la base de datos.", e);
		}
	}
	
	//Por hacer
	public void updateDB() throws CharacterDBException {
		try {
			Statement stmt = con.createStatement();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CharacterDBException("Error al actualizar la base de datos.", e);
		}
	}
	
	//Por hacer
	public void selectDB() throws CharacterDBException {
		try {
			Statement stmt = con.createStatement();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CharacterDBException("No se ha podido recoger informacion de la base de datos.", e);
		}
	}
	
	public void closeDB() throws CharacterDBException {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new CharacterDBException("No se ha podido cerrar la conexion a la base de datos.", e);
		}
	}
}
