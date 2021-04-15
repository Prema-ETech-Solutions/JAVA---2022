package base.base1;

public class Variables_Data_Types_2 {

	public static void main(String[] args) 
	{
		
		 /*
		  * 
		  * (int ,float,char,boolean,String) 
		  * this all are data types 
		  * and 
		  * (number- is the variable of int data type,
		  * dot- is the variable of float data type,
		  * letter- is the variable of char data type,
		  * mybool- is the variable of boolean data type,
		  * text- is the variable of String data type)   
		  * 
		  * now 
		  * int variable will hold whole number eg. 1
		  * float variable will hold decimal number eg 1.00
		  * char variable will hold one letter eg. 'A' 
		  * boolean variable will hold true or false
		  * String variable will hold sentence "Hello"
		  * 
		  * 
		  * 
		  * In Java, there are different types of variables, for example:
		  * String - stores text, such as "Hello". String values are surrounded by double quotes
		  * int - stores integers (whole numbers), without decimals, such as 123 or -123
		  * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		  * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		  * boolean - stores values with two states: true or false
		  * 
		  * 
		  * Java Identifiers
		  * All Java variables must be identified with unique names.
		  * These unique names are called identifiers.
		  * The general rules for constructing names for variables (unique identifiers) are:
		  * Names can contain letters, digits, underscores, and dollar signs
		  * Names must begin with a letter
		  * Names should start with a lowercase letter and it cannot contain whitespace
		  * Names can also begin with $ and _ (but we will not use it in this tutorial)
		  * Names are case sensitive ("myVar" and "myvar" are different variables)
		  * Reserved words (like Java keywords, such as int or boolean) cannot be used as names
		  * 
		  */
		// now 
		
		
		int number = 10;
		float dot  = 10.22f;
		char letter= 'A';
		boolean mybool = true;
		String text = "Hello World";
		String abc;
		
		// now how to show the value on console
		System.out.println(number);
		System.out.println("This is value of number variable "+ number);
		System.out.println(dot);
		System.out.println("This is value of dot variable "+dot );
		System.out.println(letter);
		System.out.println("This is value of letter variable "+letter);
		System.out.println(mybool);
		System.out.println("This is value of bool variable "+mybool);
		System.out.println(text);
		abc="1010";
		System.out.println("This is value of text variable "+text);
		   System.out.println(abc);                                             
	
	
	}

}
