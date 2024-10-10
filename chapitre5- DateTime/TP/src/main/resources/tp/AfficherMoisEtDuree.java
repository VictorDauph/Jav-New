package tp;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class AfficherMoisEtDuree {
    public static void main(String[] args) {
        int annee = 2023; // Année choisie

        for (Month mois : Month.values()) {
            YearMonth yearMonth = YearMonth.of(annee, mois);
            int nombreDeJours = yearMonth.lengthOfMonth();
            System.out.println(mois + " : " + nombreDeJours + " jours");
        }
    }
}
