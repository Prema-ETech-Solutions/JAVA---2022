package base.base1;

public class Arrays_10 
{
	/*
	 * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
	 * To declare an array, define the variable type with square brackets:
	 */
	public static void main(String[] args) 
	{
		// **Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.**
		
		//We have now declared a variable that holds an array of strings. To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:
		String [] text= {"V0","V1","V2","V3","V4","V5","V6","V7","V8","V9","V10"};
		//To create an array of integers, you could write:
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		//You access an array element by referring to the index number.
		//This statement accesses the value of the first element in text:
		System.out.println("INDEX OF 0 = "+text[0]);
		System.out.println("INDEX OF 0 = "+num[0]);
		
		//Change an Array Element
		text[0] = "V00";
		System.out.println("INDEX OF 0 = "+text[0]);
		num[0] = 11;
		System.out.println("INDEX OF 0 = "+num[0]);
		
		//Array Length
		System.out.println("LENGTH OF STRING ARRAY = "+text.length);
		System.out.println("LENGTH OF INTERGER ARRAY = "+num.length);
		System.out.println("\n\n\n");
		
		// LOOP THROUGH AN ARRAY
		for(int i = 0 ;i<text.length;i++)
		{
			System.out.println("INDEX VALUE OF text "+i+" = "+text[i]);
		}
		System.out.println("\n\n\n\n");
		for (int i = 0;i<num.length;i++)
		{
			System.out.println("INDEX VALUE OF num "+i+" = "+num[i]);
			
		}
		System.out.println("\n\n\n");
		for(String i :text)
		{
			System.out.println("VALUE OF text "+i);
		}
		System.out.println("\n\n\n");
		for(int i :num)
		{
			System.out.println("VALUE OF num "+i);
		}

		  
		
		
	}

}
