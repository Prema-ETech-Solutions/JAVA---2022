package extra;

// Java program to validate the
// GST (Goods and Services Tax) number
// using regular expression.

import java.util.regex.*;

class GST_NUMBER {

	// Function to validate
	// GST (Goods and Services Tax) number.
	public static boolean isValidGSTNo(String str)
	{
		// Regex to check valid
		// GST (Goods and Services Tax) number
		String regex = "^[0-9]{2}[A-Z]{5}[0-9]{4}"
					+ "[A-Z]{1}[1-9A-Z]{1}"
					+ "Z[0-9A-Z]{1}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// return false
		if (str == null)
		{
			return false;
		}

		// Pattern class contains matcher()
		// method to find the matching
		// between the given string
		// and the regular expression.
		Matcher m = p.matcher(str);

		// Return if the string
		// matched the ReGex
		return m.matches();
	}

	// Driver Code.
	public static void main(String args[])
	{

		// Test Case 1:
		String str1 = "06BZAHM6385P6Z2";
		System.out.println(isValidGSTNo(str1));

		// Test Case 2:
		String str2 = "06BZAF67";
		System.out.println(isValidGSTNo(str2));

		// Test Case 3:
		String str3 = "AZBZAHM6385P6Z2";
		System.out.println(isValidGSTNo(str3));

		// Test Case 4:
		String str4 = "06BZ63AHM85P6Z2";
		System.out.println(isValidGSTNo(str4));

		// Test Case 5:
		String str5 = "06BZAHM6385P6F2";
		System.out.println(isValidGSTNo(str5));
	}
}
