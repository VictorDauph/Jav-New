package example4;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import example2.LongTaskRunnable;

public class ExecutorEx {
	public static void main(String[] args) {
		Runnable runnable = new LongTaskRunnable();  
		Executor executor =  Executors.newSingleThreadExecutor();  
		executor.execute(runnable);
	}
}
