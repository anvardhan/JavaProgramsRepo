package CollectionFrameworkTutorial2;

import java.util.*; 

class BinarySearch 
{ 
    public static void main(String[] args) 
    { 
        // Create a list 
        List<Domain> list = new ArrayList<Domain>(); 
        list.add(new Domain(10, "quiz.geeksforgeeks.org")); 
        list.add(new Domain(20, "practice.geeksforgeeks.org")); 
        list.add(new Domain(30, "code.geeksforgeeks.org")); 
        list.add(new Domain(40, "www.geeksforgeeks.org")); 
  
        Comparator<Domain> c = new Comparator<Domain>() 
        { 
            public int compare(Domain u1, Domain u2) 
            { 
                return u1.getId().compareTo(u2.getId()); 
            } 
        }; 
        
        // Searching a domain with key value 10. To search 
        // we create an object of domain with key 10. 
      // Collections.binarySearch(list, key, c)
        //list is ArrayList object, key is object to besearched and c is comparator object
        int index = Collections.binarySearch(list, 
                                 new Domain(10, null), c); 
        System.out.println("Found at index  " + index); 
  
        // Searching an item with key 5 
        index = Collections.binarySearch(list, 
                                 new Domain(5, null), c); 
        System.out.println(index); 
    } 
} 
