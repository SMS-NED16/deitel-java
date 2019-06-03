// Example 11.5 - ChainedExceptions.java
// A program to show that exception stack trace contains information
// about all exceptions that have occurred until the point of being handled
package examples_2;

public class ChainedExceptions
{
	
	// demonstrate chaining exceptions
	public static void main( String[] args )
	{
		try
		{
			method1();
		}	// end try block
		catch( Exception exception )
		{
			exception.printStackTrace();;	
		}	// end catch block to handle Exception thrown in method1
	}	// end method main
	
	// call method2; throw exceptions back to main
	public static void method1() throws Exception
	{
		try
		{
			method2();		// call method2
		}	// end try block
		catch( Exception exception )
		{
			// two-argument Exception constructor appends method2 exception
			// to a String description
			throw new Exception( "Exception thrown in method1", exception );
		}	// end catch block to handle error from method2
	}	// end method method1;
	
	// call method3; throw exceptions back to method1
	public static void method2() throws Exception
	{
		try
		{
			method3();		// call method3;
		}	// end try block
		catch( Exception exception )
		{
			throw new Exception( "Exception thrown in method2", exception );
		}	// end catch block for handling method3's exception
	}	// end method method2
	
	
	// throw a new Exception back to method2
	public static void method3() throws Exception
	{
		throw new Exception( "Exception thrown in method3" );
	}	// end method method3
}	// end class ChainedExceptions