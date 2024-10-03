package fr.esisar.calculatrice.operations.unitaires;

import fr.esisar.calculatrice.operations.OperationUnitaire;

public class Cosinus extends OperationUnitaire {

	@Override
	protected Double docalculer(Double operande) {
		// TODO Auto-generated method stub
		return Math.cos(operande);
	}
	@Override
	public String getNom() {
		return "cos";
	}


}
