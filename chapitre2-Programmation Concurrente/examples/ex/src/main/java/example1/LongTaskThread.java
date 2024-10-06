package example1;

final class LongTaskThread extends Thread {
	@Override
	public void run() {
	System.out.println("Démarrage LongTaskThread");  
	System.out.println("Fin LongTaskThread");
	}
	
	public static void main(String[] args) {
		LongTaskThread longTaskThread = new LongTaskThread();  
		longTaskThread.start(); 
	}
}
