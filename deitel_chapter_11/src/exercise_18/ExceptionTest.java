// Exercise 11.18 - ExceptionTest.java
// Demonstrates how both user-defined and Java API exceptions
// can be handled by an Exception superclass variable
package exercise_18;

import java.io.IOException;		// for generating an IOException object

public class ExceptionTest
{
	public static void main( String[] args )
	{
		// Generate Exception objects and store references in corresponding variables
		ExceptionA exceptionA = new ExceptionA( "Exception A " );
		ExceptionB exceptionB = new ExceptionB( "Exception B " );
		ExceptionC exceptionC = new ExceptionC( "Exception C " );
		NullPointerException nullPtrException = new 
				NullPointerException( "Null Pointer Exception" );
		IOException ioException = new IOException( "IO Exception" );
		
		// test each subclass object as an object of the superclass
		testException( exceptionA );
		testException( exceptionB );
		testException( exceptionC );
		testException( nullPtrException );
		testException( ioException );
	}	// end method main
	
	// method to polymorphically throw the Exception subclass reference
	// and then handle it with an Exception variable.
	public static void testException( Exception myException )
	{
		try 
		{
			throw myException;
		}
		catch ( Exception exception )
		{
			System.out.println( myException.getMessage() + " handled with Exception" );
		}	// end catch
	}	// end method testException
}	// end class ExceptionTest