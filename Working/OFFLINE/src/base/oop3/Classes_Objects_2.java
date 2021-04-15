package base.oop3;
//Create a Class
//To create a class, use the keyword class:
public class Classes_Objects_2
{
	/*
	 * Everything in Java is associated with classes and objects, 
	 * along with its attributes and methods. 
	 * For example: in real life, a car is an object.
	 * The car has attributes, such as weight and color,
	 * and methods, such as drive and brake.
	 * A Class is like an object constructor,
	 * or a "blueprint" for creating objects.
	 */
	//Create a class named "Classes_Objects_2" with a variable x:
	int x = 10;
	public static void main(String[] args) 
	{
		//Create an object called "myObj" and print the value of x:
		//specify the class name, followed by the object name, and use the keyword new:
		Classes_Objects_2 myObj = new Classes_Objects_2();
		System.out.println("VALUE OF X = "+myObj.x);
		myObj.x = 12;
		
		//Multiple Objects
		//You can create multiple objects of one class:
		Classes_Objects_2 myObj2 = new Classes_Objects_2();
		System.out.println("myObj X = "+myObj.x);
		System.out.println("myObj2 X "+myObj2.x);
		
		/*
		 * 
		 * Using Multiple Classes
		 * You can also create an object of a class and access it in another class.
		 * This is often used for better organization of classes (one class has all the attributes and methods, 
		 * while the other class holds the main() method (code to be executed)).
		 * Remember that the name of the java file should match the class name. 
		 * In this example, we have created two files in the same directory/folder:
		 * ***Classes_Object_2.java
		 * ***Second.java
		 */
		Second_2 myobj_s = new Second_2();
		System.out.println("XYZ IN SECOND_2 CLASS = "+myobj_s.xyz);
		
		System.out.println(Second_2.abc);
		
				
		
	}

}
