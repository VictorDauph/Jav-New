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

        // Optionnel : attendre que la transaction soit terminée

    }
}