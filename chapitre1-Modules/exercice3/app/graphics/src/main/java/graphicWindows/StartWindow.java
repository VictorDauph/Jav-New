package graphicWindows;

import ServiceImpl.AdressServiceImpl;
import models.Adress;

public class StartWindow {

	public static void main(String[] args) {
		AdressServiceImpl adressService= new AdressServiceImpl();
		System.out.println("Start Window Launched");
		
		Adress adress = new Adress("rue des bois","France","Nancy");
		
	   System.out.println(adressService.getCountry(adress));

	}

}
