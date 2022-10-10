package lambdaexpression_java8Feature;

/*//Traditional Approach where we are implementing interface and overriding abstract method then creating
//object of the class and calling method using obj reference
public class Programs_LambdaExpression_Series1 implements GreetMessage {

	public static void main(String[] args) {		
		Programs_LambdaExpression_Series1 obj = new Programs_LambdaExpression_Series1();
		obj.greet();			
	}

	@Override
	public void greet() {		
		System.out.println("Welcome Anand!!!");		
	}
}*/

//Lambda Expression Approach
public class Programs_LambdaExpression_Series1 {

	public static void main(String[] args) {		

		//Anonymous Function Approach - This is also a traditional approach where we define abstract method Anonymously
		/*GreetMessage greetmessage = new GreetMessage() {			
			@Override
			public void greet() {
				System.out.println("Welcome Anand!!!");				
			}
		}; 

		greetmessage.greet();*/


		//Lambda Expression Approach - Here lambda expression will represent Anonymous function and through which
		//we will convert abstract method of functional interface into Anonymous function using lambda expression
		
	 /*Note - while writing lambda expression, we need to remove below
		1 - new Interface name
		2 - NAME of the method, public and void
		3 - keep only (parameter). Note- if there are any parameters then remove type of it. 
			Ex- (int a, int b) =>remove int and we can write (a,b)
		4 - Add -> operator between (parameter) and {body}
		5 - If only one statement in body then remove curly bracket. If we need to write business logic which spans 
		in multiple line then must use curly bracket
		6 - If we are returning any value and if we can write statement in single line than we can remove return
		as well 

		Parameter in abstract method can have no parameter or can have one/multiple parameter*/

		
		//Example1:
		GreetMessage greetmessage = () -> System.out.println("Welcome Anand!!!");
		greetmessage.greet();

		
		
		
		//Example2: void sum(int a, int b);
		/*Calculator calculator = (a, b) -> {
			int sum = a+b;
			System.out.println("sum of "+a+" and " +b+" = "+sum);
		};

		calculator.sum(10, 20); */

		
		
		
		//Example3: int sum(int a, int b); - This has return type as int
		
		//Method1 - if business logic is in multiple line
		/*Calculator sum = (a, b) -> {
			int sum = a+b;
			return sum;
		}; */

		//Method2 - if we have single line 
		//Calculator sum = (a, b) -> {return a+b;};
		
		//Method3 - if we have single line with return statement than we can remove return word
		Calculator sum = (a, b) -> a+b;
		
		int sumOfTwoNumbers = sum.operation(10, 20); 
		System.out.println("Sum: "+sumOfTwoNumbers);


		Calculator sub = (a, b) -> a-b;
		
		int subtractionOfTwoNumbers = sub.operation(10, 20); 
		System.out.println("Sum: "+subtractionOfTwoNumbers);
		
		
		
		
		//Syntax: (parameter) -> {body}; Note - if only one statement than curly bracket is not required

	}	
}