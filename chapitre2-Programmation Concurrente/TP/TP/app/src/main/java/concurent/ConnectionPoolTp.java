package concurent;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import CustomExceptions.TransactionException;

public class ConnectionPoolTp {

    public static void main(String[] args) {
        HeavyResource heavyResourceA = new HeavyResource(1, "Resource A");
        HeavyResource heavyResourceB = new HeavyResource(2, "Resource B");
        HeavyResource heavyResourceC = new HeavyResource(3, "Resource C");

        ResourceTask taskA = new ResourceTask(heavyResourceA);
        ResourceTask taskB = new ResourceTask(heavyResourceB);
        ResourceTask taskC = new ResourceTask(heavyResourceC);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(taskA);
        executorService.execute(taskB);
        executorService.execute(taskC);

        executorService.shutdown();
    }
	//à décommenter pour l'énoncé du TP
	/*
	public static void main(String[] args) {
        HeavyResource heavyResourceA = new HeavyResource(1, "Resource A");
        HeavyResource heavyResourceB = new HeavyResource(2, "Resource B");
        HeavyResource heavyResourceC = new HeavyResource(3, "Resource C");

        HeavyResource[] resources = {heavyResourceA, heavyResourceB, heavyResourceC};
        Random random = new Random();

        for (int i = 0; i < 10; i++) { // Call each resource 10 times
            int index = random.nextInt(resources.length);
            HeavyResource selectedResource = resources[index];

            try {
                selectedResource.beginTransaction();
                // Here you can add code to do work with the resource
                selectedResource.endTransaction();
            } catch (InterruptedException | TransactionException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    */
}
