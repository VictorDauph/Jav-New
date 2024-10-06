package example6.forkJoin;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        // Exemple de liste de nombres
        List<Long> numbers = Arrays.asList(1L,1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L,
                                            11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L,1L);

        // Créer un ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();
        
        // Créer et soumettre la tâche
        SumTask task = new SumTask(numbers, 0, numbers.size());
        long result = pool.invoke(task);

        // Afficher le résultat
        System.out.println("La somme des nombres est : " + result);
    }
}
