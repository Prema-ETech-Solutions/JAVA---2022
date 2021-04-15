package base.oop3;



/*
 *To access the interface methods, the interface must be "implemented" (like inherited) by another class
 *with the implements keyword (instead of extends). 
 *The body of the interface method is provided by the "implement" class: 
 */
public  class Interface_class1_11 implements Interface_11  
{

	public void Show() 
	{
		System.out.println("INTERFACE_class1_11");
	}

	public void Sum(double a, double b)
	{
		System.out.println("Sum of dot number = "+(a+b));	
	}	
	public void Sub(int a, int b)
	{
		System.out.println("Sum of interger number = "+(a+b));
	}
	
}
