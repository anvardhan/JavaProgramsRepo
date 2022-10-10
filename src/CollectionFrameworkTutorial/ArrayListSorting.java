package CollectionFrameworkTutorial;

import java.util.*;
public class ArrayListSorting  {

     public static void main(String args[]){
    	 
    	// List of objects of Author class
    	 ArrayList<Student> arraylist = new ArrayList<Student>();
	   
	   arraylist.add(new Student(223, "Chaitanya", 26));
	   arraylist.add(new Student(245, "Rahul", 24));
	   arraylist.add(new Student(209, "Ajeet", 32));

	   Collections.sort(arraylist);
	   //Collections.sort(arraylist,Collections.reverseOrder());

	   for(Student str: arraylist){
			System.out.println(str);
	   }
     }
}
