package base.oop3;
/*
 * When executing Java code, 
 * different errors can occur:
 * coding errors made by the programmer,
 * errors due to wrong input, 
 * or other unforeseeable things.
 * When an error occurs, 
 * Java will normally stop and generate an error message. 
 * The technical term for this is: 
 * Java will throw an exception (throw an error).
 */
public class Try_Catch_16 {

	//try and catch
	/*
	 * The try statement allows you to define a block of code to be tested for errors while it is being executed.
	 * The catch statement allows you to define a block of code to be executed,
	 * if an error occurs in the try block.
	 * The try and catch keywords come in pairs:
	 */
	
	
	
	public static void main(String[] args) 
	{
		
		try 
		{
			String [] Txt = {"H1","H2","H3","H4","H5","H6","H7","H8","H9"};
//			System.out.println(Txt[5]);
			System.out.println(Txt[10]);
			
		} 
		catch (Exception e) 
		{
//			e.printStackTrace();
			System.out.println("PLESE CHECK CONNECTION");
		}	
			
	}
	
	
	
	

}
