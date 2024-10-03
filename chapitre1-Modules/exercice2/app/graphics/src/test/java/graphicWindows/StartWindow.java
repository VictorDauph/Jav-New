package graphicWindows;

import ServiceImplementation.ServiceImpl;
import repoModels.Customer;

public class StartWindow {

	public static void main(String[] args) {
		ServiceImpl service = new ServiceImpl();
		System.out.println("Start Window Launched");
		
		Customer customer = new Customer("Victor","Dauphin",36);
		
	   System.out.println(service.getAge(customer));

	}

}
