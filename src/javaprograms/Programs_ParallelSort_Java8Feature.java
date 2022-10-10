package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Programs_ParallelSort_Java8Feature {
	
	/*Java 8 introduced a new method parallelSort() in the Arrays class of java.util package. 
	This method is introduced to support the parallel sorting of array elements.
	Algorithm of parallel sorting:
	1. The given array is divided into the sub arrays and the sub arrays are further divided into the their sub arrays, 
	this happens until the sub array reaches a minimum granularity.
	2. The sub arrays are sorted individually by multiple threads. The parallel sort uses Fork/Join Framework for 
	sorting sub arrays parallelly.
	3. The sorted sub arrays are merged.

	Advantage of Parallel Sort Over Simple Sort:
	The parallelSort() method uses the concept of multithreading which makes it much faster compared to the normal sort 
	when there are lot of elements.*/
	
	/*Java 8 features:
	 * Lambda expressions
	 * Streams
	 * Collectors
	 * String Joiner
	 * Parallel Sort
	 */
	
	
	@Test(enabled=false)
	public void streamWithArrays_Ascending() {
		
		int numbers[] = {22, 89, 1, 32, 19, 5, 8};
		
		Arrays.parallelSort(numbers); //Sorts the specified array into ascending numerical order.
		
		Arrays.stream(numbers).forEach(num -> System.out.print(num+" "));
		
	}
	
	@Test(enabled=false)
	public void streamWithArrays_SpecifyStartAndEndIndex() {
		
		int numbers[] = {22, 89, 1, 32, 19, 5, 8};
		
		Arrays.parallelSort(numbers,1,5); //Sort numbers between 1st and 5th index (5th index not included)
		
		Arrays.stream(numbers).forEach(num -> System.out.print(num+" "));
		
		//print in reverse order????
		//Arrays.stream(numbers).forEach(num -> );
		
	}
	


}
