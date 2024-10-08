import Iservice.AdressServiceI;
import Iservice.BusinessServiceI;
import businessServices.AdressServiceImpl;
import businessServices.BusinessServiceImpl;

module business {
	requires transitive dataContract;
	exports businessServices;
	provides AdressServiceI with AdressServiceImpl;
	provides BusinessServiceI with BusinessServiceImpl;
}