package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationEnsembliste implements Operation {

	protected abstract Double docalculer(Double operandes[]);
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calculer(Double... operandes) throws CalculatriceException {
		if(operandes[0] == null) {
			throw new CalculatriceException("Ensemble vide");
		}
		
		return this.docalculer(operandes);
	}

}
