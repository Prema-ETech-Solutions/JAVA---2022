package base.base1;

public class Math_6 {
//The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
	public static void main(String[] args) 
	{
		int a=10,b=20;
		System.out.println("MAX VALUE IN TWO NUMBER "+Math.max(a, b));
		System.out.println("MIN VALUE IN TWO NUMBER "+Math.min(a, b));
		System.out.println("SQUARE ROOT OF A NUMBER "+Math.sqrt(a));
		System.out.println("CONVERT A (-) VALUE IN (+) "+Math.abs(-200));
//		Math.random();
		System.out.println("RANDOM NUMBER "+Math.random()); // BETWEEN 0.0 to 1.0
		System.out.println("RANDOM NUMBER BETWEEN 1 TO 100 = "+((int)Math.random()*101));
		
		
		
	}

}
