package StreamTp;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        // Instancier une collection de 10 instances de Child
        List<Child> children = Arrays.asList(
                new Child("Alice", 12),
                new Child("Bob", 10),
                new Child("Charlie", 14),
                new Child("Diana", 9),
                new Child("Eve", 13),
                new Child("Frank", 11),
                new Child("Grace", 12),
                new Child("Henry", 10),
                new Child("Isabella", 15),
                new Child("Jack", 8)
        );

        // Afficher le nom de chaque enfant avec un stream
        System.out.println("Noms des enfants :");
        children.stream()
                .map(Child::getName)
                .forEach(System.out::println);

        // Afficher le nom de l’enfant ayant le plus grand âge
        Optional<Child> oldest = children.stream()
                .max(Comparator.comparingInt(Child::getAge));
       Child childOldest = oldest.get();
       System.out.println("\nL'enfant le plus âgé : " + childOldest.getName());

        // Afficher le nom de l’enfant ayant le plus petit âge
        Optional<Child> youngest = children.stream()
                .min(Comparator.comparingInt(Child::getAge));
        youngest.ifPresent(child -> 
                System.out.println("L'enfant le plus jeune : " + child.getName()));

        // Afficher la moyenne d’âge des enfants
        double averageAge = children.stream()
                .mapToInt(Child::getAge)
                .average()
                .orElse(0);
        System.out.println("\nLa moyenne d'âge des enfants : " + averageAge);

        // Vérifier si au moins un enfant a dépassé un certain âge (ex : 12 ans)
        int ageLimit = 12;
        boolean anyChildOlderThan = children.stream()
                .anyMatch(child -> child.getAge() > ageLimit);
        System.out.println("\nY a-t-il un enfant de plus de " + ageLimit + " ans ? " + anyChildOlderThan);
    }
}
