 package base.oop3;

public class Polymorphism_8 {
/*
 * 
 * Polymorphism means "many forms", 
 * and it occurs when we have many classes that are related to each other by inheritance.
 * Like we specified in the previous chapter; 
 * Inheritance lets us inherit attributes and methods from another class. 
 * Polymorphism uses those methods to perform different tasks. 
 * This allows us to perform a single action in different ways.
 */
	//Refer Second_8.java,Third_8.java,Forth_8.java
	
	
	
	
	
	public static void main(String[] args) 	
	{
		
		Second_8 obj_second_8 = new Second_8();
		Second_8 obj_Third_8 = new Third_8();
//		Second_8 obj_Forth_8 = new Forth_8();
//		
		System.out.println("Calling SECOND_8 obj");
		obj_second_8.one();
		System.out.println("Calling Third_8 obj");
		obj_Third_8.one();
//		System.out.println("Calling Forth_8 obj");
//		obj_Forth_8.one();
		
		
	}

}
