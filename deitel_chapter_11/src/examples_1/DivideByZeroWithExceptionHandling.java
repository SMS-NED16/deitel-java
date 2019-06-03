// Example 11.2 - DivideByZeroWithExceptionHandling.java
// Handling ArithmeticExceptions and InputMismathExceptions
package examples_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling
{
	// demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient( int numerator, int denominator ) 
			throws ArithmeticException
	{
		return numerator / denominator;		// possible division by zero
	}	// end method quotient
	
	// method main begins execution of Java application
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );		// scanner for input
		boolean continueLoop = true;		// determines if more input is needed
		
		do
		{
			try		// read two numbers and calculate quotient
			{
				System.out.print( "Please enter an integer numerator: " );
				int numerator = input.nextInt();
				
				System.out.print( "Please enter an integer denominator: " );
				int denominator = input.nextInt();
				
				int result = quotient( numerator, denominator );
				
				System.out.printf( "\nResult: %d / %d = %d\n", numerator, 
						denominator, result );
				continueLoop = false;		// input successful, end looping
			}		// end try block
			
			catch ( InputMismatchException inputMismatchException )
			{
				System.err.printf( "\nException: %s\n", inputMismatchException );
				input.nextLine(); 			// discard input so user can try again
				System.out.println( "You must enter integers. Please try again.\n" );
			}		// end catch block for nonIntegerInput error
			
			catch ( ArithmeticException arithmeticException )
			{
				System.err.printf( "\nException: %s\n", arithmeticException );
				System.out.println( "Zero is an invalid denominator. Please try again.\n" );
			}		// end catch block for DivideByZero error
		} while ( continueLoop );	// do...while
	}	// end method main
}	// end class DivideByZeroWithExceptionHandling