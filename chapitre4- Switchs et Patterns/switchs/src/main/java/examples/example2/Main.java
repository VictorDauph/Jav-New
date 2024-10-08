package examples.example2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(formatterPatternSwitch(55));

	}
	
	static String formatterPatternSwitch(Object o) {  
		return switch (o) {	

			default	-> o.toString();
		};
}

	
}


