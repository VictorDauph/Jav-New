package virtualThreads;

public class VirtualThread{
    public static void main(String[] args) {
        // Créer et démarrer plusieurs virtual threads
        for (int i = 0; i < 1000; i++) {
            // Crée un virtual thread: ofVirtual
            Thread.ofVirtual().start(() -> {
                // Chaque thread virtuel exécute une tâche simple
                System.out.println("Virtual Thread " + Thread.currentThread().getName() + " is running.");
                try {
                    // Simuler un travail en attente
                    Thread.sleep(1000); // 1 seconde
                } catch (InterruptedException e) {
                    // Gérer l'interruption
                    System.out.println("Thread was interrupted: " + e.getMessage());
                }
                System.out.println("Virtual Thread " + Thread.currentThread().getName() + " has finished.");
            });
        }

        // Attendre que tous les threads virtuels aient terminé
        try {
            Thread.sleep(2000); // Attendre un peu plus longtemps que le temps d'exécution
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted: " + e.getMessage());
        }

    }
}
