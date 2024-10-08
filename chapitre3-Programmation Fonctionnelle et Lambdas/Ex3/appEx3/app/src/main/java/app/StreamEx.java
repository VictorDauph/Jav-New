package app;

import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        
        // Utilisation de iterate et takeWhile pour afficher les multiples de 3 de 0 à 40
        System.out.println("Multiples de 3 de 0 à 40 :");
        Stream.iterate(0, n -> n + 3)  // Génère les multiples de 3


        // Bonus: Utilisation de dropWhile et takeWhile pour afficher les nombres de 20 à 40
        System.out.println("\nNombres entre 20 et 40 :");
        Stream.iterate(0, n -> n + 3)  // Génère une séquence de nombres


}
