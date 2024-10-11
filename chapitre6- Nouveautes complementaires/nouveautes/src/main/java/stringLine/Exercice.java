package stringLine;

import java.util.Arrays;

public class Exercice {
    public static void main(String[] args) {
        // Création d'une chaîne de caractères assez longue
        String longString = "  Ceci est une ligne.  \n" +
                            "  Voici une deuxième ligne.  \n" +
                            "  Et enfin, une troisième ligne.  \n" +
                            "  Fin de la chaîne.  \n";
        // Duplication de la chaîne 3 fois
        String duplicatedString = longString.repeat(3);

        // Extraction des lignes et suppression des espaces au début et à la fin
        String[] lines = duplicatedString.lines()
                                          .map(String::trim) // Retirer les espaces au début et à la fin
                                          .toArray(String[]::new); // Convertir en tableau

        // Affichage des lignes extraites
        System.out.println("Lignes extraites : ");
        Arrays.stream(lines).forEach(System.out::println);
 
    }
}
