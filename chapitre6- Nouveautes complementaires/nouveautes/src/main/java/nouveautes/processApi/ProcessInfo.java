package nouveautes.processApi;

import java.util.stream.Stream;

public class ProcessInfo {

	    public static void main(String[] args) {
	        // Obtenir le flux des ProcessHandle pour tous les processus en cours
	        Stream<ProcessHandle> processStream = ProcessHandle.allProcesses();

	        // Afficher les informations de chaque processus
	        processStream.forEach(processHandle -> {
	            // Obtenir des informations sur le processus
	            ProcessHandle.Info info = processHandle.info();
	            // Afficher l'identifiant et le nom du processus
	            System.out.printf("Process ID: %d, Command: %s%n",
	                    processHandle.pid(), 
	                    info.command().orElse("N/A"));
	        });
	    }
	
}
