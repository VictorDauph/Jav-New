package lambda;

public class Matiere {
	String nom;
	Float prix;
	Float masse;
	
	
	public Matiere(String nom, Float prix, Float masse) {
		this.nom = nom;
		this.prix = prix;
		this.masse = masse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public Float getMasse() {
		return masse;
	}
	public void setMasse(Float masse) {
		this.masse = masse;
	}
	
	
}
