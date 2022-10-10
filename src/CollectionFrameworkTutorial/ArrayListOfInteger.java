package CollectionFrameworkTutorial;

import java.util.*;
public class ArrayListOfInteger  {

	public static void main(String args[]){
	   ArrayList<Integer> arraylist = new ArrayList<Integer>();
	   arraylist.add(11);
	   arraylist.add(2);
	   arraylist.add(7);
	   arraylist.add(3);
	   /* ArrayList before the sorting*/
	   System.out.println("Before Sorting:");
	   for(int counter: arraylist){
			System.out.print(counter+" ");
		}
	   System.out.println();
	   /* Sorting of arraylist using Collections.sort*/
	 // Collections.sort(arraylist);
	  //Collections.reverse(arraylist);
	  Collections.sort(arraylist,Collections.reverseOrder());

	   /* ArrayList after sorting*/
	   System.out.println("After Sorting:");
	   for(int counter: arraylist){
			System.out.print(counter+" ");
		}
	}
}
