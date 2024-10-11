package instanceOf;

public class Exercice {
	// Classe mère
	static class Vehicule {
	    // Propriétés communes aux véhicules peuvent être définies ici
	}

	// Classe fille Auto
	static class Auto extends Vehicule {
	    public void rouleSurAutoroute() {
	        System.out.println("L'auto roule sur l'autoroute.");
	    }
	}

	// Classe fille Velo
	static class Velo extends Vehicule {
	    public void rouleSurChemin() {
	        System.out.println("Le vélo roule sur le chemin.");
	    }
	}

    public static void main(String[] args) {
        // Création d'instances
        Vehicule voiture = new Auto();
        Vehicule bicyclette = new Velo();

        // Appel de la méthode avec l'ancien instanceof
        roulerAncien(voiture);
        
        // Appel de la méthode avec le nouveau instanceof
        roulerNouveau(bicyclette);
    }

    // Méthode avec l'ancien instanceof
    public static void roulerAncien(Vehicule vehicule) {
        if (vehicule instanceof Auto) {
            Auto auto = (Auto) vehicule; // Cast explicite
            auto.rouleSurAutoroute();
        } else if (vehicule instanceof Velo) {
            Velo velo = (Velo) vehicule; // Cast explicite
            velo.rouleSurChemin();
        } else {
            System.out.println("Type de véhicule non pris en charge.");
        }
    }

    // Méthode avec le nouveau instanceof (pattern matching)
    public static void roulerNouveau(Vehicule vehicule) {
        if (vehicule instanceof Auto auto) { // Pattern matching
            auto.rouleSurAutoroute();
        } else if (vehicule instanceof Velo velo) { // Pattern matching
            velo.rouleSurChemin();
        } else {
            System.out.println("Type de véhicule non pris en charge.");
        }
    }
}
