package fr.esisar.calculatrice.operations;

public class Multiplier implements Operation {

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	public Double calculer(Double operande1, Double operande2) {
		// TODO Auto-generated method stub
		return operande1 * operande2;
	}

}
