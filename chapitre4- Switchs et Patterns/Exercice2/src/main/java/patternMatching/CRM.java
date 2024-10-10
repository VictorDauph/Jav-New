package patternMatching;

public class CRM {

	// Déclaration des Records
	public record User(String nom, String prenom, int age, int id) {}
	public record Product(String nom, double prix, int stock) {}
	public record Order(int id, User utilisateur, double montantTotal) {}
	public record Yassine(String nom) {}
	
	CRM(){}
	
    public String describeObject(Object obj) {
        return switch (obj) {
        case User user  -> "User: " + user.nom() + " " + user.prenom() + ", Age: " + user.age() + ", ID: " + user.id();
        case Product product -> "Product: " + product.nom() + ", Prix: " + product.prix() + ", Stock: " + product.stock();
        case Order order when order.id >0 -> "Order ID: " + order.id() + ", Utilisateur: " + order.utilisateur().nom() + ", Montant Total: " + order.montantTotal();
        case Order order  -> "Order ID: " + order.id() + ", Utilisateur: " + order.utilisateur().nom() + ", Montant Total: " + order.montantTotal();
        case Integer integer when integer>0 ->"Identifiant positif";
        case Integer integer->"Identifiant négatif";
        case String str when str.length() > 10 ->"Nom long";
        case String str -> "Nom court";
        default -> "Type non reconnu";
    };
    }

}
