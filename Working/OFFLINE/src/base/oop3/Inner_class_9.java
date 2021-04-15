package base.oop3;

public class Inner_class_9 {
//Inner Classes
	/*
	 *It is also possible to nest classes (a class within a class).
	 *The purpose of nested classes is to group classes that belong together, 
	 *which makes your code more readable and maintainable.  	
	 */

 	  class In_9 //inner class
	{
		int v1 = 100,v3 = 1000; // innner Attributes
		String V2 = "HELLO";
		public void one() // inner function
		{
			System.out.println("V1 + V3 = "+(v1+v3));
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		//Making_object 
		Inner_class_9 obj_Inner_class_9 = new Inner_class_9();
		//now making Object Of In_9
		Inner_class_9.In_9 obj_In_9 = obj_Inner_class_9.new In_9();
		// calling all Attributes
		System.out.println("Value Of v1 , v2 ,v3 = "+obj_In_9.v1+" "+obj_In_9.V2+" "+obj_In_9.v3);
		//calling function
		obj_In_9.one();
		
		
		
	}
}
