package base.methods2;

public class Methods_1 {
	
	/*
	 * Methods Syntax
	 * KEYWORD   RETURN TYPE  Method Name  Round Bracket For Parameters 
	 * static    void         myMethods    ()
	 * { Body START
	 * 
	 * 	 
	 * }Body END
	 */
	
	
	
	
/*
 * A method is a block of code which only runs when it is called.
 * You can pass data, known as parameters, into a method.
 * Methods are used to perform certain actions, and they are also known as functions.
 * Why use methods? To reuse code: define the code once, and use it many times.
 */
	
	/*
	 * A method must be declared within a class.
	 * It is defined with the name of the method,followed by parentheses ().
	 * Java provides some pre-defined methods, such as System.out.println(), 
	 * but you can also create your own methods to perform certain actions:
	 */
	static void myMethod()
	{
		/*
		 * myMethod() is the name of the method
		 * static means that the method belongs to the Main class and not an object of the Main class. 
		 * You will learn more about objects and how to access methods through objects later in this tutorial.
		 * void means that this method does not have a return value.
		 * You will learn more about return values later in this chapter
		 */
		System.out.println("THIS IS myMethod");
		
		
	}
	/*
	 * To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
	 * In the following example, myMethod() is used to print a text (the action), when it is called:
	 */
	public static void main(String[] args) 
	{
		//Inside main, call the myMethod() method:
		myMethod();
		//A method can also be called multiple times:
		myMethod();
		myMethod();
		myMethod();

	}

}
