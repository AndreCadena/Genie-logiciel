package fr.esisar.calculatrice.operations.unitaires;

import fr.esisar.calculatrice.operations.OperationUnitaire;

public class Sinus extends OperationUnitaire {

	@Override
	protected Double doCalculer(Double operande) {
		// TODO Auto-generated method stub
		return Math.sin(operande);
	}
	@Override
	public String getNom() {
		return "sin";
	}


}
