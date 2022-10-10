package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Programs_Collections {


	@Test (enabled=false)  
	public void countEachCharactersInString_countDuplicate_countUnique_HashMap() {

		//Count characters from String and also display only duplicate and unique character

		String str = "Java";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		//convert string to array

		char[] chars = str.toCharArray();

		/* logic: char are inserted as keys and their count
		 * as values. If map contains the char already then
		 * increase the value by 1
		 */

		//containsKey -> Returns true if a map contains a mapping for the specifiedkey. 
		//More formally, returns true if and only if a map contains a mapping for a key k such that (key==null ? k==null : key.equals(k)). (There can beat most one such mapping.)

		for(Character ch : chars) {

			if(map.containsKey(ch)) { 
				map.put(ch, map.get(ch)+1); // if key is already present then increase value by 1 using map.get(ch)+1
			} else {
				map.put(ch, 1); //if key is not present then set the value to 1
			}			
		}

		//Display Value
		//get the set of keys and then display

		Set<Character> keys = map.keySet();

		System.out.println("All Characters and their frequency: ");
		for(Character key : keys) {
			System.out.println(key+" = "+map.get(key));
		}
		System.out.println();

		//Find only duplicate character and its value
		System.out.println("Duplicate characters from '"+str+"' are");
		for(Character key : keys) {
			if(map.get(key) > 1)
				System.out.println(key+" = "+map.get(key));
		}
		System.out.println();

		//Find only unique character and its value
		System.out.println("Unique characters from '"+str+"' are");
		for(Character key : keys) {
			if(map.get(key) == 1)
				System.out.println(key+" = "+map.get(key));
		}
	}

	@Test(enabled=false)
	public void DuplicateCharactersTest() {

		printDuplicateCharacter("Java");
		printDuplicateCharacter("A");
		printDuplicateCharacter(null);
		printDuplicateCharacter("");
		printDuplicateCharacter("Anand");
		printDuplicateCharacter("Tesla");
		printDuplicateCharacter("1000");
		printDuplicateCharacter("007 James Bond");

	}
	public void printDuplicateCharacter(String str) {


		if(str == null) {
			System.out.println("NULL STRING");
			return;
		}

		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}

		if(str.length() == 1) {
			System.out.println("Single length Char String: "+str);
			return;
		}		

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		str = str.toLowerCase();
		//convert string to array

		char[] chars = str.toCharArray();

		for(Character ch : chars) {

			if(map.containsKey(ch)) { 
				map.put(ch, map.get(ch)+1); // if key is already present then increase value by 1 using map.get(ch)+1
			} else {
				map.put(ch, 1); //if key is not present then set the value to 1
			}			
		}

		//Display Value
		//get the set of keys and then display

		Set<Character> keys = map.keySet();


		//print only duplicate character and its value
		System.out.println("Duplicate characters from '"+str+"' are");
		for(Character key : keys) {
			if(map.get(key) > 1)
				System.out.println(key+" = "+map.get(key));
		}
		System.out.println();

	}

	@Test(enabled=false)
	public void AllCharactersTest_FrequencyOfEachChar() {

		printAllCharacter("Java");
		printAllCharacter("A");
		printAllCharacter(null);
		printAllCharacter("");
		printAllCharacter("Anand");
		printAllCharacter("Tesla");
		printAllCharacter("1000");
		printAllCharacter("007 James Bond");

	}
	public void printAllCharacter(String str) {


		if(str == null) {
			System.out.println("NULL STRING");
			return;
		}

		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}

		if(str.length() == 1) {
			System.out.println("Single Char String");
			return;
		}		

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		str = str.toLowerCase();
		//convert string to array

		char[] chars = str.toCharArray();

		for(Character ch : chars) {

			if(map.containsKey(ch)) { 
				map.put(ch, map.get(ch)+1); // if key is already present then increase value by 1 using map.get(ch)+1
			} else {
				map.put(ch, 1); //if key is not present then set the value to 1
			}			
		}

		//Display Value
		//get the set of keys and then display

		Set<Character> keys = map.keySet();


		//print all character and its value
		System.out.println("All characters from '"+str+"' are");
		for(Character key : keys) {
			System.out.println(key+" = "+map.get(key));
		}
		System.out.println();

	}

	@Test(enabled=false)
	public void UniqueCharactersTest() {

		printUniqueCharacter("Java");
		printUniqueCharacter("A");
		printUniqueCharacter(null);
		printUniqueCharacter("");
		printUniqueCharacter("Anand");
		printUniqueCharacter("Tesla");
		printUniqueCharacter("1000");
		printUniqueCharacter("007 James Bond");

	}
	public void printUniqueCharacter(String str) {


		if(str == null) {
			System.out.println("NULL STRING");
			return;
		}

		if(str.isEmpty()) {
			System.out.println("Empty String");
			return;
		}

		if(str.length() == 1) {
			System.out.println("Single Char String");
			return;
		}		

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		str = str.toLowerCase();
		//convert string to array

		char[] chars = str.toCharArray();

		for(Character ch : chars) {

			if(map.containsKey(ch)) { 
				map.put(ch, map.get(ch)+1); // if key is already present then increase value by 1 using map.get(ch)+1
			} else {
				map.put(ch, 1); //if key is not present then set the value to 1
			}			
		}

		//Display Value
		//get the set of keys and then display

		Set<Character> keys = map.keySet();


		//print only Unique character and its value
		System.out.println("Unique characters from '"+str+"' are");
		for(Character key : keys) {
			if(map.get(key) == 1)
				System.out.println(key+" = "+map.get(key));
		}
		System.out.println();

	}

	@Test (enabled=false)  
	public void duplicateWordsElementTest() {

		//Count characters from String and also display only duplicate and unique character

		String names[] = {"Java","C#","C","Java","Ruby","Java","Python", "C", "Java"};
		findDuplicateElementWord_HashMap(names);
		//findDuplicateElement_HashSet(names);

		String str = "Hey Java is Java best language is Java";
		String strSplit[] = str.split("\\s");
		findDuplicateElementWord_HashMap(strSplit);

	}
	public void findDuplicateElementWord_HashMap(String names[]) {


		//HashMap to store count of each string element
		Map<String, Integer> map = new HashMap<String, Integer>();


		/* logic: Strings are inserted as keys and their count
		 * as values. If map contains the String already then
		 * increase the value by 1
		 */

		//containsKey -> Returns true if a map contains a mapping for the specified key. 
		//More formally, returns true if and only if a map contains a mapping for a key k such that (key==null ? k==null : key.equals(k)). (There can beat most one such mapping.)

		for(String name : names) {

			Integer countOfStringElement = map.get(name); 
			if(countOfStringElement == null) {
				map.put(name, 1);
			} else {
				map.put(name, map.get(name)+1);
			} 

			/*if(!map.containsKey(name)) { 
				map.put(name, 1); //if key is not present then set the value to 1
			} else {
				map.put(name, map.get(name)+1); // if key is already present then increase value by 1 using map.get(name)+1
			}	*/		
		}

		//Display Value
		//get the set of keys and then display

		Set<String> keys = map.keySet();

		//Find only duplicate String elements and its value
		System.out.println("Duplicate Elements are::");
		for(String key : keys) {
			if(map.get(key) > 1)
				System.out.println(key+" = "+map.get(key));
		}

	}
	public void findDuplicateElement_HashSet(String names[]) {

		Set<String> set = new HashSet<String>();
		for(String name : names) {

			if(set.add(name) == false) {
				System.out.println("Duplicate Element is: "+name);
			}			
		}

	}

	@Test (enabled=false)  
	public void UniqueWordsElementTest() {

		//Count characters from String and also display only duplicate and unique character

		String names[] = {"Java","C#","C","Ruby","Java","Python", "C", "Java"};
		findUniqueElement_HashMap(names); //Does not include element which is duplicate
	}
	public void findUniqueElement_HashMap(String names[]) {

		//HashMap to store count of each string element
		Map<String, Integer> map = new HashMap<String, Integer>();


		/* logic: Strings are inserted as keys and their count
		 * as values. If map contains the String already then
		 * increase the value by 1
		 */

		//containsKey -> Returns true if a map contains a mapping for the specifiedkey. 
		//More formally, returns true if and only if a map contains a mapping for a key k such that (key==null ? k==null : key.equals(k)). (There can beat most one such mapping.)

		for(String name : names) {

			Integer countOfStringElement = map.get(name); 
			if(countOfStringElement == null) {
				map.put(name, 1);
			} else {
				map.put(name, map.get(name)+1);
			} 

			/*if(!map.containsKey(name)) { 
				map.put(name, 1); //if key is not present then set the value to 1
			} else {
				map.put(name, map.get(name)+1); // if key is already present then increase value by 1 using map.get(name)+1
			}	*/		
		}

		//Display Value
		//get the set of keys and then display

		Set<String> keys = map.keySet();

		//Find only unique String elements and its value
		System.out.println("Unique Words Element are::");
		for(String key : keys) {
			if(map.get(key) == 1)
				System.out.println(key+" = "+map.get(key));
		}

	}

	@Test (enabled=false)  
	public void removeDuplicateWordTest() {

		//Count characters from String and also display only duplicate and unique character

		String names[] = {"Java","C#","C","Ruby","Java","Python", "C", "Java"};
		removeDuplicateElement_HashSet(names); //Includes all element once and ignore its other duplicate instances 

	}
	public void removeDuplicateElement_HashSet(String names[]) {

		Set<String> set = new HashSet<String>();
		for(String name : names) {

			if(set.add(name) == false) {
				set.add(name);
			}			
		}

		Iterator<String> it = set.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

	@Test (enabled=false)  
	public void countAllWordsElementTest() {

		//Count characters from String and also display only duplicate and unique character

		String names[] = {"Java","C#","C","Ruby","Java","Python", "C", "Java"};
		findAllElement_HashMap(names);

	}
	public void findAllElement_HashMap(String Words[]) {

		//HashMap to store count of each string element
		Map<String, Integer> wordMap = new HashMap<String, Integer>();

		for(String word : Words) {

			if(!wordMap.containsKey(word)) {
				wordMap.put(word, 1);
			} else {
				wordMap.put(word, wordMap.get(word)+1);
			} 		
		}

		//Display Value
		//get the set of keys and then display

		Set<String> keys = wordMap.keySet();

		//Find ALL words element and its count
		System.out.println("All Words Element are::");
		for(String key : keys) {
			System.out.println(key+" = "+wordMap.get(key));
		}

	}
	
	@Test (enabled=false)  
	public void findWordHavingHighestCountTest() {

		//Count characters from String and also display only duplicate and unique character

		String names[] = {"Java","C#","C","Ruby","Java","Python", "C", "Java"};
		
		findWordHavingHighestCount(names);
		
		String str = "Java is a Programming Language for Java Selenium Automation So for Selenium learn java and Automate Using selenium";
		String[] words = str.toLowerCase().split("\\s");
		findWordHavingHighestCount(words);

	}
	public void findWordHavingHighestCount(String Words[]) {

		//HashMap to store count of each string element
		Map<String, Integer> wordMap = new HashMap<String, Integer>();

		for(String word : Words) {

			if(!wordMap.containsKey(word)) {
				wordMap.put(word, 1);
			} else {
				wordMap.put(word, wordMap.get(word)+1);
			} 		
		}

		
		//Display all words and its count
				
		//Method2 - Iterate using forEach and Lambda to display All words and its count
		wordMap.forEach((k,v) -> System.out.println(k+" : "+v));
				
		//Display word having highest count
		//Create a map to store words having max count - i.e in case more than one word has max count then store all of them
		System.out.println("----Words having Highest count-----");
		Map<String, Integer> maxWordMap = new HashMap<String, Integer>(); 
		
		wordMap
			.entrySet()
				.stream()
					.filter(entry -> entry.getValue() == Collections.max(wordMap.values()))
						.forEach(e -> maxWordMap.put(e.getKey(),e.getValue()));
		
		//System.out.println(maxWordMap);
		maxWordMap.forEach((k,v) -> System.out.println(k+" : "+v));
		System.out.println("------------");

	}
	

	@Test(enabled=false)
	public void countOfAllDigitTest() {
		
		long num = 23452635254l; 
		getDigitCount(num);
		
	}
	public void getDigitCount(long number) {
		
		Map<Long, Integer> digitMap = new HashMap<Long, Integer>();
		
		while(number != 0) {
			
			long lastDigit = number % 10;
			
			if(digitMap.containsKey(lastDigit)) {
				digitMap.put(lastDigit, digitMap.get(lastDigit)+1);
			} else {
				digitMap.put(lastDigit, 1);
			}
			
			number = number / 10;
		}
		
		digitMap.forEach((k,v) -> System.out.println(k+" : "+v));		
		
	}
	
	
	@Test(enabled=false) 
	public void HashMap_Basic_Iterate_keyset_entryset_Lambda() {

		//No order, No indexing
		//Hashmap fetches data in random order
		//If order needs to be maintained then we need to use LinkedHashMap
		//Stores values in key value pair
		//key can not be duplicate
		//If we add same key and value pair which is already present then it overrides the old key and value pair.
		//can store n number of null values but only one null key

		//Store country as key and its capital as value
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("India", "New Delhi");
		hmap.put("USA", "Washington DC");
		hmap.put("UK", "London");
		hmap.put("Russia", null);
		hmap.put("France", null);
		hmap.put(null, "Berlin");

		System.out.println(hmap.get("UK"));
		System.out.println(hmap.get("India"));
		System.out.println(hmap.get("Usa")); //null
		System.out.println(hmap.get("USA"));
		System.out.println(hmap.get(null));
		System.out.println(hmap.get("France"));

		System.out.println("----------------------");

		//Method1:
		//Iterate using keyset
		Set<String> keys = hmap.keySet();
		for(String key : keys) {
			System.out.println("Key= "+key+" Value= "+hmap.get(key));
		}

		System.out.println("----------------------");

		//Method2:
		//Iterate using keyset over the keys and use iterator
		Iterator<String> it = hmap.keySet().iterator();

		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key= "+key+" Value= "+hmap.get(key));
		}

		System.out.println("----------------------");

		//Method3:
		//Iterate using entrySet over the set (pair) and use iterator

		//Set<Entry<String, String>> entryset = hmap.entrySet();		
		//Iterator<Entry<String, String>> it2 = entryset.iterator();

		Iterator<Entry<String, String>> it2 = hmap.entrySet().iterator();

		while(it2.hasNext()) {

			Entry<String, String> entry = it2.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key= "+key+" Value= "+value);

		}

		System.out.println("----------------------");

		//Method4:
		//using lambda and //hmap.forEach(action);
		//Note - k and v are just name, we can provide any name

		hmap.forEach((k,v) -> System.out.println("Key= "+k+" Value= "+v));



	}

	@Test(enabled=false) 
	public void ArrayList_Basic_Iterate_MutlipleWays() {


		//Store country as key and its capital as value
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("Usa");
		countries.add("Uk");
		countries.add("Russia");
		countries.add("France");

		//Method1:
		//Iterate using Lambda and Foreach
		countries.forEach(country -> 
		System.out.println(country)
				);


		System.out.println("----------------------");

		//Method2:
		//Iterate using iterator
		Iterator<String> it = countries.iterator();

		while(it.hasNext()) {
			String country = it.next();
			System.out.println(country);
		}

		System.out.println("----------------------");

		//Method3:
		//using lambda, foreachremaining and iterator
		it = countries.iterator();
		it.forEachRemaining(country -> 
		System.out.println(country)
				);

		System.out.println("----------------------");

		//Method4:
		//using for each
		for(String country : countries)
			System.out.println(country);

		System.out.println("----------------------");

		//Method5:
		//using for and index
		for(int i = 0; i< countries.size(); i++)
			System.out.println(countries.get(i));

		System.out.println("----------------------");

		//Method6:
		//Using listiterator() to traverse in both the direction
		ListIterator<String> listiterator = countries.listIterator(countries.size());

		while(listiterator.hasPrevious()) {
			String country = listiterator.previous();
			System.out.println(country);
		}

	}

	@Test(enabled=false)
	public void compareHashMap() {

		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		hmap1.put(1, "A");
		hmap1.put(2, "B");
		hmap1.put(3, "C");

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		hmap2.put(1, "A");
		hmap2.put(3, "C");
		hmap2.put(2, "B");

		HashMap<Integer, String> hmap3 = new HashMap<Integer, String>();
		hmap3.put(1, "A");
		hmap3.put(2, "B");
		hmap3.put(3, "C");
		hmap3.put(3, "D");

		HashMap<Integer, String> hmap4 = new HashMap<Integer, String>();
		hmap4.put(1, "A");
		hmap4.put(2, "B");
		hmap4.put(3, "C");
		hmap4.put(4, "D");

		HashMap<Integer, String> hmap5 = new HashMap<Integer, String>();
		hmap4.put(1, "A");
		hmap4.put(2, "B");
		hmap4.put(3, "C");


		HashMap<Integer, String> hmap6 = new HashMap<Integer, String>();
		hmap4.put(1, "A");
		hmap4.put(2, "B");
		hmap4.put(3, "C");
		hmap4.put(4, "C");

		//Method1 - on the basis of key-value: use equals method - Order does not matter
		System.out.println(hmap1.equals(hmap2));
		System.out.println(hmap1.equals(hmap3));

		//Method2 - compare hashmap for the same keys:keyset() - No matter what value is
		System.out.println(hmap1.keySet().equals(hmap2.keySet()));
		System.out.println(hmap1.keySet().equals(hmap3.keySet()));


		//Method3 - compare hashmap by values - No matter what key is
		//Say duplicates not allowed
		System.out.println(new ArrayList<>(hmap1.values()).equals(new ArrayList<>(hmap2.values())));

		ArrayList<String> list1 = new ArrayList<>(hmap1.values());
		ArrayList<String> list2 = new ArrayList<>(hmap2.values());
		ArrayList<String> list3 = new ArrayList<>(hmap3.values());
		ArrayList<String> list4 = new ArrayList<>(hmap4.values());
		ArrayList<String> list5 = new ArrayList<>(hmap5.values());
		ArrayList<String> list6 = new ArrayList<>(hmap6.values());

		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		System.out.println(list1.equals(list4));
		System.out.println(list5.equals(list6));

		//Say duplicates allowed
		System.out.println("Dups: "+ new HashSet<>(hmap5.values()).equals(new HashSet<>(hmap6.values()))); //Should return true




		//Method4: Find out extra keys compared to other map - Ex- Findout extra keys in hmap4 compared to hmap1 / or find out missing keys in hmap1 compared to hmap4
		//combines keys from both the maps using HashSet

		//Add keyset from hmap4 and hmap1 into combine keys
		HashSet<Integer> combineKeys = new HashSet<>(hmap1.keySet());		
		combineKeys.addAll(hmap4.keySet());	
		//Remove keys from hmap1 will give extra keys in hmap4
		combineKeys.removeAll(hmap1.keySet());
		System.out.println(combineKeys);

	}

	@Test(enabled=false)
	public void convertHashMapToArrayList() {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		hmap.put("Amazon", 30000);
		hmap.put("Walmart", 36000);
		hmap.put("Apple", 12000);
		hmap.put("Facebook", 42000);
		hmap.put("Netflix", 6000);

		//Iterate HashMap
		Iterator<Entry<String, Integer>> it = hmap.entrySet().iterator();

		while(it.hasNext()) {

			Entry<String,Integer> entry = it.next();

			System.out.println(entry.getKey()+" = "+entry.getValue());

		}

		//Convert keys and values to two different Array list
		ArrayList<String> compKeyList = new ArrayList<>(hmap.keySet());
		ArrayList<Integer> empValueList = new ArrayList<Integer>(hmap.values());

		System.out.println(compKeyList);
		System.out.println(empValueList);



	}


	@Test(enabled=false)
	public void convertArrayToArrayList_ArryListToArray_ArraysasList_addAll_Stream() {

		//Array To ArrayList

		//Method1:Using add() method to add elements in array_list
		int nums1[] = {10,20,30,20,40};
		ArrayList<Integer> alist1 = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++)
			alist1.add(new Integer(nums1[i]));
		System.out.print(alist1);
		System.out.println();

		//Method2 - Using Arrays.asList() method. Note- asList accepts Integer and not int
		Integer nums2[] = {104,206,330,240,404};
		ArrayList<Integer> alist2 = new ArrayList<Integer>(Arrays.asList(nums2));
		System.out.print(alist2);
		System.out.println();

		//Method3: Using Collections.addAll() method of java.utils.Collections class
		//Note- addAll accepts Integer and not int
		Integer nums3[] = {120,240,350,230,450};
		ArrayList<Integer> alist3 = new ArrayList<Integer>();
		Collections.addAll(alist3, nums3);
		System.out.print(alist3);
		System.out.println();

		//Method4: Direct providing array elements through asList
		ArrayList<Integer> alist4 = new ArrayList<Integer>(Arrays.asList(10,20,3,6,10,7,39,2,4,10,9,1,3,4,7,20,6));
		System.out.print(alist4);
		System.out.println();

		//Method5: Using Arrays.stream() method of java.utils.Arrays class
		Integer nums5[] = {10,20,30,20,40};
		ArrayList<Integer> alist5 = (ArrayList<Integer>)
				Arrays.stream(nums5)
				.collect(Collectors.toList());
		System.out.print(alist5);
		System.out.println();
		/*The Arrays.stream().collect() method is used which uses java.util.stream.Collectors class 
		to convert the stream to a list with the help of toList() method.*/


		//ArrayList To Array
		ArrayList<Integer> alist6 = new ArrayList<Integer>(Arrays.asList(10,20,3,6,10,7,39,2,4,10,9,1,3,4,7,20,6));
		Object[] arr = alist6.toArray();
		System.out.println(Arrays.toString(arr));

	}

	@Test(enabled=false)
	public void removeDuplicatesFromArray_HashSet_Arraylist_Streams() {


		//Method1 - Using LinkedHashSet
		ArrayList<Integer> alist1 = new ArrayList<Integer>(Arrays.asList(10,20,3,6,10,7,39,2,4,10,9,1,3,4,7,20,6));
		System.out.println(alist1);
		//1- Convert ArryList to LinkedHasSet
		LinkedHashSet<Integer> hset = new LinkedHashSet<Integer>(alist1);		
		//2- Convert LinkedHasSet back to Arraylist
		ArrayList<Integer> alist1Unique = new ArrayList<Integer>(hset);
		System.out.println(alist1Unique);

		//Method2- Using Streams
		//stream- Returns a sequential Stream with this collection as its source. 		
		ArrayList<Integer> alist2 = new ArrayList<Integer>(Arrays.asList(10,9,1,3,4,1,10,6));
		System.out.println(alist2);
		List<Integer> alist2Unique = alist2.stream().distinct().collect(Collectors.toList());
		System.out.println(alist2Unique);

		//Method3- Using LinkedHasset and addAll
		ArrayList<Integer> alist3 = new ArrayList<Integer>(Arrays.asList(10,20,3,6,10,6,3));
		System.out.println(alist3);
		LinkedHashSet<Integer> hset2 = new LinkedHashSet<Integer>(alist3);
		//clear list and add all element from hset to list
		alist3.clear();
		alist3.addAll(hset2);
		System.out.println(alist3);

	}

	@Test(enabled=false)
	public void removeEvenNumbersFromList_ArrayList_Lambda() {

		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(10,20,3,6,10,7,39,2,4,10,9,1,3,4,7,20,6));
		System.out.print(alist);
		System.out.println();

		//alist.removeIf(filter) //boolean java.util.ArrayList.removeIf(Predicate<? super Integer> filter)

		//Removes all of the elements of this collection that satisfy the givenpredicate. 
		//Errors or runtime exceptions thrown during iteration or bythe predicate are relayed to the caller.

		//Remove even numbers
		alist.removeIf(num -> num % 2 == 0);		
		System.out.println(alist);	

		//Remove odd numbers
		//alist.removeIf(num -> num % 2 != 0);
		//System.out.println(alist);
	}

	@Test(enabled=false)
	public void sublist_clone_ArrayList() {

		ArrayList<Integer> alist = new ArrayList<Integer>(Arrays.asList(10,20,3,6,10,7,39,2,4,10,9,1,3,4,7,20,6));
		System.out.print(alist);
		System.out.println();

		//Sublist
		ArrayList<Integer> sublist = new ArrayList<Integer>(alist.subList(2, 6));
		System.out.println(sublist);

		//Clone
		ArrayList<Integer> clonelist = (ArrayList<Integer>) alist.clone();
		System.out.println(clonelist);
	}

	@Test(enabled=false)
	public void sort_ArrayList_Ascending_Descending() {

		ArrayList<String> alist1 = new ArrayList<String>(Arrays.asList("Java","Selenium","Rest","Cucumber","Sql","Maven"));
		ArrayList<String> alist2 = new ArrayList<String>(Arrays.asList("Cucumber","Rest","Selenium","Java","Maven","Sql"));

		//Ascending order
		System.out.println(alist1);
		Collections.sort(alist1);
		System.out.println(alist1);

		//Descending order
		System.out.println(alist2);
		Collections.sort(alist2, Collections.reverseOrder());
		System.out.println(alist2);

		//Another way for Descending - 1st sort then reverse
		ArrayList<String> alist3 = new ArrayList<String>(Arrays.asList("Cucumber","Rest","Selenium","Java","Maven","Sql"));
		System.out.println(alist3);
		Collections.sort(alist3);
		Collections.reverse(alist3);
		System.out.println(alist3);

	}

	@Test(enabled=false)
	public void compareArrayList() {

		ArrayList<String> alist1 = new ArrayList<String>(Arrays.asList("Java","Selenium","Rest","Cucumber","Sql","Maven"));
		ArrayList<String> alist2 = new ArrayList<String>(Arrays.asList("Cucumber","Rest","Selenium","Java","Maven","Sql"));

		//Sort Array list and then compare

		Collections.sort(alist1);
		Collections.sort(alist2);

		System.out.println(alist1.equals(alist2));

	}

	@Test(enabled=false)
	public void compareTwoListAndFindAdditionalInList1() {

		ArrayList<String> alist1 = new ArrayList<String>(Arrays.asList("Java","Selenium","Rest","Cucumber","Sql","Maven"));
		ArrayList<String> alist2 = new ArrayList<String>(Arrays.asList("Cucumber","Rest","Selenium","Python","Maven","Sql"));
		System.out.println(alist1);
		System.out.println(alist2);

		//Find Additional element in list1 which is not present in list2 so remove all element from list1 which is present in list2. Any element which is in list1 and not present in list2 will not be removed and that element is Additional
		alist1.removeAll(alist2);

		System.out.println(alist1); //Java - Additional in list1

	}

	@Test(enabled=false)
	public void compareTwoListAndFindMissingInList1() {

		ArrayList<String> alist1 = new ArrayList<String>(Arrays.asList("Java","Selenium","Rest","Cucumber","Sql","Maven"));
		ArrayList<String> alist2 = new ArrayList<String>(Arrays.asList("Cucumber","Rest","Selenium","Python","Maven","Sql"));
		System.out.println(alist1);
		System.out.println(alist2);

		//Find Missing element in list1 which is present in list2 so remove all element from list2 which is present in list1. Any element which is in list2 and not present in list1 will not be removed and that element is Missing element for list1
		alist2.removeAll(alist1);

		System.out.println(alist2); //Python - Missing is list1

	}

	@Test(enabled=false)
	public void compareTwoListAndFindCommonInbothList() {

		ArrayList<String> alist1 = new ArrayList<String>(Arrays.asList("Java","Selenium","Rest","Cucumber","Sql","Maven"));
		ArrayList<String> alist2 = new ArrayList<String>(Arrays.asList("Cucumber","Rest","Selenium","Python","Maven","Sql"));
		System.out.println(alist1);
		System.out.println(alist2);

		//Find Common
		alist1.retainAll(alist2);

		System.out.println(alist1);
		System.out.println(alist2);

	}

}
