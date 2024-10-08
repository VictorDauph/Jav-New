package example3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LongTaskCallable implements Callable<Long>  {
	
	@Override
	public Long call() {
	System.out.println("Démarrage LongTaskCallable");  try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {  return 0l;
	}
	System.out.println("Fin LongTaskCallable");  return 42l;
	}


	public static void main(String[] args) {
		System.out.println("Démarrage Thread principal");
		
		Callable<Long> callable = new LongTaskCallable();  
		FutureTask<Long> futureTask = new  FutureTask<>(callable);
		new Thread(futureTask).start();  
		try {
			Long result = futureTask.get();  
			System.out.println(String.format("Le résultat  vaut : %s", result));
		} catch (InterruptedException | ExecutionException e) {  
			throw new RuntimeException(e);
		}
	}
}
