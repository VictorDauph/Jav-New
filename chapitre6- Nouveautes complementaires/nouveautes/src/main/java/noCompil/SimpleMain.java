package noCompil;

public class SimpleMain {

	public static void main(String[] args) {  
		System.out.println("Lancement");  
		for (String arg : args) {
			System.out.println("Avec l'argument " + arg);
		}
	}
}
