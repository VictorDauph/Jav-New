package patternMatching;

import patternMatching.CRM.Order;
import patternMatching.CRM.Product;
import patternMatching.CRM.User;

public class Main {


	    public static void main(String[] args) {
	        CRM crm = new CRM();

	        User user = new User("Dupont", "Jean", 30, 123);
	        Product product = new Product("Ordinateur", 999.99, 10);
	        Order order = new Order(456, user, 1299.99);
	        Integer identifiantPositif = 42;
	        String nomCourt = "Paul";
	        String nomLong = "Alexander le grand";

	        System.out.println(crm.describeObject(user));          // User: Dupont Jean, Age: 30, ID: 123
	        System.out.println(crm.describeObject(product));       // Product: Ordinateur, Prix: 999.99, Stock: 10
	        System.out.println(crm.describeObject(order));         // Order ID: 456, Utilisateur: Dupont, Montant Total: 1299.99
	        System.out.println(crm.describeObject(identifiantPositif)); // Identifiant positif
	        System.out.println(crm.describeObject(nomCourt));     // Nom court
	        System.out.println(crm.describeObject(nomLong));      // Nom long
	        System.out.println(crm.describeObject(new Object()));  // Type non reconnu
	    }

}
