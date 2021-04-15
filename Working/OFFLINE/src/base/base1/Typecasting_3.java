package base.base1;

public class Typecasting_3 {

	public static void main(String[] args) {
		/*
		 * Type casting is when you assign a value of one primitive data type to another type.
		 * In Java, there are two types of casting:
		 * Widening Casting (automatically) 
		 * - converting a smaller type to a larger type size
		 * byte -> short -> char -> int -> long -> float -> double
		 * 
		 * ------------------------------------------------------------------------------------------------
		 * Narrowing Casting (manually) 
		 * - converting a larger type to a smaller size type
		 * double -> float -> long -> int -> char -> short -> byte
		 * 
		 * 
		 */
		//Widening Casting
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println("INT "+myInt);      // Outputs 9
	    System.out.println("INT TO DOUBLE "+myDouble);   // Outputs 9.00000
	    
	    //Narrowing Casting
	    double x = 9.78;
	    int y = (int) x; // Manual casting: double to int

	    System.out.println("DOUBLE "+x);   // Outputs 9.78
	    System.out.println("DOUBLE TO INT "+y);      // Outputs 9
	}

}
