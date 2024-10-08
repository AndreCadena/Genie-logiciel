package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationUnitaire implements Operation {

	protected abstract Double doCalculer(Double operande);
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculer(Double... operandes) throws CalculatriceException {
		if(operandes.length != 1) {
			throw new CalculatriceException(" Cette operation besoin ne que 1 operande");
		}
	return this.doCalculer(operandes[0]);
	}

}
