package repoModels;

public class Customer {
	String firstName;
	String LastName;
	Integer Age;
	
	
	public Customer(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		LastName = lastName;
		Age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	
	
}
