package base.oop3;

public class Attributes_3 {
//In the previous chapter, we used the term "variable" for x in the example (as shown below).
//It is actually an attribute of the class. 
//Or you could say that class attributes are variables within a class:
	//Create a class called "Attribute_3" with two attributes: x and y:
	int x=10,y;
	final int a = 2000;
	
	public static void main(String[] args) 
	{
		/*
		 * Accessing Attributes
		 * You can access attributes by creating an object of the class,
		 * and by using the dot syntax (.):
		 * The following example will create an object of the Attributes_3 class,
		 * with the name myObj. 
		 * We use the x attribute on the object to print its value:
		 */
		//Create an object called "myObj" and print the value of x:
		Attributes_3 myObj = new Attributes_3();
		System.out.println("VALUE OF X = "+myObj.x);
		System.out.println("------------------------------------------------\n\n");
		//Modify Attributes
		myObj.y = 300;
		System.out.println("VALUE OF Y = "+myObj.y);
		//Or override existing values:
		System.out.println("-------------------------------------------------\n\n");
		myObj.x = 1300; // x is now 1300
		System.out.println("VALUE OF X IS NOW OVERRIDED EXISTING VALUSES = "+myObj.x);
		System.out.println("-------------------------------------------------\n\n");
		//If you don't want the ability to override existing values, declare the attribute as final:
		//In the case you override existing value of final variable 
		//An error will be generated
		//eg. myObj.a =5000; //error : Cannot assign a value to a final variable
		//----------------------------------------------------------------------------------------------------------
		//Multiple Object
		/*
		 * If you create multiple objects of one class, 
		 * you can change the attribute values in one object, 
		 * without affecting the attribute values in the other:
		 */
		Attributes_3 myObj1 = new Attributes_3();
		System.out.println("VALUE OF myObj.x  = "+myObj.x);
		System.out.println("VALUE OF myObj1.x ="+myObj1.x);
		System.out.println(myObj.a);
//		myObj.a = 100;


				
				

		
	}

}
