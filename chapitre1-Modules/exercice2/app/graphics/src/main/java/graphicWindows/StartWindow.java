package graphicWindows;

import Service.AdressService;
import models.Adress;

public class StartWindow {

	public static void main(String[] args) {
		AdressService adressService = new AdressService();
		System.out.println("Start Window Launched");
		
		Adress adress = new Adress("rue des bois","France","Nancy");
		
	   System.out.println(adressService.getCountry(adress));

	}

}
