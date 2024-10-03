package ServiceImpl;

import Iservice.AdressServiceI;
import models.Adress;

public class AdressServiceImpl implements AdressServiceI {
	@Override
	public String getCountry(Adress adress) {
		
		return adress.getCountry();
	}
}
