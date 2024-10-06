package example6.forkJoin;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int THRESHOLD = 10; // Seuil pour diviser les tâches
    private final List<Long> numbers;
    private final int start;
    private final int end;

    public SumTask(List<Long> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        // Si la taille de la tâche est inférieure au seuil, on calcule directement
        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += numbers.get(i);
            }
            return sum;
        } else {
            // Sinon, on divise la tâche
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(numbers, start, mid);
            SumTask rightTask = new SumTask(numbers, mid, end);

            // Fork (lancer) les sous-tâches
            leftTask.fork();
            long rightResult = rightTask.compute(); // Calculer la tâche de droite
            long leftResult = leftTask.join(); // Joindre le résultat de la tâche de gauche

            return leftResult + rightResult; // Combiner les résultats
        }
    }
}
