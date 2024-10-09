package example2;

public class LongTaskRunnable implements Runnable {

	@Override
	public void run() {
	System.out.println("Démarrage LongTaskRunnable");  
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Fin LongTaskRunnable");
	}

	
	public static void main(String[] args) {
		new Thread(new LongTaskRunnable()).start();

	}

}
