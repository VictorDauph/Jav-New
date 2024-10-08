package patternMatching;

public class CRM {

	// Déclaration des Records
	public record User(String nom, String prenom, int age, int id) {}
	public record Product(String nom, double prix, int stock) {}
	public record Order(int id, User utilisateur, double montantTotal) {}
	
	CRM(){}
	
    public String describeObject(Object obj) {
        return switch (obj) {

            default -> "Type non reconnu";
        };
    }

}
