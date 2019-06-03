// Example 11.2 - DivideByZeroExceptionHandling.java
// Handling ArithmeticException and InputMismatchException
package examples_2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroExceptionHandling
{
	// demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient( int numerator, int denominator ) 
			throws ArithmeticException
	{
		return numerator / denominator;
	}	// end method quotient
	
	// method main begins Java application execution
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner( System.in );		// Scanner for input
		boolean continueLoop = true;		// determines if more input is needed
		
		do 
		{
			try		// read two numbers and calculate quotient
			{
				System.out.print( "Please enter an integer numerator: " );
				int numerator = scanner.nextInt();	
				
				System.out.print( "Please enter an integer denominator: " );
				int denominator = scanner.nextInt();
				
				int result = quotient( numerator, denominator );
				
				System.out.printf( "\nResult: %d / %d = %d\n", 
						numerator, denominator, result );
				continueLoop = false;		// input successful; end looping
			}	// end try block
			
			catch ( InputMismatchException inputMismatchException )
			{
				System.out.printf( "\nException: %s\n", inputMismatchException );
				scanner.nextLine();		// discard input so user can try again
				System.out.println( "You must enter integers. Please try again.\n" );
			}	// end catch block to handle InputMismatchException
			
			catch ( ArithmeticException arithmeticException )
			{
				System.out.printf( "\nException: %s\n", arithmeticException );
				System.out.println( "Zero is an invalid denominator. Please try again.\n" );
			}	// end catch block for ArithmetiException
		}	while ( continueLoop );		// end do...while
	}	// end method main
}	// end class DivideByZeroExceptionHandlings