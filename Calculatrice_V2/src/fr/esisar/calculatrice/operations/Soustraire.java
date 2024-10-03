package fr.esisar.calculatrice.operations;

public class Soustraire implements Operation {

	@Override
	public String getNom() {
		
		return "-";
	}

	@Override
	public Double calculer(Double operande1, Double operande2) {
		
		return operande1 - operande2;
	}

}
