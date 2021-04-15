package base.oop3;

public class Interface_class2_11 implements Interface_11
{

	@Override
	public void Show() 
	{
		System.out.println("Showing Interface_class2_11");		
	}

	@Override
	public void Sum(double a, double b)
	{
		//Double
		System.out.println("VALUE OF A is = "+a);
		System.out.println("CLAUE OF B is = "+b);
		
	}

	@Override
	public void Sub(int a, int b) 
	{
		//int
		System.out.println("VALUE OF A is = "+a);
		System.out.println("CLAUE OF B is = "+b);
		
	}

}
