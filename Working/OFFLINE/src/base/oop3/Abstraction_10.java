package base.oop3;
//Abstract Classes and Methods
public class Abstraction_10 extends Second_10 {

	
	/*
	 * Data abstraction is the process of hiding certain details and showing only essential information to the user.
	 * Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
	 * The abstract keyword is a non-access modifier, used for classes and methods:
	 * Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
	 * Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
	 */
	//refer Second_10.java
	public void sum()
	{
		int v1 = 10000, v2 =200000;
		System.out.println("Sum OF A And B "+obj.value_(v1,v2));
		
	}
	//object 
	static Abstraction_10 obj = new Abstraction_10();
	
	public static void main(String[] args)
	{
	
		obj.sum();
		
	}

}
