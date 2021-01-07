package database;

public class CharacterDBException extends Exception {
	
	public CharacterDBException(String message) {
		super(message);
	}
	
	public CharacterDBException(String message, Throwable t) {
		super(message, t);
	}
}
