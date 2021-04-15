package extra;
import java.io.*;
public class Buffer {

	//static InputStreamReader ISR = new InputStreamReader(System.in);
	static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	// taking input using buffer reader
	public static void main(String[] args)
	{
		try
		{
			System.out.println("ENTER YOUR NAME - ");
			String name = BR.readLine();
			System.out.println("ENTER YOUR NUMBER - ");
			int number = Integer.parseInt(BR.readLine());
			
			System.out.println("NAME - "+name);
			System.out.println("NUMBER - "+number);
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
	}

}
