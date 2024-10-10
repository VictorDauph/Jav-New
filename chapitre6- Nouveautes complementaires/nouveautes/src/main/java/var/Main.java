package var;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// L'inférence de type fonctionne avec les types primitifs, les constructeurs, les appels
		// de méthode
		var compteur = 5;
		
		System.out.println("Le résultat de l'addition vaut " + 5 + compteur);
		
		var localInference = new LocalInference();  
		System.out.println("local Inférence :"+localInference.id);
		var monSet = Set.of(1,2);
		monSet.stream().forEach((i)-> System.out.println(i));
		

		// L'inférence de type fonctionne avec classe fille -> classe mère  
		var monMetal = new Metal();
		monMetal = new Or();
		var monArgent = new Argent();
	}

}

