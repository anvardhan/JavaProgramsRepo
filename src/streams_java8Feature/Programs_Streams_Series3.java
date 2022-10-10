package streams_java8Feature;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Programs_Streams_Series3 {


	@Test(enabled=false)
	public void customerList_findAny_orElse() {

		//Create Single customer
		//Customer customer = new Customer("Ajay", 30, "3652659865");				
		//System.out.println(customer);

		//Create List of Customers
		List<Customer> customerList = Arrays.asList(
				new Customer("Ajay", 30, "3652659865"),
				new Customer("Tom", 34, "8542569653"),
				new Customer("Peter", 29, "7542586598"),
				new Customer("Simon", 27, "4562587548"),
				new Customer("Thomas", 42, "4568524585")				

				);

		//Find if a customer is present in the list orElse through run time exception

		Customer customer = customerList.stream()
				.filter(e -> e.getName().equals("Peter"))
				.findAny()
				.orElse(null);

		System.out.println("Customer Details: "+customer); //We can see result because we have used toString() in Customer class
		System.out.println("Customer Name: "+customer.getName());
		
		String Name = customerList.stream()
				.filter(e -> e.getName().equals("Peter"))
				.map(Customer :: getName) //method reference classname :: methodname
				.findAny()
				.orElse(null);
		System.out.println("Name: "+Name);


		Customer customer2 = customerList.stream()
				.filter(e -> e.getName().equals("John"))
				.findAny()
				.orElse(null);

		System.out.println("Customer Details: "+customer2); //We can see result because we have used toString() in Customer class
		if(customer2 != null)
			System.out.println("Customer Name: "+customer2.getName());
		else {System.out.println("Customer not found");}

	}
	
	@Test(enabled=false)
	public void customerList_GetOnlyName() {

		//Create List of Customers
		List<Customer> customerList = Arrays.asList(
				new Customer("Ajay", 30, "3652659865"),
				new Customer("Tom", 34, "8542569653"),
				new Customer("Peter", 29, "7542586598"),
				new Customer("Simon", 27, "4562587548"),
				new Customer("Thomas", 42, "4568524585")				

				);

		//Get only Customer Name list from customerList

		List<String> customerNames = customerList.stream()
				.map(Customer :: getName)
				//.sorted()
				.collect(Collectors.toList());
		
		//System.out.println(customerNames);
		customerNames.forEach(System.out :: println);

		//Get only Customer age list from customerList

		List<Integer> customerAge = customerList.stream()
				.map(Customer :: getAge)
				.collect(Collectors.toList());
		
		//System.out.println(customerAge);
		customerAge.forEach(System.out :: println);
		
		
	}


}
