package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

public class Calculatrice {
private Set<Operation> operations = new HashSet<>();
	
	public Calculatrice() {
		super();
	}

	public Calculatrice(Set<Operation> operations) {
	super();
	this.operations = operations;
	}

	public void ajouterOperation(Operation operation) {
		operations.add(operation);
	}
	
	public void retirerOperation(Operation operation) {
		operations.remove(operation);
	}
	
	public Operation chercherOperation(String nom) throws CalculatriceException {
		for (Operation operation : operations) {
			if(nom.equals(operation.getNom())) {
				return operation;
			}
		}
		return null;
	}
	
	public Double calculer(String nom, Double ... operandes) throws CalculatriceException {
		Operation operation = chercherOperation(nom);
		if (operation == null) {
			throw new CalculatriceException("Operation inexistante");
		}
		return operation.calculer(operandes);
	}

}
