package base.oop3;


/*
 * Java does not have a built-in Date class, 
 * but we can import the java.time package to work with the date and time API. 
 * The package includes many date and time classes. 
 * For example:
 * 
 * Class	Description
 * LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
 * LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
 * LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
 * DateTimeFormatter	Formatter for displaying and parsing date-time objects
 */

//import the java.time.LocalDate class, and use its now() method:
//import the java.time.LocalTime class, and use its now() method:
//import the java.time.LocalDateTime class, and use its now() method:
//You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. The following example will remove both the "T" and nanoseconds from the date-time:




import java.time.*; //importing all the time and date classes
import java.time.format.*;//importing all the DateTimeFormatter classes
public class Date_Time_Format_13 {

	public static void main(String[] args) 
	{
		//To display the current date
		LocalDate localdate = LocalDate.now();//Create date object
		System.out.println("DATE - "+localdate); //showing todays date
		
		//To display the current time (hour, minute, second, and nanoseconds)
		LocalTime localtime = LocalTime.now();
		System.out.println("\n\nTime - "+localtime);
		
		//To display the current date and time
		LocalDateTime Date_time = LocalDateTime.now();
		System.out.println("\n\nDATE AND TIME - "+Date_time);
		
		//The "T" in the example above is used to separate the date from the time.
		System.out.println("\n\nBefore Formatting - "+Date_time);
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String Formated_date = Date_time.format(Format);
		System.out.println("\n\nAfter formating - "+Formated_date);
		
		/*
		 *The ofPattern() method accepts all sorts of values, if you want to display the date and time in a different format. For example:
		 *Value	                    Example	
		 *yyyy-MM-dd	            "1988-09-29"	
		 *dd/MM/yyyy	            "29/09/1988"	
		 *dd-MMM-yyyy	            "29-Sep-1988"	
		 *E, MMM dd yyyy	        "Thu, Sep 29 1988"
		 */
		

	}

}
