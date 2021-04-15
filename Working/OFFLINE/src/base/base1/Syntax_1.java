/*
 * Basis Syntax Of JAVA ?
 * >>
 * 
 * Every line of code that runs in Java must be inside a class. In our example, we named the class Syntax. A class should always start with an upper case first letter.
 * Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.
 * The name of the java file must match the class name. When saving the file, save it using the class name and add ".java" to the end of the filename.
 * 
 */


// This is a Single Line Comment "//"
/*
 * This is a Block Comment
 * Its Start's from "/*" 
 * And end's with "*" And "/"
 * */
package base.base1;//This is package name
/*
 * 'How to write a Package name ?'
 * >> Write package name in small letters. And Start the name with a letter  
 * In this package there is a class name Syntax
 *  
 */


public class Syntax_1 //This is a class
{//Body of the class Start

	
	public static void main(String[] args) // This is a main Function
	{//Body of the main function  Start

		/*
		 * Any code inside the main() method will be executed. You don't have to understand the keywords before and after main. You will get to know them bit by bit while reading this tutorial.
		 * For now, just remember that every Java program has a class name which must match the filename, and that every program must contain the main() method. 
		 */
		
		//System.out.println() is a function to show message on console screen
		System.out.println("Hello World");//Double quotes is use for denoting Sting

	}//End Body of Main function 

}//End Body of class


