package http;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Client {
	public static void main(String[] args) throws URISyntaxException, InterruptedException, ExecutionException {
		
		// Creation du HTTP Client

	
		// Création de l'HttpRequest GET www.google.fr  
	
		
		// Travail en mode asynchrone avec un CompletableFuture.
		// La requête est émise, mais le thread peut continuer à travailler  

		// On revient en mode synchrone (ici le thread peut être bloqué)  
	}

}
