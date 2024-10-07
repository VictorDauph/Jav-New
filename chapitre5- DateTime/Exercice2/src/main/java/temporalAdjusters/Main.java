package temporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

	 public static void main(String[] args) {
	        // Obtenir la date d'aujourd'hui
	        LocalDate today = LocalDate.now();
	        
	        // Trouver le dernier mardi précédant aujourd'hui
	        LocalDate lastTuesday = today.with(DayOfWeek.TUESDAY).minusWeeks(1);
	        if (today.getDayOfWeek() == DayOfWeek.TUESDAY) {
	            lastTuesday = today; // Si aujourd'hui est mardi, on prend aujourd'hui
	        }

	        System.out.println("Le dernier mardi précédant aujourd'hui est : " + lastTuesday);

	        // Bonus : Trouver le premier jour de la semaine de la quatrième année après celle actuelle
	        int currentYear = today.getYear();
	        LocalDate fourthYearAfter = LocalDate.of(currentYear + 4, 1, 1); // 1er janvier de la quatrième année après

	        // Obtenir le nom du jour de la semaine
	        DayOfWeek dayOfWeek = fourthYearAfter.getDayOfWeek();
	        String dayName = dayOfWeek.name(); // Obtention du nom du jour (ex: MONDAY)

	        System.out.println("Le nom du jour de la semaine du 01/01 de la quatrième année après celle actuelle est : " + dayName);
	    }

}
