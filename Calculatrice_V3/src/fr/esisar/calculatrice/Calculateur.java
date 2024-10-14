package fr.esisar.calculatrice;

import fr.esisar.calculatrice.operations.*;
import fr.esisar.calculatrice.operations.binaires.*;
import fr.esisar.calculatrice.operations.ensemblistes.*;
import fr.esisar.calculatrice.operations.unaires.*;

public class Calculateur extends Calculatrice{
	
	
	public static void main (String args[]) throws CalculatriceException {
		
		Operation ajouter = new Ajouter();
		Operation soustraire = new Soustraire();
		Operation multiplier = new Multiplier();
		Operation diviser = new Diviser();
		Operation cosinus = new Cosinus();
		Operation sinus = new Sinus();
		Operation tangente = new Tangente();
		Operation absolute = new ValeurAbsolute();
		Operation max = new Maximum();
		Operation min = new Minimum();
		
		Calculatrice c1 = new Calculatrice();
		Calculatrice c2 = new Calculatrice();
		Calculatrice c3 = new Calculatrice();
		
		
		
		Double[] binarie = {5.0,2.0};
		
		Double[] unaire = {Math.PI};
		
		Double[] liste = {null};
		
		c1.ajouterOperation(ajouter);
		c1.ajouterOperation(soustraire);
		c1.ajouterOperation(multiplier);
		c1.ajouterOperation(diviser);
		
		c2.ajouterOperation(cosinus);
		c2.ajouterOperation(sinus);
		c2.ajouterOperation(tangente);
		c2.ajouterOperation(absolute);
		
		c3.ajouterOperation(max);
		c3.ajouterOperation(min);
		
		System.out.println(c1.calculer("+",binarie));
		System.out.println(c1.calculer("-",binarie));
		System.out.println(c1.calculer("*",binarie));
		System.out.println(c1.calculer("/",binarie));
		
		System.out.println(c2.calculer("cos",unaire));
		System.out.println(c2.calculer("sin",unaire));
		System.out.println(c2.calculer("tan",unaire));
		System.out.println(c2.calculer("abs",unaire));
		
		System.out.println(c3.calculer("max",liste));
		System.out.println(c3.calculer("min",liste));
		
		c1.retirerOperation(ajouter);
		
		
	}
	
}
