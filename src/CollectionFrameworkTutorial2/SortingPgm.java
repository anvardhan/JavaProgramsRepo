package CollectionFrameworkTutorial2;

import java.util.ArrayList;
import java.util.Collections;

public class SortingPgm {
	
	public static void main(String[] args) {
		// List of objects of Author class 
		ArrayList<Author> alist = new ArrayList<Author>();
		alist.add(new Author("Henry", "Tropic of Cancer",  45));
		alist.add(new Author("Nalo", "Brown Girl in the Ring", 56));
		alist.add(new Author("Frank", "300", 65));
	    alist.add(new Author("Deborah", "Sky Boys", 51));
	    alist.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	    /*       
	     * Sorting the list using Collections.sort() method, we       
	     * can use this method because we have implemented the        
	     * Comparable interface in our user defined class Author       
	     */
	    System.out.println("Sorting by Author First Name:");
	    Collections.sort(alist);	    
	    for (Author au : alist) {
		//System.out.println(au.getFirstName()+" "+au.getBookName()+" "+au.auAge);	
	    	System.out.println(au);
	    }
	    
	    /*Sorting using AuthorAgeComparator*/ 
	    System.out.println("Sorting by Author Age:");
	    Collections.sort(alist, new AuthorAgeComparator());
	    for (Author au : alist) {
			//System.out.println(au.getFirstName()+" "+au.getBookName()+" "+au.auAge);		
	    	System.out.println(au);
		 }
	    
	    /*Sorting using BookNameComparator*/ 
	    System.out.println("Sorting by Book Name:");
	    Collections.sort(alist, new BookNameComparator());
	    for (Author au : alist) {
			//System.out.println(au.getFirstName()+" "+au.getBookName()+" "+au.auAge);	
	    	System.out.println(au);
		 }
	}
}
