package concurent;
import java.util.concurrent.*;

public class Main {

	public static void main(String[] args) {
        int numberOfRunnables = 5;  // Nombre de tâches à exécuter
        
        // Création d'une barrière qui attendra le démarrage de 5 threads (numberOfRunnables)

        
        // Créer un ExecutorService avec un FixedThreadPool de 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        
        // Lancer les Runnables, on passe la barrière en param de chaque runnable pour qu'ils soient bloqués, jusqu'à que le 5 ème l'atteigne
        for (int i = 0; i < numberOfRunnables; i++) {
            executorService.submit(new TaskRunnable()); 
        }
        
        // Arrêter l'ExecutorService après l'exécution des tâches
        executorService.shutdown();
    }
}
