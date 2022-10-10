package streams_java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Programs_Streams_Series2 {
	
	@Test(enabled=false)
	public void concatenatingTwoStreamsArrayList() {
		
		ArrayList<String> name1 = new ArrayList<String>(Arrays.asList("Java","Selenium","Python"));
		ArrayList<String> name2 = new ArrayList<String>(Arrays.asList("Automation","JavaAutomation"));
		
		//Method1
		List<String> names = Stream.concat(name1.stream(), name2.stream())
									.collect(Collectors.toList());
		
		//names.forEach(str -> System.out.print(str+" "));
		names.forEach(System.out::println);
		System.out.println();	
		
		
		//Method2
		System.out.println("----------------");
		Stream<String> outStream = Stream.concat(name1.stream(), name2.stream());
		//outStream.forEach(str -> System.out.print(str+" "));
		outStream.forEach(System.out::println);
		System.out.println();
	}
	
	@Test(enabled=false)
	public void joinTwoArray_convertToArray_convertToList() {

		//Convert To Array
		
		String[] arr1 = {"book1", "book2", "book3", "book4", "book5"};
		String[] arr2 = {"book6", "book7", "book8", "book9", "book10"};

		String combinedArray[] = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
									.toArray((size -> new String[size]));
		//1st way to iterate
		for(String val : combinedArray) {
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println("---------");
		
		//2nd way to iterate Array -> convert array to stream and then use foreach - cant directly use foreach on array
		Arrays.stream(combinedArray).forEach(e -> System.out.print(e+ " "));
		
		System.out.println();
		System.out.println("---------");
		
		//Convert To List
		
		String[] arr3 = {"book1", "book2", "book3", "book4", "book5"};
		String[] arr4 = {"book6", "book7", "book8", "book9", "book10"};
		
		List<String> combinedList = Stream.concat(Arrays.stream(arr3), Arrays.stream(arr4))
										.collect(Collectors.toList());
		combinedList.forEach(e -> System.out.print(e+" "));		

		System.out.println();

	}
	
	@Test(enabled=false)
	public void sortNumbers_Ascending_Descending() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,0,1,4,-1,6,3,8,9,11);
		
		List<Integer> sortedAscendingNumbers = numbers.stream().sorted().collect(Collectors.toList());
		sortedAscendingNumbers.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		List<Integer> sortedDescendingNumbers = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		sortedDescendingNumbers.forEach(e -> System.out.print(e+" "));
		System.out.println();
		List<Integer> sortedDescendingNumbers2 = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		sortedDescendingNumbers2.forEach(e -> System.out.print(e+" "));
		System.out.println();
	}
	
	@Test(enabled=false)
	public void limit_skip_example() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,0,1,4,-1,6,3,8,9,11);
		
		//limit to 5
		List<Integer> l = numbers.stream().limit(5).collect(Collectors.toList());
		l.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//limit to 5 and add those
		int sum = numbers.stream().limit(5).reduce((i,j) -> i+j).get();
		System.out.println("Sum of limit 5: "+sum);
		
		//Skip first 5
		List<Integer> sk = numbers.stream().skip(5).collect(Collectors.toList());
		sk.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//Skip first 5 and add those
		int sumsk = numbers.stream().skip(5).reduce((i,j) -> i+j).get();
		System.out.println("Sum after skip 5: "+sumsk);
		
	}
	
	@Test(enabled=false)
	public void findDuplicateNumbers() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,1,4,6,3,8,9,11);
		
		//Method1
		/*Collections.frequency (collection reference , object-element of collection):
		  Returns the number of elements in the specified collection equal to the specified object. 
		More formally, returns the number of elements e in the collection 
		*/
		Set<Integer> dups = numbers.stream()
								.filter(e -> Collections.frequency(numbers, e)>1)
								.collect(Collectors.toSet());
		
		dups.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
		//Method2
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> dups1 = numbers.stream()
									.filter(e -> !dupNum.add(e))
									.collect(Collectors.toSet());
		dups1.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
	}
	
	@Test(enabled=false)
	public void findUniqueNumbers() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,1,4,6,3,8,9,11);
		
		Set<Integer> unique = numbers.stream()
		.filter(e -> Collections.frequency(numbers, e)==1).collect(Collectors.toSet());
		
		unique.forEach(e -> System.out.print(e+" "));
		System.out.println();
	}
	
	@Test(enabled=false)
	public void getDistinctElements_removeDuplicatesFromNewList() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,1,4,6,3,8,9,11);
		
		List<Integer> distictNumbers = numbers.stream().distinct().collect(Collectors.toList());
		distictNumbers.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
	}
		
	@Test(enabled=false)
	public void findMaxAndMinNumber() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,0,1,4,-1,6,3,8,9,11);
		
		Integer max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		
		Integer firstHigest = numbers.stream().sorted(Collections.reverseOrder()).distinct().findFirst().get();
		System.out.println("Max-Approach2: "+firstHigest);	
		
		Integer firstLowest = numbers.stream()
				.sorted()
				.distinct().findFirst().get();
		System.out.println("Min-Approach2: "+firstLowest);
		
	}
	
	
	@Test(enabled=false)
	public void findFirst2HighestNumbers() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,0,1,4,52,6,3,8,9,11);
		
		//Sort in descending order then distinct and limit to 2
		List<Integer> first2Higest = numbers.stream()
									.sorted(Collections.reverseOrder())
									.distinct().limit(2)
									.collect(Collectors.toList());
		first2Higest.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
	}
	
	@Test(enabled=false)
	public void findFirst2LowestNumbsres() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,0,1,4,52,6,3,8,9,11);
		
		//Sort in ascending order then distinct and limit to 2
		List<Integer> first2Lowest = numbers.stream()
									.sorted()
									.distinct().limit(2)
									.collect(Collectors.toList());
		first2Lowest.forEach(e -> System.out.print(e+" "));
		System.out.println();
		
	}
	
	
	@Test(enabled=false)
	public void find2ndHighest() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,0,1,4,52,6,3,8,9,11);
		
		//Sort in descending order then distinct skip 1st and findFirst
		int secHigest = numbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		
		System.out.println("Second Highest: "+secHigest);
		
	}
	
	@Test(enabled=false)
	public void find2ndLowest() {
		
		List<Integer> numbers = Arrays.asList(1,11,6,2,0,1,4,52,6,3,8,9,11);
		
		//Sort in Ascending order then distinct skip 1st and findFirst
		int secLowest = numbers.stream().sorted().distinct().skip(1).findFirst().get();
		
		System.out.println("Second Lowest "+secLowest);
		
	}

	


}
