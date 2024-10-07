package example5.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Runner implements Runnable {

private CyclicBarrier barrier;

	public Runner(CyclicBarrier barrier) {  
		this.barrier = barrier;
	}
	
	@Override
	public void run() {  System.out.println("Démarrage Runner");  
	try {
		System.out.println("Le coureur se place sur la piste");  
		this.barrier.await();
		System.out.println("Il court !");  
		Thread.sleep((long) (Math.random() * 10000));  
		System.out.println("Il arrive !");
	} catch (InterruptedException | BrokenBarrierException  e) {
		return;
	}
	System.out.println("Fin Runner");
	}
}
