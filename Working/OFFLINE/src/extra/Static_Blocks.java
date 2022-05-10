package extra;

//Class 1
	// Helper class
	class Test {

		// Case 1: Static variable
		static int i;
		// Case 2: non-static variables
		int j;

		// Case 3: Static block
		// Start of static block
		static
		{
			i = 10;
			System.out.println("static block called ");
		}
		// End of static block
	}
public class Static_Blocks {

//	In simpler language whenever we use a static keyword and associate it to a block then that block is referred to as a static block. 
//	Unlike C++, Java supports a special block, called a static block (also called static clause) that can be used for static initialization of a class. 
//	This code inside the static block is executed only once: the first time the class is loaded into memory. 
	// Java Program to Illustrate How Static block is Called

	

	// Class 2
	// Main class
	public static void main(String args[])
	{

		// Although we don't have an object of Test, static
		// block is called because i is being accessed in
		// following statement.
		System.out.println(Test.i);
	}

}
