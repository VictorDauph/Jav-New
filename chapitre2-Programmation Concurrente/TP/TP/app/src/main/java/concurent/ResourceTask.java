package concurent;

import java.util.concurrent.CompletableFuture;

import CustomExceptions.TransactionException;

//Supprimer Ressource Task dans l'énoncé
public class ResourceTask implements Runnable {

    private HeavyResource resource;

    public ResourceTask(HeavyResource resource) {
        this.resource = resource;
    }


    public void run() {
        // Utilisation de CompletableFuture pour exécuter beginTransaction et endTransaction
        CompletableFuture<Void> transactionFuture;
		try {
			transactionFuture = resource.beginTransaction()
			        .thenCompose(v -> {
						try {
							return resource.endTransaction();
						} catch (InterruptedException | TransactionException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							return CompletableFuture.completedFuture(null);
						}
					});
	        // Optionnel : attendre que la transaction soit terminée
	        transactionFuture.join(); // Bloque le thread jusqu'à la fin de la transaction
		} catch (InterruptedException | TransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}