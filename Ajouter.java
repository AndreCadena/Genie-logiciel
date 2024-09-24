package fr.esisar.calculatrice.operations;

public class Ajouter implements Operation {

	@Override
	public String getNom() {
		return "+";
	}

	@Override
	public Double calculer(Double operande1, Double operande2) {
		// TODO Auto-generated method stub
		return operande1 + operande2;
	}

}
