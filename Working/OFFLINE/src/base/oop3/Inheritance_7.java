package base.oop3;
//Inheritance (Subclass and Superclass)

/*
 * In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
 * subclass (child) - the class that inherits from another class
 * superclass (parent) - the class being inherited from
 * To inherit from a class, use the extends keyword.
 */
//now refer Second_7.java class
public class Inheritance_7 extends Second_7 {
	
	public static void main(String[] args)
	{
		System.out.println("VALUE OF A IS = "+a);
		a = 11000;
		System.out.println("VALUE OF A IS = "+a);
		sum();

	}

}
