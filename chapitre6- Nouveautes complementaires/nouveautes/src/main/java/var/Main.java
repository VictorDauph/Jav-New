package var;

import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

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
		
		 Function<List<String>,Integer> lambda =(List<String> list) -> list.size() ; // Ici, le type des paramètres est explicitement donné
		
		 Function<List<String>,Integer> lambda2 =(var list) -> list.size();  // Ici, tous les paramètres utilisent `var`
		
		 BiFunction<List<String>,String,Integer> lambda3 = (var list, var s) -> list.size() ; // Erreur : on mélange `var` et une déclaration typée explicite



		
		
	}

}

