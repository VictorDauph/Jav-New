package example1;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		BiConsumer<String, String> lambdalogger = (String parameter1, String parameter2) -> { 
			System.out.println(parameter2);
		};
		
		lambdalogger.accept("bon","jour");
		
		Function<String,String> stringReturner = (param1)->{return param1;};
		
		System.out.println(stringReturner.apply("Bon Jour"));


	}

}
