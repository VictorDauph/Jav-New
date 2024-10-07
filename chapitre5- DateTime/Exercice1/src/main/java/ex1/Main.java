package ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

	 public static void main(String[] args) {

	        String dateString = "1988-03-25";
	        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

	        try {
	            // Instanciation de LocalDate à partir de la chaîne de caractères
	            LocalDate date = LocalDate.parse(dateString, formatter);

	            // Vérification si l'année est bissextile
	            if (date.isLeapYear()) {
	                System.out.println(date + " est dans une année bissextile.");
	            } else {
	                System.out.println(date + " n'est pas dans une année bissextile.");
	            }

	            // Affichage du mois de l'année et du jour de la semaine
	            System.out.println("Mois de l'année : " + date.getMonth());
	            System.out.println("Jour de la semaine : " + date.getDayOfWeek());

	            // Affichage de la date de manière lisible pour un humain
	            System.out.println("Date formatée : " + date.format(DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy")));
	        } catch (DateTimeParseException e) {
	            System.out.println("Erreur : La date fournie est invalide. Veuillez utiliser le format AAAA-MM-JJ.");
	        }
	    }

}
