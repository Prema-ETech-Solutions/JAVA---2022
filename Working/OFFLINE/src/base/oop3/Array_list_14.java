package base.oop3;

/*
 * The ArrayList class is a resizable array,
 * which can be found in the java.util package.
 * The difference between a built-in array and an ArrayList in Java, 
 * is that the size of an array cannot be modified (if you want to add or remove elements to/from an array,
 * you have to create a new one).
 * While elements can be added and removed from an ArrayList whenever you want. 
 * The syntax is also slightly different:
 */
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;// Import the Collections class
public class Array_list_14 {

	static ArrayList<String> Name = new ArrayList<String>();// Created object 
	public static void main(String[] args)
	{
		//ADDING SOME ELEMENTS 
		Name.add("N0");
		Name.add("N1");
		Name.add("N2");
		Name.add("N3");
		Name.add("N4");
		Name.add("N5");
		Name.add("N6");
		Name.add("N7");
		Name.add("N8");
		Name.add("N9");
		
		
		//Showing The Elements
		System.out.println("Showing The Elements\n"+Name);
		
		//Access an Element
		System.out.println("\nAccess 0th Element\n"+Name.get(0));
		 
		//Changing a Element
		System.out.println("\nBefore 5th Element\n"+Name.get(5));
		Name.set(5, "5N");
		System.out.println("\nAfter 5th Element\n"+Name.get(5));
		
		//Removing a Element
		System.out.println("\nBefore Removing The 5th Element\n"+Name.get(5));
		Name.remove(5);
		System.out.println("\nAccess To 5th Element "+Name.get(5));
		System.out.println("Showing All The Elements\n"+Name);
		
		//Size Of ArrayList
		System.out.println("\nSize Of ArrayList Name "+Name.size());
		
		//Printing ArrayList Using Loop
		System.out.println("\nPrinting ArrayList Using Loop\n");
		for (int i = 0; i < Name.size(); i++) 
		{
			System.out.println("Element Index "+i+" "+Name.get(i));
			
		}
		
		//Sort an Array List
		Collections.sort(Name);
		System.out.println("\nShowing After Sort "+Name);
		
	}

}
