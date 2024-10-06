package lambda;

import java.util.function.Consumer;

import functionalInterfaces.Travail;

public class Machine {
	public Matiere travail(Matiere matiere, Travail traitement) {
		return traitement.appliquer(matiere);
	}
	
	public void afficheNom(Matiere matiere, Consumer<String> affichageNom) {
		affichageNom.accept(matiere.getNom());
	}
	
}
