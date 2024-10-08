package nouveautes.processApi;

import java.util.Optional;

public class Exercice {
	public static void main(String[] args) {
        // Cherche le processus "notepad"
        Optional<ProcessHandle> notepadProcess = ProcessHandle.allProcesses()
                .filter(process -> process.info().command().isPresent() &&
                                  process.info().command().get().toLowerCase().contains("notepad"))
                .findFirst();

        // Vérifie si le processus a été trouvé
        if (notepadProcess.isPresent()) {
            ProcessHandle processHandle = notepadProcess.get();

            // Affiche les informations du processus
            System.out.println("Process ID: " + processHandle.pid());
            System.out.println("Command: " + processHandle.info().command().orElse("Unknown Command"));
            System.out.println("Arguments: " + processHandle.info().arguments().map(argsArray -> String.join(", ", argsArray)).orElse("No Arguments"));
            System.out.println("User: " + processHandle.info().user().orElse("Unknown User"));
            System.out.println("Start Time: " + processHandle.info().startInstant().map(Object::toString).orElse("Unknown Start Time"));
            System.out.println("Total CPU Duration: " + processHandle.info().totalCpuDuration().map(Object::toString).orElse("Unknown CPU Duration"));

            // Terminer le processus
            boolean terminated = processHandle.destroy();
            if (terminated) {
                System.out.println("Le processus a été terminé avec succès.");
            } else {
                System.out.println("Échec de la terminaison du processus.");
            }
        } else {
            System.out.println("Aucun processus nommé 'notepad' trouvé.");
        }
    }

}
