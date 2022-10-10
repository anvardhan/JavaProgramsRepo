package streams_java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Programs_Streams_Series1 {

	/*
	https://www.geeksforgeeks.org/java-8-stream-tutorial/

	Introduced in Java 8,  
	A stream is a sequence of objects that supports various methods which can be pipelined to process objects and
	produce desired results.
	It is used to process collections of objects and produce desired results.
	It supports various methods which can be pipelined to produce the desired result.
	

	Difference between Collections and Streams
	If we want to represent a group of objects as a single entity then we should go for collection.
	But if we want to process objects from the collection then we should go for streams.

	If we want to use the concept of streams then stream() is the method to be used. Stream is available as an interface.
	Streams are present in java’s utility package named java.util.stream

	A stream is not a data structure instead it takes input from the Collections, Arrays, or I/O channels.
	Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
	Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations 
	can be pipelined. 
	Terminal operations mark the end of the stream and return the result.

	why use Stream:
	Functional Programming, Code reduction, Bulk operations


	There are broadly 3 types of operations that are carried over streams namely

	1-Intermediate operations - Returns the stream itself so we can chain multiple method calls in a row
		There are 3 methods - filter(), map() and sorted()
		Note: filter, sorted, and map, which can be connected together to form a pipeline.
	2-Terminal operations - Returns the result of certain types instead of stream
		forEach(), collect(), match(), count(), reduce()
	3-Short-circuit operations - 
		anyMatch(), findFirst()

	Working of stream can be explained in three stages:
	1. Create a stream - Streams can be created using stream() method
	2. Perform intermediate operations on the initial stream to transform it into another stream and so on further 
	intermediate operations.  

	Intermediate Operations:
	filter() - The filter() is an intermediate operation that reads the data from a stream and returns a new stream 
	after transforming the data based on the given condition.
	this methods perform the filtering on collections, Arrays etc.
	map() - this method performs some operations on each data elements in collections.ex - Adding, doubling etc.
	sorted()- this methods sorts data in ascending/descending orders

	Note: For every object if there is urgency to do some operations be it square, double or any other 
	than only we need to use map() function  operation else try to use filter() function operation. 

	3. Perform terminal operation on the final stream to get the result. 

	Terminal Operations:
	forEach() and forEachOrdered() - These methods to iterate over collections and Streams in Java.
		For sequential streams the order of elements is same as the order in the source, 
		so the output would be same whether you use forEach or forEachOrdered. 
		However when working with parallel streams, you would always want to use the forEachOrdered() method 
		when the order matters to you, as this method guarantees that the order of elements would be same as the source. 
	collect - The collect() method collects the final stream and converts it into a list
	match - 
	count - It returns the long count of elements in the stream. This is a special case of a reduction.
	reduce - 

	All these operations are happening parallelly which means we are able to parallelize the code with the help of 
	streams.
	Parallel execution of operations using stream is faster than sequential execution without using streams.
	
	With Java 8, Collection interface has two methods to generate a Stream.
	stream() - returns a sequential stream considering collection as its source
	parallelStream() - returns a parallel stream considering collection as its source
	
	 */

	@Test(enabled=false)
	public void findEvenAndOddNumbers_filter_collect_forEachToIterateList() {

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,3,4,6,7,9,10));

		// First lets print the collection
		System.out.println("Printing the collection : "+list1);

		//Print even numbers - 1st collect filtered data in list and then print
		System.out.println("Even Numbers are: ");
		List<Integer> evenNum = list1.stream()							//converting the list to stream
				.filter(i -> i%2 == 0)			//filter the stream to create a new stream
				.collect(Collectors.toList()); //collect the final stream and convert it to a List
		evenNum.forEach(i -> System.out.print(i+" "));						//Iterate list using forEach
		System.out.println();
		//print without collecting as list
		//list1.stream().filter(i -> i %2 == 0).collect(Collectors.toList()).forEach(i -> System.out.print(i+" "));

		System.out.println();
		//Print odd numbers - 1st collect filtered data in list and then print
		System.out.println("Odd Numbers are: ");
		List<Integer> oddNum = list1.stream().filter(i -> i %2 != 0).collect(Collectors.toList());
		oddNum.forEach(i -> System.out.print(i+" "));
	}

	@Test(enabled=false)
	public void findSquareofEachElement_map() {

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,3,4,6,7,9,10));

		List<Integer> squalrList = list1.stream().map(i -> i*i).collect(Collectors.toList());
		squalrList.forEach(i -> System.out.print(i+" "));

	}

	@Test(enabled=false)
	public void findCountOfStringhavingLengthLessThan6_filter_collect_count() {

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","Selenium","Python","Automation","JavaAutomation"));

		//Method1: using traditional for
		int count = 0;
		for (String str : names) {
			if (str.length() < 6) 
				count++; 
		}
		System.out.println("There are "+count+" strings with length less than 6");

		System.out.println("-----------");

		//Method2: Using Stream
		List<String> nameFilteredList = names.stream().filter(name -> name.length() < 6).collect(Collectors.toList());
		int count1 = nameFilteredList.size();

		long count2 = names.stream().filter(name -> name.length() < 6).count();

		System.out.println("There are "+count1+" strings with length less than 6");
		System.out.println("There are "+count2+" strings with length less than 6 - using count method");
	}

	@Test(enabled=false)
	public void findStringhavingLengthLessThan6() {

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","Selenium","Python","Automation","JavaAutomation"));

		//Method1: using for
		for (String str : names) {
			if (str.length() < 6) 
				System.out.print(str+" ");
		}
		System.out.println();
		System.out.println("-----------");

		//Method2: Using Stream
		List<String> nameFilteredList = names.stream().filter(name -> name.length() < 6).collect(Collectors.toList());
		nameFilteredList.forEach(name -> System.out.print(name+" "));

		System.out.println();


		/*The output of both the examples are same, however there is a major difference between these examples 
		if you consider the performance of the code.
		In the first example, we are iterating the whole list to find the strings with length less than 6. 
		There is no parallelism in this code.
		In the second example, the stream() method returns a stream of all the names, the filter() method 
		returns another stream of names with length less than 6, the count() method reduces this stream to the result. 
		All these operations are happening parallel which means we are able to parallelize the code with the help of 
		streams. 
		Parallel execution of operations using stream is faster than sequential execution without using streams.*/

	}

	@Test(enabled=false)
	public void findString_multipleconditionUsingFilter() {

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","Selenium","Python","Automation","JavaAutomation"));

		//Method2: Using Stream
		List<String> nameFilteredList = names.stream()
				.filter(name -> name.length() > 6 && name.length() < 12)
				.collect(Collectors.toList());
		nameFilteredList.forEach(name -> System.out.print(name+" "));

		System.out.println();

	}

	@Test(enabled=false)
	public void forEachToIterateListAndStream() {
		List<String> names = new ArrayList<String>();
	      names.add("Maggie");
	      names.add("Michonne");
	      names.add("Rick");
	      names.add("Merle");
	      names.add("Governor");
	      
	      
	      List<String> filteredNames = names.stream().filter(str -> str.startsWith("M")).collect(Collectors.toList());
	      //Iterate list
	      filteredNames.forEach(str -> System.out.println(str));
	      
	      System.out.println("--------");
	      
	      //Iterate stream
	      names.stream().filter(str -> str.startsWith("M")).forEach(str -> System.out.println(str));
	      
	}
	
	@Test(enabled=false)
	public void forEachToIterateHashMap() {

		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Monkey");
		hmap.put(2, "Dog"); 
		hmap.put(3, "Cat");  
		hmap.put(4, "Lion");   
		hmap.put(5, "Tiger");   
		hmap.put(6, "Bear");

		//Iterate map and display each key and value pair
		hmap.forEach((k,v) -> System.out.println(k+" : "+v));

		System.out.println("-----");

		/* forEach to iterate a Map and display the value of a particular  
		 * key     
		 */ 
		hmap.forEach((k,v) -> {

			if(k == 4) {
				System.out.println("Value associated with key 4 is: "+v); 
			}

		});

		System.out.println("--------------");

		/* forEach to iterate a Map and display the key associated with a
		 * particular value     
		 */
		
		hmap.forEach((k,v) -> {

			if("Cat".equals(v)) {
				System.out.println("Key associated with Value Cat is: "+k);
			}

		});

	}
	
	@Test(enabled=false)
	public void forEachOrderedExample() {
		List<String> names = new ArrayList<String>();
	      names.add("Maggie");
	      names.add("Michonne");
	      names.add("Rick");
	      names.add("Merle");
	      names.add("Governor");
	      
	      
	     names.stream()
	     	.filter(str -> str.startsWith("M"))
	     	.parallel()
	     	.forEach(str -> System.out.println(str));
	     	      
	      System.out.println("--------");
	      
	      names.stream()
	     	.filter(str -> str.startsWith("M"))
	     	.parallel()
	     	.forEachOrdered(str -> System.out.println(str));
	      
	}

	@Test(enabled=false)
	public void streamWithArrays() {
		
		int numbers[] = {22, 89, 1, 32, 19, 5};
		
		Arrays.stream(numbers).filter(num -> num%2==0).forEach(num -> System.out.print(num+" "));
		
	}
	
	@Test(enabled=false)
	public void sumOfNumbers_reduce() {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		
		Optional<Integer> sum  = numbers.stream().reduce((a,b) -> a+b);
		
		System.out.println("Sum of numbers: "+sum.get());
		
	}
	
	@Test(enabled=false)
	public void sumOfNumbers_mapToInt() {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//Method-1
		int sum = numbers.stream().mapToInt(e -> e).sum();
		System.out.println("Sum of numbers (mapToInt and sum): "+sum);
		
		/*mapToInt - Returns an IntStream consisting of the results of applying the given function to the elements 
		of this stream. 
		This is an intermediate operation.*/

		
	}
	
	@Test(enabled=false)
	public void averageOfNumbers_mapToInt() {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//Method-1
		double avg = numbers.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average of numbers (mapToInt and average): "+avg);
		
		/*mapToInt - Returns an IntStream consisting of the results of applying the given function to the elements 
		of this stream. 
		This is an intermediate operation.*/

		
	}
	
	@Test(enabled=false)
	public void countOfNumbers_mapToInt() {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//Method-1
		long count = numbers.stream().mapToInt(e -> e).count();
		System.out.println("Count of numbers (mapToInt and count): "+count);
		
		/*mapToInt - Returns an IntStream consisting of the results of applying the given function to the elements 
		of this stream. 
		This is an intermediate operation.*/

		
	}
	
	@Test(enabled=false)
	public void averageOfNumbersInArray() {

		int nums[] = {2,4,6,4,3,6,7,8,9};

		//Java 8 
		OptionalDouble average = Arrays.stream(nums).average();
		System.out.println(average);
	}
	
	@Test(enabled=false)
	public void squareNumbersFilterAndCalculateAverage() {
		
		List<Integer> numbers = Arrays.asList(1,10,20,30,15);
		
		//Method-1
		double avg = numbers.stream()
								.map(e -> e*e)
								.filter(e -> e>100)
								.mapToInt(e -> e)
								.average().getAsDouble();
		System.out.println("Average of square of numbers: "+avg);
		
		/*mapToInt - Returns an IntStream consisting of the results of applying the given function to the elements 
		of this stream. 
		This is an intermediate operation.*/

		
	}
	
	
	@Test(enabled=false)
	public void NumbersStartsWith() {
		
		List<Integer> numbers = Arrays.asList(2,30,24,45,290,30,24,2457,42,44,23,23,24);
		
		List<String> strNum = numbers.stream()
				.map(e -> String.valueOf(e))
				.filter(e -> e.startsWith("2"))
				.map(e -> e+2)
				.collect(Collectors.toList());
		
		strNum.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		System.out.println("--------");
		
		//Convert int to str to use filter and convert result back to int
		List<Integer> intNum = numbers.stream()
				.map(e -> String.valueOf(e))
				.filter(e -> e.startsWith("2"))
				.map(Integer::valueOf) 			//convert string to integer
				//.map(e -> Integer.parseInt(e))		//convert string to integer
				.map(e -> e+2)
				.collect(Collectors.toList());
		
		intNum.forEach(e -> System.out.print(e+" "));
		System.out.println();
				
		
	}
	
	
	@Test(enabled=false)
	public void countOfWordFromCapitalizedString() {

		String str = "SeleniumAutomationUsingJavaProgramming";
		
		long count3 = str.chars().filter(e -> e>=65 && e<=90).count(); 
		System.out.println("No of Capitalize word(streams1): "+count3);

		long count4 = str.chars().filter(e -> Character.isUpperCase(e)).count(); 
		System.out.println("No of Capitalize word(streams2): "+count4);
		
		int count = 0;

		for(int i = 0; i < str.length(); i++) {

			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				count++;			
		}

		System.out.println("No of Capitalize word: "+count);


		int count1 = 0;
		for(int i = 0; i < str.length(); i++) {

			if(str.charAt(i)>=65 && str.charAt(i)<=90)
				count1++;			
		}

		System.out.println("No of Capitalize word(Asci): "+count1);

		int count2 = 0;
		for(int i = 0; i < str.length(); i++) {

			if(Character.isUpperCase(str.charAt(i)))
				count2++;			
		}

		System.out.println("No of Capitalize word(isUpperCase): "+count2);


	}

	
	@Test(enabled=false)
	public void removeNullFromList() {
		
		List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
		
		List<String> result = list.stream()
			.filter(str -> str != null)
			.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		
	}
	
	
	
	

}
