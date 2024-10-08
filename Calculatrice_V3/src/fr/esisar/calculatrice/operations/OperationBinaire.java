package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationBinaire implements Operation {

	protected abstract Double doCalculer(Double operande1, Double operande2) throws CalculatriceException;
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculer(Double... operandes) throws CalculatriceException {
			if(operandes.length != 2) {
				throw new CalculatriceException(" Cette operation besoin ne que 2 operandes");
			}
		return this.doCalculer(operandes[0],operandes[1]);
	}
	

}
