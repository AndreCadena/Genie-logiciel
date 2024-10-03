package fr.esisar.calculatrice.operations.unitaires;

import fr.esisar.calculatrice.operations.OperationUnitaire;

public class Tangente extends OperationUnitaire {

	@Override
	protected Double docalculer(Double operande) {
		// TODO Auto-generated method stub
		return Math.tan(operande);
	}
	@Override
	public String getNom() {
		return "tan";
	}


}
