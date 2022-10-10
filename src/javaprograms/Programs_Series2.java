package javaprograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class Programs_Series2 {

	@Test(enabled=false)
	public void ReverseStringTest() {
		ReverseString_Method1("radar");
		ReverseString_Method1("Anand");
		ReverseString_Method1("Selenium Automation Testing");

		ReverseString_Method2("radar");
		ReverseString_Method2("Anand");
		ReverseString_Method2("Selenium Automation Testing");

		ReverseString_Method3("radar");
		ReverseString_Method3("Anand");
		//ReverseString_Method3("Selenium Automation Testing"); //This method does not allow space

	}
	public void ReverseString_Method1(String str) {

		String revStr = "";

		int length = str.length();

		for(int i = length-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println("Original String:"+str+ " And Reversed String: "+revStr);		
	}
	public void ReverseString_Method2(String str) {

		StringBuffer s = new StringBuffer(str);
		StringBuffer revStr = s.reverse();

		System.out.println("Original String:"+str+ " And Reversed String: "+revStr);

	}	
	public void ReverseString_Method3(String str) {

		//Not working for space in between
		//System.out.println(str.charAt(2));

		int strLength = str.length(); //5

		char[] ch = new char[5];
		char rev;

		int j = 0;
		for(int i = strLength-1; i >= 0; i--) {
			rev = str.charAt(i);			
			//System.out.print(rev);
			ch[j] = rev;
			j++;
		}

		//convert char array to string
		String reversedString = new String(ch);

		System.out.println("Original String:"+str+ " And Reversed String: "+reversedString);		
	}

	@Test(enabled=false)
	public void PalindromeStringTest() {

		//Non Recursive
		isPalindromeString_Method1("radar");
		isPalindromeString_Method1("Anand");
		isPalindromeString_Method1("AVA");

		isPalindromeString_Method2("radar");
		isPalindromeString_Method2("Anand");
		isPalindromeString_Method2("abcddcba");

		//Recursive
		//A method which call itself is Recursive method

		String str = "abcdeedcba";

		boolean flag = isPalindromeString_recurseMethod(str);

		if(flag) {
			System.out.println("String "+str+" is a Palindrome string");
		}

	}
	public void isPalindromeString_Method1(String str) {

		//A string is said to be palindrome if reversed string is same as its original string .

		String revStr = "";

		int length = str.length();

		for(int i = length-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		//System.out.println(revStr);

		if(str.equalsIgnoreCase(revStr)) {
			System.out.println("Original String '"+str+"' And Reversed String '"+revStr+ "' is a Palindrome String");
		} else {
			System.out.println("Original String '"+str+"' And Reversed String '"+revStr+ "' is NOT a Palindrome String");
		}		
	}
	public void isPalindromeString_Method2(String str) {

		//A string is said to be palindrome if it reads the same backward as forward.

		//Method1
		int length = str.length();
		boolean flag = true; //Palindrome

		for(int i = 0,j = length-1; i < j; i++,j--) {

			if(str.charAt(i) != str.charAt(j)) {

				flag = false;
				break;
			}
		}

		if(flag == true) {
			System.out.println(str+ " is a Palindrome String");
		} else {
			System.out.println(str+ " is NOT a Palindrome String");
		} 
	}
	public boolean isPalindromeString_recurseMethod(String s) {

		if(s.length() == 0 || s.length() == 1) {
			return true;
		}

		if(s.charAt(0) == s.charAt(s.length()-1)) {
			return isPalindromeString_recurseMethod(s.substring(1,s.length()-1)); // it will pass ada to method again
		} else {
			return false;
		}
	}

	@Test(enabled=false)
	public void ReverseEachWordTest() {
		
		ReverseWord("This is Java Programming"); //sihT si avaJ gnimmargorP 
		
	}
	public void ReverseWord(String str) {
		
		/*
		 * We can reverse each word of a string by the help of reverse(), split() and substring() methods. 
		 * By using reverse() method of StringBuilder class, we can reverse given string. 
		 * By the help of split("\\s") method, we can get all words in an array. 
		 * To get the first character, we can use substring() or charAt() method.
		 * 
		 */
		
		String words[] = str.split("\\s");
		String reversedWord = "";
		
		for(String word : words) {
			
			//Approach1			
			/*StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			reversedWord = reversedWord + sb.toString() + " ";	*/	
			
			//Aproach2
			reversedWord = reversedWord + ReverseStringOfWord(word) + " ";
		}		
		
		System.out.println("Reversed Words are: "+reversedWord);
		
	}
	public String ReverseStringOfWord(String str) {
		//Reverse each word for Approach2
		String revStr = "";

		int length = str.length();

		for(int i = length-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;		
	}
	
	
	@Test(enabled=false) 
	public void AnagramTest() {
		//Two strings are called anagrams if they contain same set of characters but in different order.
		//Two strings are said to be anagram if we can form one string by arranging the characters of another string. 
		//For example, Race and Care. Here, we can form Race by arranging the characters of Care.

		isAnagram("Anand", "nanda");
		isAnagram("Anand", "Richa");
		isAnagram("Anand", "Ajay");
		isAnagram("Anand Vardhan", "Vardhan Ana nd");
		isAnagram("Mother In Law", "Hitler Woman");

	}
	public void isAnagram(String str1, String str2) {

		//convert strings into lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		//remove spaces
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		
		//check if length is same
		if(str1.length() == str2.length()) {

			//convert strings to char array
			char charArray1[] = str1.toCharArray();
			char charArray2[] = str2.toCharArray();
			
			//sort char array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
			
			if(result) {
				System.out.println(str1+" and "+str2 +" are anagram");
			} else {
				System.out.println(str1+" and "+str2 +" are NOT anagram");
			}

		} else {
			System.out.println(str1+" and "+str2 +" are NOT anagram");
		}

		/* Arrays.equals(charArray1,charArray2) - Returns true if the two specified arrays of chars are equal to one another. 
		Two arrays are considered equal if both arrays contain the same number of elements, 
		and all corresponding pairs of elements in the two arrays are equal. 
		In other words, two arrays are equal if they contain the same elements in the same order. 
		Also,two array references are considered equal if both are null. */
		
	}


	@Test(enabled=false)
	public void countEachCharactersInString() {

		String str = "Java"; //j=1,a=2,v=1

		for (int i = 0; i < str.length(); i++) {

			char ch1 = str.charAt(i);

			//if (s.indexOf(ch1) < i)
			//  continue;
			//To check to not work on duplicate character, skip the iteration
			boolean flag = false;
			for(int temp = i; temp > 0; temp--) {
				char tempCh = str.charAt(temp-1);
				if(ch1 == tempCh) {
					flag = true;
					break;
				}
			}

			if(flag)
				continue;

			//Actual Operation
			int count = 0;
			for (int j = 0; j < str.length(); j++) {

				char ch2 = str.charAt(j);

				if(ch1 == ch2) {
					count++;
				}				
			}

			System.out.println(str.charAt(i)+" = "+count);

		}			
	}


	@Test(enabled=false)
	public void stringManupulation() {

		String str = "This is Selenium Automation";

		//Find position of char of its 1st occurrence 

		System.out.println(str.indexOf('s'));

		//Find position of char of its 2nd occurrence 
		//System.out.println(str.indexOf('s', 4)); //3
		System.out.println(str.indexOf('s', (str.indexOf('s')+1))); //6


		//Get position of string
		System.out.println(str.indexOf("Selenium")); //8 - Selenium starts from index 8th
		System.out.println(str.indexOf("Hello")); //-1

		//Substring
		System.out.println(str.substring(5));
		System.out.println(str.substring(8, 16)); //end index not included

		//Split
		String lang = "This is Selenium test";
		String splitLang[] = lang.split("\\s");
		System.out.println(splitLang.length);
		System.out.println(splitLang[3]);

		String userData = "Amay;Kumar;9987675645;B";
		String userDataSplit[] = userData.split(";");
		System.out.println(userDataSplit.length);
		System.out.println(userDataSplit[2]);		

	}

	@Test(enabled=false)
	public void swapTwoStringWithouttempVariable() {

		String str1 = "Hello";
		String str2 = "World";

		System.out.println("Before Swapping:");
		System.out.println("Str1: "+str1);
		System.out.println("Str2: "+str2);


		//Method1
		//Use 3rd Variable
		//Append
		/*String str = str1+str2; //HelloWorld

		//str2 - should contain Hello
		str2 = str.substring(0, str1.length());

		//str1 - should contain World
		str1 = str.substring(str2.length()); */



		//Method2
		//Without 3rd Variable
		//Append
		str1 = str1+str2; //HelloWorld

		//str2 - should contain Hello
		str2 = str1.substring(0, str1.length()-str2.length());

		//str1 - should contain World
		str1 = str1.substring(str2.length());

		System.out.println("After Swapping:");
		System.out.println("Str1: "+str1);
		System.out.println("Str2: "+str2);

	}
	
	
	@Test (enabled=false)
	public void printNumbersWithoutUsingNumbersInCode() {

		int a = 'a'/'a'; //1
		String str = "ssssssssss";

		for(int i = a; i <= str.length()*str.length(); i++) {
			System.out.println(i);
		}		
	}

	@Test (enabled=false)
	public void printNumbersWithoutUsingLoops_Recursion_StreamAndLambda() {
		//Print 2 to 103
		//1- Using recursion
		//2- Using Stream

		//Using Recursion
		int startNum = 2;
		int endNum = 103;
		printNum(startNum, endNum);		

		//Using Stream
		//IntStream.range(startInclusive, endExclusive);
		IntStream.range(startNum, endNum).forEach(e -> System.out.println(e));

	}
	public void printNum(int i, int j) {		

		if(i <= j) {	
			System.out.println(i);
			i++;
			printNum(i,j);
		}		
	}

	@Test(enabled=false) 
	public void printHelloWorldWithoutUsingSemicolon() {

		if(System.out.printf("Hello World \n") == null) {

		}
		if(System.out.append("Hello World \n") == null) {

		}
		if(System.out.append("Hello World \n").equals(null)) {

		}

	}

	@Test(enabled=false)
	public void removejunkOrSpecialCharacter() {

		String str = "#Anan^&d";

		//use regular expression
		//Regular Expression: [^a-zA-Z0-9]

		//str.replaceAll(regex, replacement)
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);		

	}


}
