package base.oop3;
import java.util.LinkedList;// Import the LinkedList class


public class Link_list_15 {
	/*
	 * In the previous chapter, you learned about the ArrayList class.
	 * The LinkedList class is almost identical to the ArrayList:
	 */
	
	
	static LinkedList<String> Name = new LinkedList<String>();
	public static void main(String[] args) 
	{
		//Adding Elements 
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
		//Showing  All Elements 
		System.out.println(Name);
		/*
		 *
		 * 
		 * The LinkedList class is a collection which can contain many objects of the same type,
		 * just like the ArrayList.
		 * The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
		 * This means that you can add items, change items, 
		 * remove items and clear the list in the same way.
		 * However, while the ArrayList class and the LinkedList class can be used in the same way,
		 * they are built very differently.
		 * How the ArrayList works
		 * The ArrayList class has a regular array inside it.
		 * When an element is added, 
		 * it is placed into the array.
		 * If the array is not big enough,
		 * a new, larger array is created to replace the old one and the old one is removed.
		 * How the LinkedList works
		 * The LinkedList stores its items in "containers".
		 *  The list has a link to the first container and each container has a link to the next container in the list.
		 * To add an element to the list, 
		 * the element is placed into a new container and that container is linked to one of the other containers in the list.
		 * When To Use
		 * It is best to use an ArrayList when:
		 * You want to access random items frequently
		 * You only need to add or remove elements at the end of the list
		 * It is best to use a LinkedList when:
		 * You only use the list by looping through it instead of accessing random items
		 * You frequently need to add and remove items from the beginning or middle of the
		 * list
		 * 
		 */
		
		
		//Adds an item to the beginning of the list.
		System.out.println("\nBefore Adding\n");
		System.out.println(Name);
		Name.addFirst("N-1");
		System.out.println("\nAfter Adding\n");
		System.out.println(Name);
		
		
		
		
		//Adds an item to the end of the list.
		System.out.println("\nBefore Adding\n");
		System.out.println(Name);
		Name.addLast("N10");
		System.out.println("\nAfter Adding\n");
		System.out.println(Name);
		
		
		//Remove an item to the beginning of the list.
		System.out.println("\nBefore Remove\n");
		System.out.println(Name);
		Name.removeFirst();
		System.out.println("\nAfter Remove\n");
		System.out.println(Name);
		
		
		//Remove an item to the end of the list.
		System.out.println("\nBefore Remove\n");
		System.out.println(Name);
		Name.removeLast();
		System.out.println("\nAfter Adding\n");
		System.out.println(Name);
		
		
		/*
		 * For many cases,
		 * the ArrayList is more efficient as it is common to need access to random items in the list,
		 * but the LinkedList provides several methods to do certain operations more efficiently:
		 * Method	                Description	
		 * addFirst()	            Adds an item to the beginning of the list.	
		 * addLast()	            Add an item to the end of the list	
		 * removeFirst()	        Remove an item from the beginning of the list.	
		 * removeLast()	            Remove an item from the end of the list	
		 * getFirst()	            Get the item at the beginning of the list	
		 * getLast()	            Get the item at the end of the list 
		 */

	}
}
