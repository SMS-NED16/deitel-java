// Example 11.1 - DivideByZeroNoExceptionHandling.java
// Integer division without exception handling
package examples_1;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling
{
	// demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient( int numerator, int denominator )
	{
		return numerator / denominator;	// possible division by zero
	}	// end method quotient
	
	// begins execution of Java application
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );		// Scanner for input
		
		System.out.print( "Please enter an integer numerator: " );
		int numerator = input.nextInt();
		
		System.out.print( "Please enter an integer denominator: " );
		int denominator = input.nextInt();
		
		int result = quotient( numerator, denominator );
		
		System.out.printf( "\nResult: %d / %d = %d\n",
				numerator, denominator, result );
	}	// end method main
}	// end class DivideByZeroNoExceptionHandling