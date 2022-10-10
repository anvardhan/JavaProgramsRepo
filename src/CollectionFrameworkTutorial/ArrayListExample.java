package CollectionFrameworkTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
				
		ArrayList<String> alist = new ArrayList<String>();
		
		//Adding Elements  
		alist.add("Steve");
	    alist.add("Tim");
	    alist.add("Lucy");
	    alist.add("Pat");
	    alist.add("Angela");
	    alist.add("Tom");
	    
	  //iterating ArrayList - using advanced for loop
	    System.out.println("Unsorted ArrayList"); 
	    for(String str:alist) {
	    	 System.out.print(str+" "); 
	     }
	      System.out.println();
	      
	     /* Sort statement*/
		  Collections.sort(alist);
		  Collections.reverse(alist);
	      //Collections.sort(alist,Collections.reverseOrder());
	    
	     //iterating ArrayList - using iterator
		 System.out.println("Sorted ArrayList");
	     Iterator itr = alist.iterator();	     
	     while (itr.hasNext())
	     {
	    	 System.out.print(itr.next()+" ");
	     }
	 }
}
