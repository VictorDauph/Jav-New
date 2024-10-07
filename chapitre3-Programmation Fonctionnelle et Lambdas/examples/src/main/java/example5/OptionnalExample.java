package example5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import example4.Main;
import example4.models.User;

public class OptionnalExample {

	public static void main(String[] args) {
		
		//La méthode max renvoie un Optional
		List<User> users = Main.generateUserList();
		User defaultUser= new User(null,null,null,0);
		User older = users.stream().max(Comparator.comparing(c ->  c.getAge())).get();
		
		
		System.out.println(older);
		
		List<User> emptyUserList = new ArrayList<>();
		
		//orElse permet de renvoyer une valeur qui n'est jamais nulle
		Optional<User> olderOptional = emptyUserList.stream().max(Comparator.comparing(c ->  c.getAge()));
		older = olderOptional.orElse(defaultUser);
		
		System.out.println(older);
		

	}

}
