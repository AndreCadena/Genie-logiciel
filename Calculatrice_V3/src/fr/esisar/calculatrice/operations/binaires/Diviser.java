package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationBinaire;

public class Diviser extends OperationBinaire {

	@Override
	protected Double doCalculer(Double operande1, Double operande2) throws CalculatriceException {
		
		if(operande2 == 0) {
			throw new CalculatriceException("Pas possible diviser pour zero");
		}
		
		return operande1/operande2;
	}
	@Override
	public String getNom() {
		return "/";
	}

}
