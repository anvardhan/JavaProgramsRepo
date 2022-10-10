package CollectionFrameworkTutorial2;

public class Author implements Comparable<Author>{

	String firstName;
	String bookName;
	int auAge;
	
	Author (String firstName, String bookName, int auAge)	{
		this.firstName=firstName;
		this.bookName=bookName;
		this.auAge=auAge;
	}
	
	  public String getFirstName() { 
		    return firstName; 
	  }
	  public void setFirstName(String firstName) { 
		    this.firstName = firstName; 
	  }
	  public String getBookName() { 
		    return bookName; 
	  }
	  public void setBookName(String bookName) { 
		    this.bookName = bookName; 
	  }
	  public int getAuAge() { 
		    return auAge; 
	  }
	  public void setAuAge(int auAge) { 
		    this.auAge = auAge; 
	  } 
	
	@Override
	/* 
	 * When we only use Comparable, this is where we write sorting
	 * logic. This method is called when we implement the Comparable
	 * interface in our class and call Collections.sort()
	 */ 
	public int compareTo(Author au) {				
		return this.firstName.compareTo(au.firstName);
	}
	
	 @Override
	public String toString() {
	    return "[ firstName=" + firstName + ", bookName=" + bookName + ", auAge=" + auAge + "]";
	}
}
