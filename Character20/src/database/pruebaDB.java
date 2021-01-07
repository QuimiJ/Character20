package database;

import javax.swing.SwingUtilities;

import database.CharacterDB;
import database.CharacterDBException;

public class pruebaDB {

	private CharacterDB characterDB;
	
	public pruebaDB() {
	
		try {
			characterDB = new CharacterDB();
			characterDB.iniciaDB();
			characterDB.closeDB();
		} catch (CharacterDBException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new pruebaDB();
	}
}
