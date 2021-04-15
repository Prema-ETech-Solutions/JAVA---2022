package base.file4;
import java.io.*;
public class File_Read_3 
{
	public static void main(String[] args) throws IOException
	{
		File path = new File("Test.txt");
		FileInputStream Fim = new FileInputStream(path);
		int raw;
		do {
			raw = Fim.read();
			if (raw!=-1) 
			{
				System.out.print((char)raw);
				
			}
			
		} while (raw!=-1);
		Fim.close();
		
	}

}
