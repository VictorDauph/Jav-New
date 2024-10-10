package lambda;

import functionalInterfaces.Travail;

public class Machine {
	public Matiere travail(Matiere matiere, Travail traitement) {
		return traitement.appliquer(matiere);
	}
}
