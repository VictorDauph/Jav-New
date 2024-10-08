package var.exercice;
import java.util.ArrayList;

public class Exercice {
    public static void main(String[] args) {
        // Déclaration de variables avec var
        var intVar = 10; // type primitif int
        var doubleVar = 3.14; // type primitif double
        var stringVar = "Hello, World!"; // type String (objet)
        
        // Appel d'autres méthodes
        var sumResult = add(5, 15); // méthode qui retourne un int
        var greeting = createGreeting("Alice"); // méthode qui retourne une String

        // Affichage des variables
        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("stringVar: " + stringVar);
        System.out.println("sumResult: " + sumResult);
        System.out.println("Greeting: " + greeting);

        // Création d'une collection avec var
        var list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Itération sur la collection en utilisant var
        for (var fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
    }

    // Méthode pour additionner deux nombres
    private static int add(int a, int b) {
        return a + b;
    }

    // Méthode pour créer un message de salutation
    private static String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
