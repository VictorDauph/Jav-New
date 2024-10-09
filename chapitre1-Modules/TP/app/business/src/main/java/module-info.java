import Iservice.AdressServiceI;
import Iservice.BusinessServiceI;
import businessServices.AdressServiceImpl;


module business {
	requires transitive dataContract;
	exports businessServices;
	provides AdressServiceI with businessServices.AdressServiceImpl;
}