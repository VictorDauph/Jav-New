package models;

public class Adress {
	private String street;
	private String country;
	private String city;
	
	public Adress(String street, String country, String city) {
		this.street = street;
		this.country = country;
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
