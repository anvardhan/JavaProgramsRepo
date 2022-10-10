package lambdaexpression_java8Feature;

public class LambdaExpression_Basics {

	/*Lambda expressions are introduced in Java 8

	Lambda expression facilitates functional programming, and simplifies the development a lot.
	This is the expression through which we can represent an Anonymous (No Name) function.
	Using lambda expression we can convert abstract method of functional interface to Anonymous function.
	Advantage - Reduce the code length.
	Lambda expressions are used primarily to define inline implementation of a functional interface, 
	i.e., an interface with a single method only.
	Lambda expression eliminates the need of anonymous class and gives a very simple yet powerful 
	functional programming capability to Java.

	Functional Interface: Interface which contain only one abstract method but can have multiple 
	default and static methods. 
	Below are existing functional interface that contains one abstract method
	Runnable - run()
	Callable - call()
	Comparable - compareTo()
	Comparator - compare()

	Similarly We can create our own functional interface as well 

	Functional Interface should be annotated by @FunctionalInterface (Not mandatory)

	For Functional Interface, the method which is abstract for that only we can write lambda expression

	Traditional Approach:Implements interface and override abstract method and provide logical body.
	New Approach - We do not need to implement interface, we can define abstract method as per below syntax 
	using Anonymous function in the main code which is lambda expression.
	Syntax for lambda expression:
		parameter expression body
			()		->		{body with lambda syntax};
			Syntax: if only one statement than curly bracket is not required

	Note - while writing lambda expression, we need to remove below
	1 - new Interface name
	2 - NAME of the method, public and void
	3 - keep only (parameter). Note- if there are any parameters then remove type of it. 
		Ex- (int a, int b) =>remove int and we can write (a,b)
	4 - Add -> operator between (parameter) and {body}
	5 - If only one statement in body then remove curly bracket. If we need to write business logic which spans 
	in multiple line then must use curly bracket
	6 - If we are returning any value and if we can write statement in single line than we can remove return
		as well 

	Parameter in abstract method can have no parameter or can have one/multiple parameter


	Method Reference:
	Method Reference help to point to methods by their names. A method reference is described using :: symbol.
	A method reference can be used to point to following type of methods.
	Static methods
	Instance methods
	Constructor using new operator (TreeSet::new)
	Ex - names.forEach(System.out :: println)


	 */






}
