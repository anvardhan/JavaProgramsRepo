package javaprograms;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Programs_Series3 {

	@Test(enabled=false)
	public void reverseArray() {

		//Swap 1st element with the last element and 2nd element with 2nd last and so on
		/* Here we are writing the logic to swap first element with
		 * last element, second last element with second element and
		 * so on. On the first iteration of For loop i is the index 
		 * of first element and j is the index of last. On the second
		 * iteration i is the index of second and j is the index of 
		 * second last.
		 */
		//METHOD1: using for

		int[] nums = new int[] {140,125,6,84,3,1,7,4,56,24,23,12,3,9,15};

		int halfLength = nums.length/2;
		int temp = 0;

		for(int i = 0, j = nums.length-1; i < halfLength; i++,j--) {

			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;

		}

		System.out.println("Reversed numbers in Array are: ");
		for(Integer num : nums) {
			System.out.print(num+" ");
		}



		//METHOD2: using while


		int[] nums2 = new int[] {90,152,52,45,85,78,23,96};

		int halfLength2 = nums2.length/2;
		int temp2 = 0;

		int i = 0;
		int j = nums2.length-1;

		while(i<j)
		{
			temp2 = nums2[i];
			nums2[i] = nums2[j];
			nums2[j] = temp2;
			i++;
			j--;
		}

		System.out.println("Reversed numbers in 2nd Array are: ");
		for(Integer num : nums2) {
			System.out.print(num+" ");
		}		
	}

	@Test(enabled = false)
	public void convertStringToCharArray() {

		//String to Char Array
		String str = "java";

		//1) Using toArray
		char[] charArray = str.toCharArray();

		for(char ch : charArray) {
			System.out.print(ch+",");
		}
		System.out.println();

		//2) using charAt

		char[] charArray1 = null;

		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i)+","); //store value in char array
			charArray1[i] = str.charAt(i);
		}

	}

	@Test(enabled=false)
	public void convertCharArraytoString() {

		//Method1: Using String object
		char[] ch = {'g', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
		String str = new String(ch);
		System.out.println(str);

		//Method2
		char[] charArrays = {'j','a','v','a'};
		String str1 = "";

		for(Character ch1 : charArrays) {
			str1 = str1 + Character.toString(ch1);
		}
		System.out.print(str1 + " ");

		//Method3
		char[] charArrays2 = {'p','r','o','g','r','a','m'};
		String str2 = "";

		for(Character ch2 : charArrays2) {
			str2 = str2 + String.valueOf(ch2);
		}
		System.out.println(str2);


	}

	@Test(enabled=false)
	public void findLargestAndSmallest() {

		int numbers[] = new int[]{55,132,45,98,82,11,90,39,50};

		int largest, smallest;

		//assign first element of an array to largest and smallest
		largest = numbers[0];
		smallest = numbers[0];

		for(int i = 1; i < numbers.length; i++) {

			if(numbers[i] > largest)
				largest = numbers[i];
			else if(numbers[i] < smallest)
				smallest = numbers[i];

		}

		System.out.println("Largest: "+largest);
		System.out.println("Smallest: "+smallest);
	}

	@Test(enabled=false)
	public void FindLargest2NumberTest() {

		int array1[] = {9,10,14,12,10,14,10,12,10,14,7,6,5};
		findLargestTwo(array1);

		int array2[] = {9,9,82,0,1,9,10,0,34,7,6,5};
		findLargestTwo(array2);

		//Another approach - sort array using selection sort in descending order - 1st two element will be largest1

	}
	public void findLargestTwo(int array[]) {

		int largest1 = array[0]; //9
		int largest2 = array[1]; //10
		int temp;

		if(largest1 < largest2) {
			temp = largest2; 
			largest2 = largest1; //9
			largest1=temp; //10
		}

		for(int i = 2; i < array.length ; i++) {

			if(array[i] > largest1) {
				largest2 = largest1; //10
				largest1 = array[i]; //14						
			} else if(array[i] > largest2 & array[i] != largest1){
				largest2 = array[i];
			}			
		}

		System.out.println("Largest1: "+largest1);
		System.out.println("Largest2: "+largest2);

	}


	@Test(enabled=false)
	public void countOfWordFromCapitalizedString() {

		String str = "SeleniumAutomationUsingJavaProgramming";

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


		long count3 = str.chars().filter(e -> e>=65 && e<=90).count(); 
		System.out.println("No of Capitalize word(streams1): "+count3);

		long count4 = str.chars().filter(e -> Character.isUpperCase(e)).count(); 
		System.out.println("No of Capitalize word(streams2): "+count4);

	}


	@Test(enabled=false)
	public void findSubtringInOriginalStringTest() {

		System.out.println(isSubString_regex("Automation", "auto"));
		System.out.println(isSubString_regex("Automation", "uto"));
		System.out.println(isSubString_regex("Automation", "ato"));
		System.out.println(isSubString_regex("Automation", "m"));
		System.out.println(isSubString_regex("Automation", ""));
		//System.out.println(isSubString_regex("Automation", null));
		System.out.println(isSubString_regex("Automation Testing", "test"));
		System.out.println(isSubString_regex("Automation Testing", "Automation Testing"));		

		System.out.println("contains: "+isSubString_contains("Automation", "auto"));
		
		System.out.println("indexof: "+ isSubString_indeof("Automation", "auto"));
		
		
	}
	public boolean isSubString_regex(String original, String sub) {

		return original.toLowerCase().matches("(.*)"+ sub.toLowerCase() + "(.*)");

	}
	public boolean isSubString_contains(String original, String sub) {

		return original.toLowerCase().contains(sub.toLowerCase());

	}
	public boolean isSubString_indeof(String original, String sub) {

		return original.toLowerCase().indexOf(sub.toLowerCase()) != -1;

	}

	
	@Test(enabled = false)
	public void findDuplicateCharacterInString() {

		String str = "Java Programming";

		System.out.println("Duplicate Characters are:");

		//Find Duplicate character
		for(int i = 0; i < str.length(); i++) {

			//check char at ith position if appears previously then continue to next iteration
			boolean flag = false;
			for(int temp = i; temp > 0 ; temp--) {
				if(str.charAt(i) == str.charAt(temp-1)) {
					flag = true;
					break;
				}
			}

			if(flag) 
				continue;

			//If char is not appeared previously then check for duplicate.
			for(int j = i+1; j <str.length(); j++) {

				if(str.charAt(i) == str.charAt(j)) {
					System.out.print(str.charAt(i)+" ");
					break;
				}				
			}			
		}

	}

	@Test(enabled = false)
	public void findUniqueCharacterInString() {

		String str = "Java Programming";

		System.out.println("Unique Characters are:");

		//Find Unique character
		for(int i = 0; i < str.length(); i++) {

			//check repeated char if appears previously then continue to next iteration
			boolean flag = false;
			for(int temp = i; temp > 0 ; temp--) {
				if(str.charAt(i) == str.charAt(temp-1)) {
					flag = true;
					break;
				}
			}

			if(flag) 
				continue;

			//If char is not appeared previously then check for uniqueness.
			boolean flag2 = true;
			for(int j = i+1; j <str.length(); j++) {

				if(str.charAt(i) == str.charAt(j)) {
					flag2 = false;
					break;
				}				
			}

			if (flag2) {
				System.out.print(str.charAt(i)+" ");
			}

		}

	}

	@Test(enabled=false)
	public void missingNumberFromSequenceInArray() {

		int a[] = {1,2,4,5,6};

		int sum1=0;
		for(int i =0 ; i <a.length; i++) {
			sum1=sum1+a[i];
		}

		int totalSum=0;
		//for(int i =1 ; i <= 6; i++) {
		//totalSum=totalSum+i;
		//}

		for(int i =a[0] ; i <= a[a.length-1]; i++) {
			totalSum=totalSum+i;
		}

		System.out.println("Missing Number: "+ (totalSum-sum1));

	}






}
