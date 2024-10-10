package concurent;

import java.util.concurrent.CompletableFuture;

import CustomExceptions.TransactionException;

public class HeavyResource {
	
	private Integer id;
	private String ressourceName;
	private Boolean isLaunched;
	
	
	public HeavyResource(Integer id, String ressourceName) {
		this.id = id;
		this.ressourceName = ressourceName;
		this.isLaunched= false;
	}
	
	
    // Démarrer une transaction
    public CompletableFuture<Void> beginTransaction() throws InterruptedException, TransactionException {
		return CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(100); // Simuler le temps d'exécution
				this.isLaunched = true;
				System.out.println("Démarrage de la transaction pour " + this.getRessourceName());
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Transaction interrupted: " + e.getMessage());
			}
		});
	}
    
    // Terminer une transaction
    public CompletableFuture<Void> endTransaction() throws InterruptedException, TransactionException {
		return CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(100); // Simuler le temps d'exécution
				this.isLaunched = false;
				System.out.println("Fin de la transaction pour " + this.getRessourceName());
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.err.println("Transaction interrupted: " + e.getMessage());
			}
		});
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRessourceName() {
		return ressourceName;
	}
	public void setRessourceName(String ressourceName) {
		this.ressourceName = ressourceName;
	}

}

/* Enconcé du TP
package concurent;

import CustomExceptions.TransactionException;

public class HeavyResource {
	
	private Integer id;
	private String ressourceName;
	private Boolean isLaunched;
	
	
	public HeavyResource(Integer id, String ressourceName) {
		this.id = id;
		this.ressourceName = ressourceName;
		this.isLaunched= false;
	}
	
	
    // Démarrer une transaction
    public void beginTransaction() throws InterruptedException, TransactionException {
        if (isLaunched) {
            throw new TransactionException("Transaction déjà lancée ou finie. Impossible de relancer.");
        }
        System.out.println("Démarrage de la transaction pour " + this.getRessourceName());
        this.isLaunched = true;  // La ressource est en cours d'utilisation
        Thread.sleep(500);  // Simulation du délai
    }
    
    // Terminer une transaction
    public void endTransaction() throws InterruptedException, TransactionException {
        if (!isLaunched) {
            throw new TransactionException("La transaction n'a pas été lancée. Impossible de la terminer.");
        }
        System.out.println("Fin de la transaction pour " + this.getRessourceName());
        this.isLaunched = false;  // Libérer la ressource
        Thread.sleep(500);  // Simulation du délai
    }
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRessourceName() {
		return ressourceName;
	}
	public void setRessourceName(String ressourceName) {
		this.ressourceName = ressourceName;
	}
	
	

}
*/
