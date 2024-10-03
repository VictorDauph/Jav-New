package ServiceImplementation;

import repoModels.Customer;
import serviceInterfaces.ServiceI;

public class ServiceImpl implements ServiceI {
	public Integer getAge(Customer customer) {
		return customer.getAge();
	}
}
