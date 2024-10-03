package fr.esisar.calculatrice;

public class CalculatriceException extends Exception {

	private static final long serialVersionUID = 5927538120612003003L;
	
	private final String message;
	
	public CalculatriceException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "CalculatriceException [message=" + message + "]";
	}
	
}
