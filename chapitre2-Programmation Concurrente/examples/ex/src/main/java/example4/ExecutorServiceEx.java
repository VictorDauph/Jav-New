package example4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import example2.LongTaskRunnable;

public class ExecutorServiceEx {
	public static void main(String[] args) {
		// Mesurer le temps de début
		long startTime = System.currentTimeMillis();
		
				Runnable runnable = new LongTaskRunnable();  
				ExecutorService executorService =  Executors.newFixedThreadPool(3);  
				executorService.execute(runnable);  
				executorService.execute(runnable);  
				executorService.execute(runnable);  
				executorService.execute(runnable);  
				executorService.shutdown();
		  		
		
		
		// Attendre que toutes les tâches soient terminées avant de mesurer le temps
        while (!executorService.isTerminated()) {
            // On peut ajouter un délai pour éviter une boucle trop gourmande
            try {
                Thread.sleep(10); // Pause de 10 ms pour éviter une boucle CPU intensive
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis(); // Utiliser currentTimeMillis pour des millisecondes

        // Calculer et afficher le temps d'exécution
        long duration = endTime - startTime; // en millisecondes
        System.out.println("Temps d'exécution : " + duration + " millisecondes");

	}

}
