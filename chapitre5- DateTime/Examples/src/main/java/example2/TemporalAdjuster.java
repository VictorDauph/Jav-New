package example2;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjuster {
	
	public static void main(String[] args) {
		//Trouver le dernier jour d'une année
		LocalDate lastDayOfYear = LocalDate.of(2000, 12, 1).with(TemporalAdjusters.lastDayOfYear());
		System.out.println(lastDayOfYear);
		
		//trouver si l'année est après 2000
		Boolean isYearAfter2000 = LocalDate.now().query(t-> t.get(ChronoField.YEAR) > 2000);
		System.out.println(isYearAfter2000);

	}
}
