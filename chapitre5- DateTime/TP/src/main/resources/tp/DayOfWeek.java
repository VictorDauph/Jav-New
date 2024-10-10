package tp;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class AfficherTousLesLundis {
    public static void main(String[] args) {
        int annee = 2023; // Année choisie
        Month mois = Month.MARCH; // Mois choisi

        YearMonth yearMonth = YearMonth.of(annee, mois);
        LocalDate premierJour = yearMonth.atDay(1);
        LocalDate premierLundi = premierJour.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

        System.out.println("Tous les lundis de " + mois + " " + annee + " :");
        while (premierLundi.getMonth() == mois) {
            System.out.println(premierLundi);
            premierLundi = premierLundi.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
    }
}
