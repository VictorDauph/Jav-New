package example4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import example4.models.User;

public class Main {

	public static void main(String[] args) {
		
		

	}
	
	public static List<User> generateUserList(){
        // Créer une liste pour stocker les utilisateurs
        List<User> userList = new ArrayList<>();

        // Générer 10 utilisateurs avec des informations fictives et des doublons
        userList.add(new User("Doe", "John", 1, 30));
        userList.add(new User("Smith", "Jane", 2, 25));
        userList.add(new User("Brown", "Bob", 3, 22));
        userList.add(new User("Johnson", "Emily", 4, 28));
        userList.add(new User("Williams", "Michael", 5, 35));
        userList.add(new User("Jones", "Sarah", 6, 26));
        userList.add(new User("Garcia", "David", 7, 29));
        userList.add(new User("Martinez", "Emma", 8, 24));
        userList.add(new User("Davis", "Chris", 9, 31));
        userList.add(new User("Rodriguez", "Sophia", 10, 27));
        userList.add(new User("Doe", "John", 1, 30));
        userList.add(new User("Smith", "Jane", 2, 25));
        userList.add(new User("Brown", "Bob", 3, 22));
        userList.add(new User("Johnson", "Emily", 4, 28));
        userList.add(new User("Williams", "Michael", 5, 35));
        userList.add(new User("Jones", "Sarah", 6, 26));
        userList.add(new User("Garcia", "David", 7, 29));
        userList.add(new User("Martinez", "Emma", 8, 24));
        userList.add(new User("Davis", "Chris", 9, 31));
        userList.add(new User("Rodriguez", "Sophia", 10, 27));
        
        return userList;
		
	}

}
