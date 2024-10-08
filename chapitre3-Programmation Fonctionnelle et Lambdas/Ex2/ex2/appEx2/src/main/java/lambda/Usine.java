package lambda;

import functionalInterfaces.Travail;

public class Usine {

    public static void main(String[] args) {
        // Instanciation de la machine
        Machine machine = new Machine();
        
        // Création d'une matière
        Matiere acier = new Matiere("Acier", 100.0f, 50.0f);
        
        Travail travail= (Matiere matiere) -> {
            matiere.setNom(matiere.getNom() + " Usiné");
            matiere.setPrix(matiere.getPrix() * 1.2f);
            matiere.setMasse(matiere.getMasse() * 0.8f);
            return matiere;
        };
        		
        // Appel de la méthode travail avec une lambda pour simuler le traitement
        machine.travail(acier, travail);
                
        // Utilisation d'une référence de méthode pour appeler System.out.println()

        
     // Utilisation d'une référence de méthode pour appeler acier.afficheNom


    }
}
