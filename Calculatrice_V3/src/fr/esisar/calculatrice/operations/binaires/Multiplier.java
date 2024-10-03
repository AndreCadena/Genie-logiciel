package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.operations.OperationBinaire;

public class Multiplier extends OperationBinaire {

	@Override
	protected Double doCalculer(Double operande1, Double operande2) {
		// TODO Auto-generated method stub
		return operande1*operande2;
	}
	@Override
	public String getNom() {
		return "*";
	}

}
