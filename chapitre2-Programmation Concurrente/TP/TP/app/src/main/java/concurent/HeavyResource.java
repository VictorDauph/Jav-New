package concurent;

public class HeavyResource {
	
	Integer id;
	String ressourceName;
	Boolean isLaunched;
	
	
	public HeavyResource(Integer id, String ressourceName) {
		this.id = id;
		this.ressourceName = ressourceName;
		this.isLaunched= false;
	}
	
	
	private void beginTransaction(){
		this.isLaunched=true;
		
	}
	
	private void endTransaction(){}
	
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
