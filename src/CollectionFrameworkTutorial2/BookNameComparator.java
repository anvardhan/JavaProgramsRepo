package CollectionFrameworkTutorial2;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Author>{
	@Override
	public int compare(Author au1, Author au2) {		
		return au1.bookName.compareTo(au2.bookName);
		}
}
