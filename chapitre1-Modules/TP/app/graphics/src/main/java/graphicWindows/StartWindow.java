package graphicWindows;

import java.util.ServiceLoader;

import Iservice.AdressServiceI;
import Iservice.BusinessServiceI;
import models.Adress;

public class StartWindow {

	public static void main(String[] args) {

		AdressServiceI adressService= ServiceLoader.load(AdressServiceI.class).findFirst().orElseThrow();
		
		System.out.println("Start Window Launched");
		
		
		Adress adress = new Adress("rue des bois","France","Nancy");
		
	   System.out.println(adressService.getCountry(adress));


	}

}
