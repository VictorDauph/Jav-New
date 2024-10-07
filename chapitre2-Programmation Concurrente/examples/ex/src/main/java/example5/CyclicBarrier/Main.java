package example5.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Démarrage Thread principal");  CyclicBarrier cyclicBarrier = new CyclicBarrier(5,
				()->System.out.println("Partez !!!!!!!!!!!!!"));
				new Thread(new Runner(cyclicBarrier)).start();  
				new Thread(new Runner(cyclicBarrier)).start();  
				new Thread(new Runner(cyclicBarrier)).start();  
				new Thread(new Runner(cyclicBarrier)).start();  
				Thread.sleep(3000);
				new Thread(new Runner(cyclicBarrier)).start();  
				System.out.println("Fin Thread principal");
	}

}
