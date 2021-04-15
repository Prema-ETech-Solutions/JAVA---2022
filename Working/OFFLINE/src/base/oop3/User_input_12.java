package base.oop3;
//The Scanner class is used to get user input, 
//and it is found in the java.util package.
/*
 * To use the Scanner class,
 * create an object of the class and use any of the available methods found in 
 * the Scanner class documentation.
 * In our example, we will use the nextLine() method,
 * which is used to read Strings:
 */
import java.util.Scanner;//Import the Scanner Class
public class User_input_12
{
	//MAKING A OBJECT OF SCANNER 
	public static Scanner Input = new Scanner(System.in); // Making the object of Scanner Static and Public
	public static void main(String[] args)
	{
		System.out.println("Enter Your Name -  ");
		String name = Input.nextLine();//Input value in name variable 
		System.out.println("Your Name Is - "+name);
		
	}

	/* 
	 * In the example above, we used the nextLine() method, which is used to read Strings.
	 * To read other types, look at the table below:
	 * Method	Description
	 * nextBoolean()	Reads a boolean value from the user
	 * nextByte()	Reads a byte value from the user
	 * nextDouble()	Reads a double value from the user
	 * nextFloat()	Reads a float value from the user
	 * nextInt()	Reads a int value from the user
	 * nextLine()	Reads a String value from the user
	 * nextLong()	Reads a long value from the user
	 * nextShort()	Reads a short value from the user
	 */
	
	
}
