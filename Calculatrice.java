package fr.esisar.calculatrice;
import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

public class Calculatrice {
	Set<Operation> operations = new HashSet<>();
	
	public void ajouterOperation(Operation operation) {
		operations.add(operation);
	}
	
	public Operation chercherOperation(String nom) throws CalculatriceException {
		for (Operation operation : operations) {
			if(nom == operation.getNom()) {
				return operation;
			}
		}
		return null;
	}
	
	public Double calculer(String nom, Double operande1, Double operande2) throws CalculatriceException {
		Operation operation = chercherOperation(nom);
		if (operation == null) {
			throw new CalculatriceException("Operation inexistante");
		}
		return operation.calculer(operande1, operande2);
	}

}
