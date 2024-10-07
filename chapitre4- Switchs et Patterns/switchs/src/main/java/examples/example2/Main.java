package examples.example2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(formatterPatternSwitch(55));

	}
	
	static String formatterPatternSwitch(Object o) {  
		return switch (o) {	
			case Integer i when i>10 -> String.format("int %d >10",i);
			case Integer i -> String.format("int %d", i);
			case Long l	-> String.format("long %d", l);  
			case Double d	-> String.format("double %f", d);  
			case String s	-> String.format("String %s", s);  
			default	-> o.toString();
		};
}

	
}


