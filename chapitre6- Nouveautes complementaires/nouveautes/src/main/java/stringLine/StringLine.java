package stringLine;

public class StringLine {
	public static void main(String[] args) {
		String multilineString = "Voilà mon conseil : \n \n découper ses phrases \n en lignes." ;

		// Crée un stream pour chaque ligne de multilineString  
		multilineString.lines().forEach(System.out::println);
		System.out.println(multilineString);
	}
}
