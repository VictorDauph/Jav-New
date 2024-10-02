package graphics;

import UserRepository.UserRepository;

public class StartWindow {
	public static void main(String[] args) {
		System.out.println("Start Window Launched");
		//Méthode du classpath non modulaire: StartWindow importe data-repository via les fichiers Pom
		UserRepository userRepository = new UserRepository();
	}
	
}
