package base.base1;

public class Loops_8 {
//Loops can execute a block of code as long as a specified condition is reached.
/*
 * "FOR"
 * for (statement 1; statement 2; statement 3) {
 *  code block to be executed
 *  }
 * -----------------------------------------------------------
 * for(initial value;condition;increment/decrement)
 * {
 * Body of for loop
 * } 
 * ----------------------------------------------------------
 * "While Loop"
 * while (condition)
 * {
 * // code block to be executed
 * }
 * --------------------------------------------------------------
 * "DO/WHILE LOOP"
 * do
 * {
 * }while(condition);
 */
	
	public static void main(String[] args)
	{
		int b=1;
		for (int a = 10;b<=a;b++)
		{
			System.out.println("VALUE OF B = "+b);
		}
		while(b<=20)
		{
			System.out.println("WHILE VALUE OF B = "+b);
			b++;
		}
		do
		{
			System.out.println(b);
			b++;
		}
		while(b<=30);
		

	}

}
