package base.file4;
import java.io.*;
public class File_Write_buffer_4 
{
	public static void main(String[] args) throws IOException 
	{
		
		BufferedWriter Bw = new BufferedWriter(new FileWriter("Test.txt",true));
		//Bw.write("Hello");
		Bw.append("Hello\n");
		System.out.println("File Has Been Writen");
		Bw.close();
		
		
	}
}
