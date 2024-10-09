package businessServices;

import Iservice.AdressServiceI;
import models.Adress;

public class AdressServiceImpl implements AdressServiceI {

	@Override
	public String getCountry(Adress adress) {
		// TODO Auto-generated method stub
		return adress.getCountry();
	}
}
