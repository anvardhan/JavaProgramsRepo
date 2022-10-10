package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Programs_SortSearch_DS {
	
	//SORT
	/*Types of Sorting Algorithm
	Quick Sort
	Bubble Sort
	Merge Sort
	Insertion Sort
	Selection Sort
	Heap Sort
	Radix Sort
	Bucket Sort*/
	
	
	@Test(enabled=false)
	public void sortStringsInAscendingOrder_BubbleSort( ) {
				
		String str = "Rick,Steve,Abey,Lina,Anand";
		
		String[] strArray = str.split(",");
		
		//Print Before sorting
		 System.out.print("Strings Before Sorting:");
	     for (int i = 0; i < strArray.length; i++) 
	     {
	         System.out.print(strArray[i] + " ");
	     }
	     System.out.println();
	     //Bubble sort - Sort using compareTo() method
	     //Compares two strings lexicographically.The comparison is based on the Unicode value of each character in the strings. 
	     //The character sequence represented by this String object is compared lexicographically to the character sequence 
	     //represented by the argument string. The result is a negative integer if this String object lexicographically 
	     //precedes the argument string. 
	     //The result is a positive integer if this String object lexicographically follows the argument string. 
	    
	     String temp;
	     for(int i = 0; i<strArray.length; i++) 
	     {
	    	 
	    	 for (int j = i+1; j<strArray.length; j++) 
	    	 {
	    		 
	    		 if(strArray[i].compareTo(strArray[j]) > 0) 
	    		 {
	    			 temp = strArray[i];
	    			 strArray[i] = strArray[j];
	    			 strArray[j] = temp;
	    		 }	    		 
	    	 }	    	 
	     }
	     
	     System.out.print("Strings After Sorting (Ascending order):");
	     for (int i = 0; i < strArray.length; i++) 
	     {
	         System.out.print(strArray[i] + " ");
	     }		
	}
	
	@Test(enabled=false)
	public void sortStringsInDescendingOrder_BubbleSort( ) {
				
		String str = "Rick,Steve,Abey,Lina,Anand";
		
		String[] strArray = str.split(",");
		
		//Print Before sorting
		 System.out.print("Strings Before Sorting:");
	     for (int i = 0; i < strArray.length; i++) 
	     {
	         System.out.print(strArray[i] + " ");
	     }
	     System.out.println();
	     //Sort using compareTo() method
	     //Compares two strings lexicographically.The comparison is based on the Unicode value of each character in the strings. 
	     //The character sequence represented by this String object is compared lexicographically to the character sequence 
	     //represented by the argument string. The result is a negative integer if this String object lexicographically 
	     //precedes the argument string. 
	     //The result is a positive integer if this String object lexicographically follows the argument string. 
	    
	     String temp;
	     for(int i = 0; i<strArray.length; i++) {
	    	 
	    	 for (int j = i+1; j<strArray.length; j++) {
	    		 
	    		 if(strArray[i].compareTo(strArray[j]) < 0) {
	    			 temp = strArray[i];
	    			 strArray[i] = strArray[j];
	    			 strArray[j] = temp;
	    		 }	    		 
	    	 }	    	 
	     }
	     
	     System.out.print("Strings After Sorting (Descending order):");
	     for (int i = 0; i < strArray.length; i++) 
	     {
	         System.out.print(strArray[i] + " ");
	     }		
	}
	
	/*Bubble sort is a sorting algorithm that compares adjacent elements of an array and swaps them.
	 *Bubble sort is a simple sorting algorithm.
	 *This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared.
	 *and the elements are swapped if they are not in order.
	 */			
			//3,9,5,1,4 (i=0,j=1,2,3)
			//1,5,9,3,4 (i=1,j=2,3)
			//1,3,9,5,4 (i=1,j=4)
			//1,3,9,5,4 (i=2,j=3)
			//1,3,5,9,4 (i=2,j=4)
			//1,3,4,9,5 (i=3,j=4)
			//1,3,4,5,9 ->Final Sorted
	
	@Test(enabled = false)
	public void sortArrayInAscendingOrder_BubbleSort() {
		
		//int[] nums = new int[] {140,125,6,84,3,1,7,4,56,24,23,12,3,9};
		int[] nums = new int[] {3,9,5,1,4};
		int temp = 0;
		
		for(int i = 0; i < nums.length; i++) {		 
			
			for(int j = i+1; j < nums.length; j++) {					
				
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}				
			}			
		}
		
		System.out.println("Sorted numbers (Ascending Order) in Array are: ");
		for(Integer num : nums) {
			System.out.print(num+" ");
		}		
		
	}
	
	@Test(enabled = false)
	public void sortArrayInDescendingOrder_BubbleSort() {
		
		int[] nums = new int[] {140,125,6,84,3,1,7,4,56,24,23,12,3,9};
		
		//Sort
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i+1; j < nums.length; j++) {
				
				int temp = 0;
				
				if(nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}				
			}			
		}
		
		System.out.println("Sorted numbers (Descending Order) in Array are: ");
		for(Integer num : nums) {
			System.out.print(num+" ");
		}
		
		
	}

	
	/*Selection sort is a simple sorting algorithm. This sorting algorithm is an in-place comparison-based algorithm 
	 * in which the list is divided into two parts: 
	 * the sorted part at the left end and the unsorted part at the right end. 
	 * Initially, the sorted part is empty and the unsorted part is the entire list.
	 * 
	 * The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element 
	 * becomes a part of the sorted array. 
	 * This process continues moving unsorted array boundary from one element to the right.
	 * 
	 * Algorithm (SelectionSort -> in-place comparison sorting algorithm)
	 * 1.Set MIN variable to location/index 0 (which points to leftmost element) inside the 1st for loop
	 * 2.Search the location/index of the smallest element in the rest of the list. Use 2nd for loop
	 * 3.If found smallest element in step2 then Swap with value at location/index MIN
	 * 4.Increment MIN to point to next element in loop1
	 * 5.Repeat until the list is sorted
	 *  
	 *  Selection sort performs a smaller number of swaps compared to bubble sort;
	 *  therefore, even though both sorting methods are of O(N2), selection sort performs faster and more efficiently
	 */
	
	//Find location/index of the smallest element and swap with the location of min 
	//and Also set the min to new location and continue
	
	@Test(enabled=false)
	public void SelectionSort_sortArrayInAscendingOrder() {
		
		int[] nums = new int[] {135,125,6,84,3,1,7,4,56,24,23,12,3,9,564};
							  //0	1	2 3  4 5 6 7 8  9  10 11 121314	
		int min = 0; //location/index 0
		int temp = 0;
		
		//1- Set MIN variable to location/index 0 (which points to leftmost element)
		for(int i = 0; i < nums.length; i++) {  //4- increment min and 5- Repeat until list is sorted
			
			min = i;  //i represents location/index
			
			//2- Search the location/index of the smallest element in the rest of the list
			for(int j = i+1; j < nums.length; j++) {
				
				if(nums[min] > nums[j]) {
					min = j;  //min and j represents location/index
				}				
			}
			
			//3- swap smallest element (jth which is in min) with ith element
			temp = nums[min]; //min represents 5th index in 1st iteration i.e value 1 stored in temp
			nums[min] = nums[i]; //min point to jth location which has smallest element and now setting with value present in ith element.
			nums[i] = temp; //i points to left location where setting the smallest value
			
		}
		
		 for (int i = 0 ;i<nums.length; i++){
	        System.out.print(nums[i]+" ");
	     }	
		 System.out.println();
		 System.out.println("-------");
		  
		 //Using Stream
		 Arrays.stream(nums).forEach(e -> System.out.print(e+" "));
		
	}
	
	//--------*******----------
	//SEARCH
	
	/*Linear (or sequential) search is a search that finds an element in the list by searching the 
	 * element sequentially until the element is found in the list.
	 * A linear search is also known as a sequential search that simply scans each element at a time.
	 * 
	 */	
	
	@Test(enabled=false, description = "search 1st occurance")
	public void LinearSearch() {
		
		// linear search algorithm to find out a number among all other numbers entered by user/other source.
		
		/* Input: Number of elements (10), element's values, value to be searched
		 * Output:Position of the number input by user among other numbers*/
		
		//int array[] = new int[10];
		
		int count, itemSearch, elementArray[];
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter number of elements:");
	    count = input.nextInt(); //10
	    
	    //create array to store numbers
	    elementArray = new int[count];
	    
	    System.out.println("Enter Array elements:");
	    for(int i = 0; i < count; i++) {	    
	    	elementArray[i] = input.nextInt();	    	 
	    }
	    
	    //System.out.println(elementArray[2]);
	    
	    System.out.println("Enter search element:");
	   
	    itemSearch = input.nextInt();
	    
	    boolean itemNotFound = true;
	    for(int i = 0; i < count; i++) {
	    	
	    	if(elementArray[i] == itemSearch) {
	    		System.out.println(itemSearch + " found at location "+(i+1));
	    		itemNotFound  = false;
	    		break;
	    	}
	    }
		
	    if(itemNotFound == true) {
	    	System.out.println(itemSearch + " doesn't exist in array.");
	    }
		
	}

	@Test(enabled=false, description = "search nth occurance")
	public void LinearSearch_searchNthOccurance() {
		
		// linear search algorithm to find out a number among all other numbers entered by user/other source.
		
		/* Input: Number of elements (10), element's values, value to be searched
		 * Output:Position of the number input by user among other numbers*/
		
		//int array[] = new int[10];
		
		int count, itemSearch, elementArray[];
		int occuranceNo;
		
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter number of elements:");
	    count = input.nextInt(); //10
	    
	    //create array to store numbers
	    elementArray = new int[count];
	    
	    System.out.println("Enter Array elements:");
	    for(int i = 0; i < count; i++) {	    
	    	elementArray[i] = input.nextInt();	    	 
	    }
	    
	    //System.out.println(elementArray[2]);
	    
	    System.out.println("Enter search element:");	   
	    itemSearch = input.nextInt();
	    
	    System.out.println("Enter occurance no:");	   
	    occuranceNo = input.nextInt();
	    	    
	    boolean itemNotFound = true;
	    int occuranceCount = 0;
	    for(int i = 0; i < count; i++) {
	    	
	    	if(elementArray[i] == itemSearch) {
	    		occuranceCount++;
	    		
	    		if(occuranceNo != occuranceCount)
	    			continue;
	    			
	    		System.out.println(itemSearch + " found at location "+(i+1));
	    		itemNotFound  = false;
	    		break;
	    	}
	    }
		
	    if(itemNotFound == true) {
	    	System.out.println(itemSearch + " doesn't exist in array.");
	    }
		
	}


	/*Binary search is an efficient algorithm for finding an item from a sorted list of items
	 * Binary Search in Java is a search algorithm that finds the position of a search value within a sorted array.
	 * 
	 * A binary search is a search in which the middle element is calculated to check whether it is 
	 * smaller or larger than the element which is to be searched. 
	 * Binary search looks for a particular item by comparing it with the middle most item of the collection. 
	 * If a match occurs, then the index of item is returned.	 
	 * If the searched item is greater than the middle item, then the item is searched in the sub-array to the right 
	 * of the middle item otherwise item to be searched on the left of the middle item.
	 * 
	 * The main advantage of using binary search is that it does not scan each element in the list. 
	 * Instead of scanning each element, it performs the searching to the half of the list. 
	 * So, the binary search takes less time to search an element as compared to a linear search.
	 * 
	 * The one pre-requisite of binary search is that an array should be in sorted order, 
	 * whereas the linear search works on both sorted and unsorted array. 
	 * The binary search algorithm is based on the divide and conquer technique, which means that it will divide the array recursively.
	 * 
	 * 
	 * STEPS: Ex- Array of size - 10
	 * Step 1: First, we calculate the middle element of an array. We consider two variables, 
	 * i.e., left and right. Initially, left =0 and right=9
	 * then mid = (left+right)/2 = 4
	 * 
	 * Step 2: case1 - if searchdata>a[mid],means data is on right side of mid element, 
	 * so the index value of left is incremented by mid+1, 
	 * i.e., left=mid+1. If the index Value of mid is 4, then the index value of left becomes 5. i.e left = 5, right = 9
	 * 
	 * case2 - if searchdata<a[mid],means data is on left side, 
	 * so the index value of right is decremented by mid-1, 
	 * i.e., right=mid-1. If the index value of mid is 4, then the index value of right becomes 8. i.e right = 8, left = 0
	 * 
	 * Step 3: Now again, the mid-value is calculated
	 * As per case1 - mid=7
	 * As per case2 - mid=4
	 * 
	 * Step4: Repeat step2 and step3 until a[mid]=searchdata.
	 * 
	 */
	
	@Test(enabled= true)
	public void BinarySearch() {
	
		
		int[] nums = new int[] {52,54,25,140,135,122,96,15,66};
		
		//Step1- Sort Array in Ascending order - use selection sort/binary sort.
		
		int length = nums.length;
		int min, temp;
		
		//1- Set MIN variable to location/index 0 (which points to leftmost element)
		for(int i = 0; i<length; i++) {
			min = i;
			
			//2- Search the location/index of the smallest element in the rest of the list
			for(int j = i+1; j<length; j++) {
				
				if(nums[min] > nums[j]) {
					min = j;  //point to index 7 having element 15 in the 1st ith iteration
				}
				
			}
			
			//3- swap
			temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}
		//Display Sorted Array
		for(Integer num : nums)
			System.out.print(num+ " ");
		System.out.println();
		
		//Step2 - Binary search with sorted array
		
		int searchItem = 52;
		
		int first = 0;
		int last = length; //9
		int mid = (first+last)/2; //4
		//System.out.println(mid);
		
		boolean found = false;
		while(first<=last) {
			
			if(searchItem > nums[mid]) {
				first = mid + 1; //5				
			} else if(searchItem < nums[mid]){
				last = mid - 1; //3
			} else {
				System.out.println("Element "+searchItem+" found at "+(mid+1)+" position");
				found = true;
				break;
			}
			
			mid = (first+last)/2;
		}
		
		if(!found)
			System.out.println("Element "+searchItem+" not found");
	}

}
