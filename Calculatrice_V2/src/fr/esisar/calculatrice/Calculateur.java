package fr.esisar.calculatrice;
import fr.esisar.calculatrice.operations.*;
public class Calculateur {
	
	public static void main (String [] args) throws CalculatriceException {
		
		Calculatrice c1 = new Calculatrice();
		
		Operation a1 = new Ajouter();
		Operation s1 = new Soustraire();
		Operation m1 = new Multiplier();
		Operation d1 = new Diviser();
		
		c1.ajouterOperation(d1);
		c1.ajouterOperation(m1);
		c1.ajouterOperation(s1);
		c1.ajouterOperation(a1);
		
		Double a = 4.0;
		Double b = 2.0;
		
		System.out.println("Operande 1 est:" + a);
		System.out.println("Operande 2 est:" + b);
		System.out.println("Ajouter:" + c1.calculer("+", a, b));
		System.out.println("Soustraire:" + c1.calculer("-", a, b));
		System.out.println("Multiplier:" + c1.calculer("*", a, b));
		System.out.println("Diviser:" + c1.calculer("/", a, b));
		
		
	}

}
