package TP;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Set;

public class CalculerJoursTravail {
    public static void main(String[] args) {
        int annee = 2023; // Année à analyser
        Set<DayOfWeek> joursTravail = Set.of(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.FRIDAY);
        int joursTravailles = 0;

        // Parcourir chaque mois de l'année
        for (Month mois : Month.values()) {
            YearMonth yearMonth = YearMonth.of(annee, mois);
            for (int jour = 1; jour <= yearMonth.lengthOfMonth(); jour++) {
                LocalDate date = yearMonth.atDay(jour);
                DayOfWeek jourSemaine = date.getDayOfWeek();

                // Vérifier si c'est un jour travaillé
                if (joursTravail.contains(jourSemaine)) {
                    // Vérifier si c'est un vendredi 13
                    if (jourSemaine == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
                        System.out.println("Vendredi 13 trouvé : " + date + ", ne travaille pas.");
                    } else {
                        joursTravailles++;
                    }
                }
            }
        }

        System.out.println("Le boulanger a travaillé " + joursTravailles + " jours en " + annee);
    }
}
