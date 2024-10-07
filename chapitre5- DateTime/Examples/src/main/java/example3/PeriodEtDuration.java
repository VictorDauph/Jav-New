package example3;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class PeriodEtDuration {

	public static void main(String[] args) {
		// Trouver le nombre de jours entre le dernier mercredi et aujourd'hui
		LocalDate dernierMercredi = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));  
		Period.between(dernierMercredi, LocalDate.now()).getDays();
		System.out.println(dernierMercredi);

		// Trouver le nombre de secondes entre deux dateTimes  
		System.out.println(Duration.between(LocalDateTime.of(2000, 1, 1, 12, 30), LocalDateTime.now()).toSeconds());

		/* -------------------------------------------------------------------------------------- */
		
		// D'une date du calendrier grégorien à une date japonaise
        LocalDate occidentalDate = LocalDate.of(2013, 1, 20);
        
        // Conversion en date japonaise
        JapaneseDate japaneseDate = JapaneseDate.from(occidentalDate);

        // Formatage pour une affichage lisible
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("G yyyy年 M月 d日");
        
        // Affichage du résultat
        String formattedDate = japaneseDate.format(formatter);
        System.out.println("Date japonaise : " + formattedDate);
        
        /*------------------------------------------------------------------------------------------*/
        
        //Création datetime
		LocalDateTime heureDepart = LocalDateTime.of(2013, Month.JULY, 20, 19, 30);  
		//Création zones
		ZoneId zoneParis = ZoneId.of("Europe/Paris");
		ZoneId zonePorto = ZoneId.of("Europe/Lisbon");
		//Initialisation du dateTime à Paris
		ZonedDateTime heureDepartZoneParis = ZonedDateTime.of(heureDepart, zoneParis);  
		//Conversion su dateTime sur le fuseau horaire de Porto
		ZonedDateTime heureDepartZonePorto = heureDepartZoneParis.withZoneSameInstant(zonePorto);
		
		// Création d'un formatteur de dateTime
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy à  HH:mm");
		
		System.out.println(heureDepartZonePorto.format(dateTimeFormatter));

	}
}
