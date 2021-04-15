package base.base1;

public class String_5 {
//A String variable contains a collection of characters surrounded by double quotes:
	
	public static void main(String[] args) 
	{
		//Create a variable of type String and assign it a value:
		String Txt="HeLlO";
		//NOW STRING HAVE SOME FUNCTION INBUILD
		System.out.println(Txt);
		System.out.println("LENGTH OF Txt VARIABLE :"+Txt.length());
		System.out.println("UPPER CASE: "+Txt.toUpperCase());
		System.out.println("LOWER CASE: "+Txt.toLowerCase());
		System.out.println("FIND A INDEX OF WORD/LETTER "+Txt.indexOf("l"));
		System.out.println("CONCATENATION OF STRING "+Txt+"World");
		System.out.println("CONCATENATION OF STRING USING STRING "+Txt.concat(" World"));
		System.out.println("---------------------------------------------------");
		System.out.println("Special Characters");
		System.out.println("The solution to avoid this problem, is to use the backslash escape character."
		+"The backslash (\\) escape character turns special characters into string characters:");
		/*
		 * 
		 * Escape character	Result	Description
		 * \'	'	Single quote
		 * \"	"	Double quote
		 * \\	\	Backslash
		 * 
		 */
		System.out.println("ADDING STRING AND ADDING INTERGER ");
		String a="10",b="10";
		int x=10,y=10;
		System.out.println("ADDING STRING a+b = "+a+b);
		System.out.println("ADDING INTERGER x+y = "+(x+y));
		
		
		

	}

}
