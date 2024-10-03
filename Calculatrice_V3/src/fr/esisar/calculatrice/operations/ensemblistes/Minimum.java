package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Minimum extends OperationEnsembliste {

	@Override
	protected Double docalculer(Double operandes[]) {
		Double min = 0.0;
		
		for(int i=0; i<operandes.length; i++ ) {
			if(min > operandes[i]) {
				min = operandes[i];
			}
		}
		return min;
	}
	@Override
	public String getNom() {
		return "min";
	}
}
