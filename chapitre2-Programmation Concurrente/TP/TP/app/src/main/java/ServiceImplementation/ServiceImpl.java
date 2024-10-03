package ServiceImplementation;

public class ServiceImpl implements ServiceI {
	public Integer getAge(Customer customer){
		return customer.getAge();
	}
}
