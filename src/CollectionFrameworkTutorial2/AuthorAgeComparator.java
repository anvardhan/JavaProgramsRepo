package CollectionFrameworkTutorial2;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author>{

	@Override
	public int compare(Author au1, Author au2) {
		
		if(au1.auAge==au2.auAge)
			return 0;
		else if(au1.auAge>au2.auAge)
			return 1;
		else return -1;		
	}
}
