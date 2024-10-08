package CollectionsAjouts;

import java.util.Map;
import java.util.Set;

public class example {

	public static void main(String[] args) {
		Set.of("arthur","fredegonde").stream().forEach(o->System.out.println(o)); 
		
				
		Map.of(1l,"Robert",4l,"Renault")
		.forEach((key, value) -> System.out.println("Clé: " + key + ", Valeur: " + value));
				
		

	}

}
