package concurent;
import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
    	List<Callable<Integer>> callables = new ArrayList<>();
    	
    	//Instanciation des Callables
    	for (int i = 0; i < 10; i++) {
	    	Callable<Integer> callable = new RandomCallable();
	    	callables.add(callable);
    	}
    	
        // Création d'un ExecutorService avec un FixedThreadPool de 10 threads
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        

        	try {
        		System.out.println("Premier résultat obtenu : " + executorService.invokeAny(callables));
			} catch (InterruptedException e) {

				e.printStackTrace();
			} catch (ExecutionException e) {

				e.printStackTrace();
			}finally {
				executorService.shutdown();
			}     
        
    }
}
