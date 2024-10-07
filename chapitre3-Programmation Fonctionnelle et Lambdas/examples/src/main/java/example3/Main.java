package example3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> entiers = new ArrayList<>();  
		entiers.add(1);
		entiers.add(2);  
		entiers.add(30);  
		
		//stream1 forEache avec lambda
		entiers.stream().forEach(i ->  System.out.println("stream 1 : "+i));
		
		//stream2 filter avant le forEach
		entiers.stream()
		.filter(v -> v == 1)
		.forEach(i ->  System.out.println("stream 2 : "+i));
		
		//stream3 mapper dans une nouvelle variable le résultat des traitements
		long somme = entiers.stream()
				.filter(v -> v<10)
				.mapToInt(i -> i)
				.sum();

		
		System.out.println("stream 4 entrée: "+entiers);
		System.out.println("stream 3 sortie: "+somme);
		
		//stream4: reconstruire une collection en sortie de stream
		List<Integer> newList =  entiers.stream()
				.filter(v -> v < 10)
				.collect(Collectors.toList());
		
		System.out.println("stream 4 entrée : "+entiers);
		System.out.println("stream 4: sortie"+ newList);
		
		//stream: calculs sur threads parrallèles:
		List<Integer> newListMultiThread =  entiers.parallelStream()
				.filter(v -> v < 10)
				.collect(Collectors.toList());
		
		System.out.println("stream 5: "+ newListMultiThread);


	}

}
