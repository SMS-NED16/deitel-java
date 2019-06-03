// Exercise 11.20b - SomeClassTest.java
// Test class to demonstrate handling of constructor exceptions
package exercise_20;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SomeClassTest
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		boolean continueInput = true;
		SomeClass myObject = new SomeClass();
		do
		{
			try 
			{
				// input.nextInt() can throw InputMismatchException
				System.out.print( "Enter positive integer for x: " );
				int xInput = input.nextInt();
				
				System.out.print( "Enter positive integer for y: " );
				int yInput = input.nextInt();
				
				// constructor can throw InvalidArgumentException
				myObject = new SomeClass( xInput, yInput );
				
				// if no errors thrown at this point, then set flag to false
				continueInput = false;
			}	// end try block
			
			// attempt to catch non-int inputs
			catch ( InputMismatchException e )
			{
				System.out.println( e.getMessage() );
				System.out.println( "Integer inputs only. Try again." );
			}	// end catch block to handle non-Integer inputs
			
			// attempt to catch invalid integers
			catch( IllegalArgumentException e )
			{
				System.out.println( e.getMessage() );
			}	// end catch block to handle invalid integer inputs
			
			finally
			{
				System.out.println( "myObject is: " + myObject.toString() );
			}
		} while( continueInput );
	}	// end method 
}	// end class SomeClassTest