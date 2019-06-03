// Exercise 16.1 - ComparingStrings.java
// Asks user to enter two strings and performs lexicographical comparison
package exercises_16;

import java.util.Scanner;

public class ComparingStrings
{
	public static void main( String[] args )
	{
		// Create Scanner object to read data from keyboard
		Scanner scanner = new Scanner( System.in );
		
		// Ask user to enter two strings
		System.out.print( "Enter first string: " );
		String firstString = scanner.nextLine();
		
		System.out.print( "Enter second string: " );
		String secondString = scanner.nextLine();
		
		// Close Scanner
		scanner.close();
		
		// Perform lexicographical comparison of both using compareTo method
		System.out.printf( "firstString.compareTo( secondString ) = %d\n",
				firstString.compareTo (secondString ) );
		System.out.printf( "secondString.compareTo( firstString ) = %d\n", 
				secondString.compareTo( firstString ) );
		
		System.out.println ("END OF PROGRAMME" );
		
		
	}	// end method main
}	// end class ComparingStrings