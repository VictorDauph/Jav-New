package example1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		System.out.println(DayOfWeek.TUESDAY.plus(2));
		
		//Date locale actuelle  
		System.out.println(LocalDate.now());
		//Date locale du 12 janvier 1975
		System.out.println(LocalDate.of(1975, 1, 12));
		
		LocalDate parameterDate = LocalDate.of(1975, 1, 12);
		//Compare uniquement les années de parameterDate et now()  
		boolean yearIsAfterNow = Year.from(parameterDate).isAfter(Year.now());
		
		System.out.println(yearIsAfterNow);

		
		// Création d'un formatteur de dateTime
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy à  HH:mm");
		
		//affiche : Le départ aura lieu le 03/07/2022 à 10:23
		// ça ressemble à un streamn mais of retourne une instance statique de date
		System.out.println("Le départ aura lieu le " + LocalDateTime.of(2022, 7, 3, 10,  23)
																	.format(dateTimeFormatter));
		
		// Parsing d'une chaîne de caractère représentant une date en ISO-8601  
		LocalDate date = LocalDate.parse("2029-03-28", DateTimeFormatter.ISO_DATE);
		System.out.println(date);
		
		
		

	}

}
