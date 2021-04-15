package base.oop3;

public class Class_Methods_4 {
// Create a method in Class_Methods_4 named M1()
	static void M1()
	{
		System.out.println("This is a M1 Method");
	}
	
	//M1() prints a text (the action), 
	//when it is called. To call a method, 
	//write the method's name followed by two parentheses () and a semicolon;
	
	
	/*
	 * Static vs. Non-Static
	 * You will often see Java programs that have either static or public attributes and methods.
	 * In the example above, 
	 * we created a static method, 
	 * which means that it can be accessed without creating an object of the class, 
	 * unlike public, 
	 * which can only be accessed by objects:
	 */
	
	
	//Static method
	static void myStatic()
	{
		System.out.println("This is Static Method");
	}
	
	//Public method
	public void myPublic()
	{
		System.out.println("This is Non Static Method");
	}
	
	public static void main(String[] args) 
	{
		M1();
		
		//Calling myStatic()
		myStatic();
		// myPublicMethod(); This would compile an error so
		Class_Methods_4 myobj = new Class_Methods_4();
		myobj.myPublic();
		
		//Using Multiple Classes
		/*
		 * Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory:
		 * Class_Methods_4.java
		 * Second_4.java
		 * 
		 */
		Second_4.M1();//Static Method 
		Second_4 my_obj = new Second_4();
		my_obj.M2();//Non Static Method

		
	}
}
