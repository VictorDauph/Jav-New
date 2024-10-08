
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

