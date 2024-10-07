package examples.example1;

public class MainAncien {

	public static void main(String[] args) {
		
		// Initialisation de l'état
        Etat etat = Etat.DEMARRE;
        double vitesse =-1; // Initialisation de la vitesse
		
		switch (etat) {
		case ARRETE:
			vitesse = 0;  
			break;
		case DEMARRE:
			vitesse = 1;  
			break;
		case AVANCE_RAPIDE:
			vitesse = 2;  
			break;
		default:
            throw new IllegalStateException("État inattendu: " + etat);
		}
		
		// Affichage de la vitesse
	    System.out.println("L'état est : " + etat + " et la vitesse est : " + vitesse);

	}


}
