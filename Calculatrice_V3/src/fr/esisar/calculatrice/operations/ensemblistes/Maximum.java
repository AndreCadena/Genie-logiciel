package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Maximum extends OperationEnsembliste {
	@Override
	protected Double docalculer(Double operandes[]) {
		Double max = 0.0;
		
		for(int i=0; i<operandes.length; i++ ) {
			if(max< operandes[i]) {
				max = operandes[i];
			}
		}
		return max;
	}
	
	@Override
	public String getNom() {
		return "max";
	}

}
