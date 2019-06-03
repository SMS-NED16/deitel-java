// Example 11.1 - DivideByZero.java
// Integer division without exception handling
package examples_2;

import java.util.Scanner;

public class DivideByZero
{
	// demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient( int numerator, int denominator )
	{
		return numerator / denominator;	// possible division by zero
	}	// end method quotient
	
	// begins Java application execution
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner( System.in );		// scanner for input
		
		System.out.print( "Please enter an integer numerator: " );
		int numerator = scanner.nextInt();
		
		System.out.print( "Please enter an integer denominator: " );
		int denominator = scanner.nextInt();
		
		int result = quotient( numerator, denominator );
		System.out.printf( "\nResult: %d / %d = %d\n", 
				numerator, denominator, result );
	}	// end method main
}	// end class DivideByZero