package Example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Création d'un CompletableFuture
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                // Simuler un délai de calcul (0 à 3 secondes)
                long delay = (long) (Math.random() * 3);
                TimeUnit.SECONDS.sleep(delay);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            // Retourner le carré d'un nombre (ex: 5)
            return 5 * 5;
        });

        // Traitement du résultat une fois qu'il est disponible
        future.thenAccept(result -> {
            System.out.println("Le résultat du calcul est : " + result);
        });

        // Attendre que le future soit terminé pour éviter que le programme se termine trop tôt
        future.join();
    }
}
