package base.methods2;

public class Method_Parameters_2 {
	int a ;
	
	/*
	 * Information can be passed to methods as parameter.
	 * Parameters act as variables inside the method.
	 * Parameters are specified after the method name,
	 * inside the parentheses.You can add as many parameters as you want,
	 * just separate them with a comma.
	 * -------------------------------------------------------------------------------------
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	// now  int a is single parameter 
	static void Mymethod(int a) 
	{
		System.out.println("VALUE OF PARAMETER a = "+a);
		
	}
	// in the case we can use as many parameters as you like:
	static void Mymethod_1(int a ,String b, Double c)
	{
		System.out.println("INTERGER VALUE A IS - "+a);
		System.out.println("String VALUE B IS - "+b);
		System.out.println("DOUBLE VALUE C IS - "+c);
	}
	//Return Values
	/*
	 * 
	 * The void keyword, used in the examples above, indicates that the method should not return a value. 
	 * If you want the method to return a value, 
	 * you can use a primitive data type (such as int, char, etc.) instead of void, 
	 * and use the return keyword inside the method:
	 * 
	 */
	//now we will make two methods, 
	//First method with return type
	//and second with parameter and return type
	 
	static int First()
	{
		int v1=10,v2=20;
		return v1+v2;
	}
	static int Second (int v1,int v2)
	{
		return v1+v2;
	}
	
	
	  // Create a checkAge() method with an integer variable called age
	  static void checkAge(int age) 
	  {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    // If age is greater than, or equal to, 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

	  }
	
	
	public static void main(String[] args) 
	{
		Mymethod(10);
		Mymethod_1(10,"HELLO", 1000.232);
		Mymethod_1(200, "WORLD", 20000.2552);
		@SuppressWarnings("unused")
		int result1=First();
		@SuppressWarnings("unused")
		int result2=Second(155,20);
		System.out.println("RETURN VALUE OF FIRST FUNCTION  - "+First());
		System.out.println("RETURN VALUE OF SECOND FUNCTION - "+Second(100,30));
		int age1 = 10,age2=20;
		checkAge(age1);
		checkAge(age2);
	}

}
