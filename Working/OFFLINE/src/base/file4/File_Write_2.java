package base.file4;
import java.io.*;


public class File_Write_2 
{
	public static void main(String[] args) throws IOException
	{
		 File Path = new File("Test.txt");
		 FileOutputStream Fos = new FileOutputStream(Path, true);
		 System.out.println("File Created - "+Path.createNewFile());
		 System.out.println("Writing Some Thing ");
		 String Txt = "Hello\n";
		 char[] t1 =Txt.toCharArray();
		 for (int i = 0; i < t1.length; i++) 
		{
			 Fos.write(t1[i]);
			
		}
		 
		 Fos.close();
		 
		 
		 
		
	}

}
