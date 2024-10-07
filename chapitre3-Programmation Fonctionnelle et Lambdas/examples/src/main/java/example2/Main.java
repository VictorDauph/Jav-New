package example2;

import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		BiFunction<String, String, String> concatenate = (str1, str2) -> Utils.concat(str1, str2);

		BiFunction<String, String, String> concatenateByRef = Utils::concat;
		
		System.out.println(concatenate.apply("Bon","Jour"));
		System.out.println(concatenateByRef.apply("Bon","Jour"));


	}

}
