// Exercise 16.2 - ComparingStringPortions.java
// Asks user to enter two strings and uses regionMatches
// to compare specified sections of both strings
package exercises_16;

import java.util.Scanner;

public class ComparingStringPortions
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter first string: " );
		String firstStr = input.nextLine();
		
		System.out.print( "Enter second string: " );
		String secondStr = input.nextLine();
		
		System.out.print( "Enter starting index for first string: " );
		int firstStartIndex = input.nextInt();
		
		System.out.print( "Enter starting index for second string: " );
		int secondStartIndex = input.nextInt();
		
		System.out.print( "Enter number of characters to compare: " );
		int charsToCompare = input.nextInt();
		
		try
		{
			if ( firstStr.regionMatches( true, firstStartIndex,
					secondStr, secondStartIndex, charsToCompare ) )
				System.out.printf( "%d characters of %s starting at index %d"
						+ " matches %s\n", charsToCompare, firstStr, firstStartIndex, secondStr );
			else 
				System.out.println( "The specified regions in the strings do not match." );
		}
		catch ( StringIndexOutOfBoundsException e )
		{
			System.out.println( e );
			System.out.println( "Please enter valid indices." );
		}	// end catch block for StringIndexOutOfBoundsException
		
		System.out.println( "\nEND OF PROGRAM" );
	}	// end method main
}	// end class ComparingStringPortions