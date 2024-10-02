package Service;

import Iservice.AdressServiceI;
import models.Adress;

public class AdressService implements AdressServiceI {
	@Override
	public String getCountry(Adress adress) {
		
		return adress.getCountry();
	}
}
