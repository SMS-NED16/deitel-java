// Exercise 11.17 - ExceptionsWithSuperclasses.java
// Demonstrates that superclass exception variable can be used
// to catch subclass Exception objects too.
package exercise_17;

public class ExceptionsWithSuperclasses
{
	public static void main( String[] args )
	{
		testExceptionA();
		testExceptionB();
		testExceptionC();
	}	// end method main
	
	public static void testExceptionA()
	{
		// catching an ExceptionA reference with an ExceptionA variable
		try 
		{
			throw new ExceptionA();
		}
		catch( ExceptionA exception )
		{
			System.out.println( "ExceptionA reference handled with ExceptionA variable" );
		}	// end catch block to handle ExceptionA reference
	}
	
	public static void testExceptionB()
	{
		// catching an ExceptionA reference with an ExceptionA variable
		try 
		{
			throw new ExceptionB();
		}
		catch( ExceptionA exception )
		{
			System.out.println( "ExceptionB reference handled with ExceptionA variable" );
		}	// end catch block to handle ExceptionB reference
	}
	
	public static void testExceptionC()
	{
		// catching an ExceptionA reference with an ExceptionA variable
		try 
		{
			throw new ExceptionC();
		}
		catch( ExceptionA exception )
		{
			System.out.println( "ExceptionC reference handled with ExceptionA variable" );
		}	// end catch block to handle ExceptionC reference
	}
}	// end class ExceptionsWithSuperclasses