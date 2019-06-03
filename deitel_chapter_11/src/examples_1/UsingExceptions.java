// Example 10.3 - UsingExceptions.java
// try...catch...finally exception handling mechanisms
package examples_1;

public class UsingExceptions
{
	public static void main( String[] args )
	{
		try
		{
			throwException();		// call method throw exception
		}	// end try block to throw an exception
		
		catch ( Exception exception )
		{
			System.err.println( "Exception handled in main." );
		}	// end catch block to handle exception
		
		doesNotThrowException();	// call method doesNotThrowException
	}	// end method main
	
	// demonstrate try...catch...finally
	public static void throwException() throws Exception
	{
		try		// throw an exception and immediately catch it
		{
			System.out.println( "Method throwException" );
			throw new Exception();		// generate exception
		}	// end try block to generate an exception
		
		catch( Exception exception )
		{
			System.err.println( "Exception handled in method throwException" );
			throw exception;			// rethrow for further processing
			
			// code here would not be reached; would cause compulation errors
		}	// end catch block to handle and rethrow exception
		
		finally		// executes regardless of what occurs in try...catch
		{
			System.err.println( "Finally executed in throwException" );
		}	// end finally clause
		
		// code here would not be reached; would cause compilation errors
	}	// end method throwException
	
	// demonstrate finally when no exception occurs
	public static void doesNotThrowException()
	{
		try		// try block does not throw an exception
		{
			System.out.println( "Method doesNotThrowException" );
		}	// end try block
		
		catch ( Exception exception )
		{
			System.err.println( exception );
		}	// end catch block to handle Exception
		
		finally 	// executes regardless of what occurs in try...catch
		{
			System.err.println( "Finally executed in doesNotThrowException" );
		}	// end finally block
		
		System.out.println( "End of method doesNotThrowException" );
	}	// end method doesNotThrowException
}	// end class UsingExceptions