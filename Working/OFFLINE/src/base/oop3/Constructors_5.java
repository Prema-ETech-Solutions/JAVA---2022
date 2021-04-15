package base.oop3;
 
public class Constructors_5 {

	int x;
	//A constructor in Java is a special method that is used to initialize objects. 
	//The constructor is called when an object of a class is created. 
	//It can be used to set initial values for object attributes:
	
	
	//Create Constructor
	public Constructors_5()
	{
		x=10;// Set the initial value for the class attribute x
	}
	public Constructors_5(int a)
	{
		x=a;
	}
	public static void main(String[] args) 
	{
		Constructors_5 myobj = new Constructors_5();
		System.out.println("VALUE OF X = "+myobj.x);
		
		
		
		
		
		
		
		
		Constructors_5 myobj1 = new Constructors_5(50);
		System.out.println("VALUE OF X = "+myobj1.x);
	}

}
