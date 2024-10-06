package concurent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class RandomCallable implements Callable<Integer> {

	public RandomCallable() {}
	@Override
	public Integer call() throws Exception {
		System.out.println("callable lancé");
        Random random = new Random();
        int delay = 5 + random.nextInt(6); // Génère un délai entre 5 et 10 secondes
        int randomNumber = random.nextInt(100); // Génère un nombre aléatoire entre 0 et 99
        TimeUnit.SECONDS.sleep(delay); // Attend le délai généré
        System.out.println("Callable a renvoyé : " + randomNumber + " après " + delay + " secondes");
        return randomNumber; // Retourne le nombre aléatoire
	}

}
