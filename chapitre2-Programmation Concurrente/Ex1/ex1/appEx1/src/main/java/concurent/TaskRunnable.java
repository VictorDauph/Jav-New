package concurent;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class TaskRunnable implements Runnable {
	private CyclicBarrier barrier;
	
    public TaskRunnable(CyclicBarrier barrier) {
        this.barrier = barrier;
    }


    @Override
    public void run() {
        try {
            // Attente sur la barrière jusqu'à ce que tous les threads soient prêts
            System.out.println(Thread.currentThread().getName() + " est prêt et attend.");
            
            //Point d'arrêt
            barrier.await();  // Attente que tous les threads atteignent ce point

            
            // Simuler un temps d'exécution aléatoire entre 0 et 10 secondes
            Random random = new Random();
            int sleepTime = random.nextInt(10000);  // Aléatoire entre 0 et 10 secondes
            System.out.println(Thread.currentThread().getName() + " exécute la tâche et attend " + (sleepTime / 1000) + " secondes.");
            Thread.sleep(sleepTime);

            System.out.println(Thread.currentThread().getName() + " a terminé la tâche.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}