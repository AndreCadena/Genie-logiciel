package fr.esisar.calculatrice.operations.unitaires;

import fr.esisar.calculatrice.operations.OperationUnitaire;

public class ValeurAbsolue extends OperationUnitaire {

	@Override
	protected Double docalculer(Double operande) {
		// TODO Auto-generated method stub
		return Math.abs(operande);
	}
	@Override
	public String getNom() {
		return "abs";
	}


}
