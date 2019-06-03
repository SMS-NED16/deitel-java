// Exercise 11.21 - RethrowingExceptions.java
// Demonstrates rethrown exceptions and stack traces
package exercise_21;

public class RethrowingExceptions
{
	public static void main( String[] args )
	{
		try
		{
			someMethod1();	// invokes a chain of Exceptions
		}	// end try block
		catch ( Exception e )
		{
			System.out.println( "Exception from someMethod1 handled in main." );
			e.printStackTrace();
		}	// end catch to handle chain of exceptions
	}	// end method main
	
	
	// throws Exception back to main
	public static void someMethod1() throws Exception
	{
		try
		{
			// call someMethod2() to invoke Exception
			someMethod2();
		}	// end try block
		catch( Exception e )
		{
			// catch the Exception thrown in 2, rethrow it
			System.out.println( "Exception thrown in 2 handled in 1." );
			throw e;
		}	// end catch block for someMethod1()
		finally
		{
			System.out.println( "Exception from someMethod2 rethrown in someMethod1." );
		}
	}
	
	// throws Exception to method1
	public static void someMethod2() throws Exception
	{
		try 
		{
			throw new Exception( "Exception thrown in someMethod2" );
		}	// end try block
		finally
		{
			System.out.println( "No catch block in someMethod2. "
					+ "Must be processed by someMethod1." );
		}	// end finally block for someMethod2
	}
}	// end class RethrowingExceptions