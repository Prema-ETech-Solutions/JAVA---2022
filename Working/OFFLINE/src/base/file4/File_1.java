package base.file4;
import java.io.*;//Importing all classes of io pkg
public class File_1 
{
	public static void main(String[] args) throws IOException
	{
		File file_ = new File("Test.txt"); // making object of File class 
		File Mk = new File("C:\\Test"); //making object of File class
		
		System.out.println("Folder Created");
	    System.out.println(Mk.mkdir());	  // creating a folder in C drive  
		
		System.out.println("\nFile Created");
	    System.out.println(file_.createNewFile());	 //creating a file
		
		System.out.println("\nFile Can Write");
		System.out.println(file_.canWrite());	// checking writing permission 
		
		System.out.println("\nFile Can Read");
		System.out.println(file_.canRead());	 // checking read permission
		
		System.out.println("\nFile Is Existed Or Not");
		System.out.println(file_.exists());	 // Existed Or Not
		
		System.out.println("\nFile Name");
		System.out.println(file_.getName());	 // checking file name
		
		System.out.println("\nFile Length");
		System.out.println(file_.length());	 // checking length
		
//		System.out.println("\nFile Deleted");
//		System.out.println(file_.delete());
		
		System.out.println("\nReturns the absolute path name of the file");
		System.out.println(file_.getAbsolutePath()); //absolute path 
		
		
		
		
		
	}
}
