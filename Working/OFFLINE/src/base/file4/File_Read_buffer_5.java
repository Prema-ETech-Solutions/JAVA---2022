package base.file4;
import java.io.*;
public class File_Read_buffer_5 
{
	public static void main(String[] args) throws IOException
	{
		int raw;
		BufferedReader Br = new BufferedReader(new FileReader("Test.txt"));
		while ((raw=Br.read())!=-1) 
		{
			System.out.print((char)raw);
			
		}
		Br.close();
		
		
		
		
	}

}
