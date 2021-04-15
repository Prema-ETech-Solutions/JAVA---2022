package base.methods2;

public class Method_Oveloading_3 
{
//With method overloading, multiple methods can have the same name with different parameters:
	
	static int Plus(int v1,int v2)
	{
		return v1+v2;
	}
	static double Plus(double v1 ,double v2) 
	{
		return v1+v2;
	}
	static String Plus(String v1,String v2)
	{
		return v1+v2;
	}
	
	public static void main(String[] args)
	{
		String Txt =Plus("HELLO","WORLD");
		int num =Plus(10,20);
		Double dot =Plus(10.0,20.0);
		
		System.out.println("STRING VALUE - "+Txt);
		System.out.println("NUMBER VALUE - "+num);
		System.out.println("DOUBLE VALUE - "+dot);
		
		//Instead of defining two methods that should do the same thing, it is better to overload one.
		
		
	}
	
}
