package streams_java8Feature;

public class Customer {
	
	private String name;
	private int age;
	private String phoneNumber;
	
	public Customer(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//toString method is used to display the string representation of its object
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	

}
