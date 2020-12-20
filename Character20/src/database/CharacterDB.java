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
				
				try {
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
