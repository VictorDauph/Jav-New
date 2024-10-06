package functionalInterfaces;

import lambda.Matiere;

@FunctionalInterface
public interface Travail {
	Matiere appliquer(Matiere matiere);
}
