package patternMatching;

public class CRM {

	// Déclaration des Records
	public record User(String nom, String prenom, int age, int id) {}
	public record Product(String nom, double prix, int stock) {}
	public record Order(int id, User utilisateur, double montantTotal) {}
	
	CRM(){}
	
    public String describeObject(Object obj) {
        return switch (obj) {
            case User user -> "User: " + user.nom() + " " + user.prenom() + ", Age: " + user.age() + ", ID: " + user.id();
            case Product product -> "Product: " + product.nom() + ", Prix: " + product.prix() + ", Stock: " + product.stock();
            case Order order -> "Order ID: " + order.id() + ", Utilisateur: " + order.utilisateur().nom() + ", Montant Total: " + order.montantTotal();
            case Integer integer -> integer > 0 ? "Identifiant positif" : "Identifiant négatif";
            case String str -> str.length() > 10 ? "Nom long" : "Nom court";
            default -> "Type non reconnu";
        };
    }

}
