package javaprograms;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class Programs_Series1 {

	@Test (enabled=false)  
	public void FibonacciSeriesTest() {
		/*The Fibonacci sequence is a series of numbers where a number is the sum of previous two numbers. 
		Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on. */

		fibSeriesGeneration(8);
		fibSeriesGeneration(1);
		fibSeriesGeneration(0);
		fibSeriesGeneration(-1);		
	}
	public void fibSeriesGeneration(int count) {
		System.out.print("Fibonacci Series of "+count+" numbers:");

		int num1=0, num2=1;

		if(count <= 0) {
			System.out.println("Provide count greater than 1");
			//System.exit(1);
		} else {
			//Using For Loop
			for (int i = 0; i < count ; i++) {

				System.out.print(num1+" "); //0 1 1 2 3 5 8 13

				int sumofprev2 = num1+num2;
				num1 = num2; 
				num2 = sumofprev2; 

				/* On each iteration, we are assigning second number
				 * to the first number and assigning the sum of last two
				 * numbers to the second number
				 */
			}
		}
		System.out.println();
	}


	@Test (enabled = false)
	public void FactorialTest() {

		//Logic - Factorial of a number n is denoted as n! and the value of n! is: 1 * 2 * 3 * … (n-1) * n
		//Factorial of 5 = 5*4*3*2*1 = 120
		//Factorial of 10 = 10*9*8*7*6*5*4*3*2*1 = 3628800
		//https://beginnersbook.com/2017/09/java-program-to-find-factorial-using-for-and-while-loop/

		//Non Recursion
		getFactorial(5);
		getFactorial(10);
		getFactorial(1);
		getFactorial(0);
		getFactorial(-1);
		getFactorial(20);

		//Recursion
	/*	int number = 10;
		long factRes = getFactrialRecursive(number);
		System.out.println("Factorial of "+number+" is: "+factRes);

		System.out.println(getFactrialRecursive(0));
		System.out.println(getFactrialRecursive(1));
		System.out.println(getFactrialRecursive(5)); */


	}
	public void getFactorial(int number) {

		long fact = 1l;
		for(int i = 1; i <= number; i++)
		{
			fact = fact * i; //1 * 2 * 3 * 4 * 5
		}
		System.out.println("Factorial of "+number+" is: "+fact);
	}
	public long getFactrialRecursive(int number) {

		if (number==0)
			return 1;
		else
			return (number * getFactrialRecursive(number-1));
	}

	@Test (enabled = false)
	public void PrimeNumberTest() {

		//check if number is prime or not
		System.out.println("is 17 prime: "+isPrimeNumber(17));
		System.out.println("is 20 prime: "+isPrimeNumber(20));
		System.out.println("is 2 prime: "+isPrimeNumber(2));
		System.out.println("is 1 prime: "+isPrimeNumber(1));
		System.out.println("is 0 prime: "+isPrimeNumber(0));
		System.out.println("is -2 prime: "+isPrimeNumber(-2));

		//Print prime numbers upto a range
		printPrimeNumbers(7);
		printPrimeNumbers(0);
		printPrimeNumbers(1);
		printPrimeNumbers(2);
		printPrimeNumbers(20);
		printPrimeNumbers(100);
		printPrimeNumbers(-1);		

		//Print prime numbers upto certain count
		printPrimeNumbers_1stN(20);
		printPrimeNumbers_1stN(1);
		printPrimeNumbers_1stN(0);
		printPrimeNumbers_1stN(-1);

	}
	public boolean isPrimeNumber(int num) {
		/*The number which is only divisible by itself and 1 is known as prime number, 
		 * for example 7 is a prime number because it is only divisible by itself and 1.
		 * 1st Prime number is 2.
		 */

		// Logic - 1st divide number by 2: 17 -> 17/2 =8.5=8
		// Next run loop between 2 to half because every number is divisible by 1
		// Next find reminder of dividing number by each value the in loop -> if reminder is 0 for any iteration then its not prime 
		// set prime flag to false if any iteration has reminder 0 and break from loop

		boolean checkPrimeFlag = true;

		if(num < 2)
			checkPrimeFlag = false;

		for (int i = 2; i <= num/2; i++) {

			int rem = num % i;

			if (rem == 0) {
				checkPrimeFlag = false;
				break;
			}        	
		}

		/*if (checkPrimeFlag == true) {
			System.out.println(num+" is a prime number");
		} else {
			System.out.println(num+" is a NOT a prime number");
		} */

		return checkPrimeFlag;
	}
	public void printPrimeNumbers(int count) {

		//Generate All prime numbers between 1 and 20;

		if(count<2) //if count is 1 then no prime number is between 1 and 1 as first prime number is 2
			System.out.println("Valid prime number starts from 2 - Provide count as 2 atleast"); //1 is not a prime number
		else {
			System.out.println("Prime Numbers upto "+count+ " are: ");

			for (int num=1; num<=count; num++) {

				/*boolean isPrime = true;
			for (int i = 2; i <= num/2; i++) {

				int temp = num % i;

				if (temp == 0) {
					isPrime = false;
					break;
'				}        	
			}
			if (isPrime == true) {
				System.out.print(num+" ");
			}*/

				if(isPrimeNumber(num))
					System.out.print(num+" ");
			}
		}
		System.out.println();
	}
	public void printPrimeNumbers_1stN(int count) {

		//Generate 1st 20 prime numbers

		int num = 1;
		int startCount = 1;
		System.out.println("1st "+count+" prime numbers are:");
		while(startCount <= count) {

			/*boolean isPrime = true;
			for (int i = 2; i <= num/2; i++) {

				int temp = num % i;

				if (temp == 0) {
					isPrime = false;
					break;
				}        	
			}

			if (isPrime == true) {
				System.out.print(num+" ");
				startCount++;
			}*/

			if(isPrimeNumber(num)) {
				System.out.print(num+" ");
				startCount++;
			}

			num++;
		}
		System.out.println();
	}



	@Test (enabled = false)
	public void ReverseNumberTest() {

		//Non Recursion
		ReverseNumber_Method1(3291);
		ReverseNumber_Method1(2565);
		ReverseNumber_Method1(1);
		ReverseNumber_Method1(0);
		ReverseNumber_Method1(-6563);

		//Recursion
		int num = 825307; //7028	
		int reversedNo = 0;
		reversedNo = ReverseNum_Method2_recurseMethod(num,reversedNo);
		System.out.println("Reverse Numbe: "+reversedNo);

		//StringBuffer
		ReverseNumber_Method3_StringBuffer(6565);
	}
	public void ReverseNumber_Method1(int number) {
		//if a given input number is 1923 then the output of the program should be 3291. 
		//Logic for Method1- Convert a num into reverse order.
		//start with revnum = 0 (initialize it)
		//In loop multiply revnum with 10
		//Then add num to num % 10 -> will give last digit as reminder added to revnum.  ex- 1923 % 10 -> 3 / 192%10 ->2 / 19%10 ->9 / 1%10 ->1
		//Then divide num/10 -> will give new number for next iteration. ex - 1923/10 -> 192 / 192/10 ->19 /19/10 ->1 / 1/10 ->0

		System.out.println("Given Number: "+number);
		int reverseNum = 0;
		int r = 0;

		while (number != 0) {
			r = number%10;
			reverseNum = (reverseNum*10) + r;
			number = number/10;	
		}
		System.out.println("Reverse of specified number is: "+reverseNum);
	}
	public int ReverseNum_Method2_recurseMethod(int num, int reversedNo) {

		//int reversedNo=0;

		if(num>0) {		
			reversedNo = reversedNo * 10;
			reversedNo = reversedNo + (num%10);
			reversedNo = ReverseNum_Method2_recurseMethod(num / 10, reversedNo);
		} 

		return reversedNo;

	}
	public void ReverseNumber_Method3_StringBuffer(long num) {
		StringBuffer num1 = new StringBuffer(String.valueOf(num));
		StringBuffer reverseNum = num1.reverse();		
		System.out.println("Reverse (using stringbuffer) of specified number is: "+reverseNum);
	}
	



	@Test (enabled = false)
	public void PalindromeNumberTest() {

		//reverse number and compare with original number - if they equal then its palindrome number
		isPalindromeNumber(151);
		isPalindromeNumber(3293);
		isPalindromeNumber(1);
		isPalindromeNumber(0);
		isPalindromeNumber(9229);

	}
	public void isPalindromeNumber(int number) {
		System.out.println("Given Number: "+number);
		int t = number;
		int reverseNum = 0;
		int r = 0;		

		while (number != 0) {
			r = number%10;
			reverseNum = (reverseNum*10) + r;
			number = number/10;	
		}

		if (t == reverseNum) {
			System.out.println("Number is Palindrom");
		} else {
			System.out.println("Number is NOT Palindrom");
		}	
	}
	


	@Test (enabled=false)
	public void ArmstrongNumberTest() {
		isArmstrongNumber(407);
		isArmstrongNumber(151);
		isArmstrongNumber(153);
		isArmstrongNumber(370);
		isArmstrongNumber(455);
		isArmstrongNumber(0);
		isArmstrongNumber(1);
		isArmstrongNumber(371);		
	}
	public void isArmstrongNumber (int number) {

		//Sum of cubes of all digit should match with its original number
		System.out.println("Given Number: "+number);
		int t = number;
		int sumOfCube = 0;
		int r = 0;

		while(number > 0) {			
			r = number % 10;
			sumOfCube = sumOfCube + (r*r*r);
			number = number/10;			
		}

		if (t == sumOfCube) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is NOT Armstrong");
		}	

	}
	



	@Test(enabled=false)
	public void StringOnlyDigitTest() {

		System.out.println(isNumeric("20"));
		System.out.println(isNumeric("1"));
		System.out.println(isNumeric("0"));
		System.out.println(isNumeric("134350"));
		System.out.println(isNumeric("1023sd"));
		System.out.println(isNumeric("test123"));
		System.out.println(isNumeric(""));
		System.out.println(isNumeric(null));
		System.out.println(isNumeric("2.3"));
		System.out.println(isNumeric("\u0967"));	
		System.out.println(isNumeric("-1"));

	}	
	public boolean isNumeric(CharSequence cs) {

		if(cs == null || cs.length() == 0)
			return false;

		for(int i = 0; i < cs.length(); i++) {

			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}

		return true;
	}
	

	@Test(enabled=false)
	public void convertNumberIntoDigit() {

		int num = 59654;
		int temp = num;
		int count = 0;

		//Get the total count in number
		while(num>0) {

			num = num/10;

			count++; //count=5
		} 


		while(temp>0) {

			int digit = 0;

			digit = temp % 10; //4 //Store into int array/ArrayList if required

			System.out.println("Digit at "+count+ " place is " +digit);
			count--;

			temp = temp/10; //5965

		}

	}
	


	@Test(enabled=false)
	public void swapWithoutTempVariable() {

		int x = 10;
		int y = 20;

		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

		//add both the numbers and assign it to first
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("Before Swapping");
		System.out.println("Value of x is :" + x);
		System.out.println("Value of y is :" + y);

	}

	
	
	
	


	@Test (enabled = false)
	public void checkLeapYear() {

		/*Source: https://docs.microsoft.com/en-US/office/troubleshoot/excel/determine-a-leap-year
		 * 
		 * To determine whether a year is a leap year, follow these steps:
			If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
			If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
			If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
			The year is a leap year (it has 366 days).
			The year is not a leap year (it has 365 days).
		 * 		 * 
		 */

		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Year:");
		year = scan.nextInt();
		scan.close();
		boolean isLeap = false;

		if(year % 4 == 0) {

			if(year % 100 == 0) {

				if(year % 400 == 0) {

					isLeap = true;

				} else {

					isLeap = false;

				}

			} else {

				isLeap = true;

			}

		} else {

			isLeap = false;

		}

		if(isLeap == true) {
			System.out.println(year+" is a leap year");
		} else {
			System.out.println(year+" is NOT a leap year");
		}
	}
}
