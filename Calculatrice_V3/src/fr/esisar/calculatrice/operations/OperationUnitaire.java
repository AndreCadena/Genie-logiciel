package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationUnitaire implements Operation {

	protected abstract Double docalculer(Double operande);
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculer(Double... operandes) throws CalculatriceException {
		// TODO Auto-generated method stub
		return null;
	}

}
