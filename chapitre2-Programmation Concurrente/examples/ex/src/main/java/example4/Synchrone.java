package example4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import example2.LongTaskRunnable;

public class Synchrone {
	public static void main(String[] args) {
		// Mesurer le temps de début
		long startTime = System.currentTimeMillis();
        
		Runnable runnable = new LongTaskRunnable();  
		runnable.run();
		runnable.run();
		runnable.run();
		runnable.run();
		       
        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis(); // Utiliser currentTimeMillis pour des millisecondes

        // Calculer et afficher le temps d'exécution
        long duration = endTime - startTime; // en millisecondes
        System.out.println("Temps d'exécution : " + duration + " millisecondes");

	}

}
