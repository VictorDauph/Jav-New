package instanceOf;

public class Example {
	public static void main(String[] args) {
		

        // Création d'un objet Chaise
        Chaise meuble = new Chaise(4); // Une chaise avec 4 pieds
        
        // Vérification du type avec le pattern matching
        if (meuble instanceof Chaise c) {
            System.out.println("La chaise a " + c.pieds + " pieds.");
        }
    }

    // Définition de la classe Chaise
    static class Chaise {
        int pieds;

        // Constructeur pour initialiser le nombre de pieds
        public Chaise(int pieds) {
            this.pieds = pieds;
        }
    }
	
}
