package example7.completableFuture;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Créer un CompletableFuture pour interroger l'API
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                // URL de l'API publique pour obtenir des informations sur un utilisateur (ex: utilisateur 1)
                @SuppressWarnings("deprecation")
				URL url = new URL("https://jsonplaceholder.typicode.com/users/1");

                // Ouverture de la connexion HTTP
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                // Vérifier si la réponse est 200 (OK)
                int responseCode = conn.getResponseCode();
                if (responseCode != 200) {
                    throw new RuntimeException("HttpResponseCode: " + responseCode);
                }

                // Lire la réponse de l'API
                Scanner sc = new Scanner(url.openStream());
                StringBuilder jsonResponse = new StringBuilder();
                while (sc.hasNext()) {
                    jsonResponse.append(sc.nextLine());
                }
                sc.close();

                // Retourner la réponse en String
                return jsonResponse.toString();

            } catch (IOException e) {
                throw new IllegalStateException("Erreur lors de l'appel à l'API", e);
            }
        });

        // Traitement de la réponse une fois disponible
        future.thenAccept(response -> {
            System.out.println("Réponse de l'API : " + response);
        });

        // Attendre que la future soit terminée pour éviter que le programme se termine trop tôt
        future.join();
    }
}
