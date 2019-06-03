// Example 11.3 - UsingExceptions.java
// try...catch...finally exception handling mechanism
package examples_2;

public class UsingExceptions
{
	public static void main( String[] args )
	{
		try 
		{
			throwException();		// call method throwException
		}	// end try
		catch( Exception exception )	// exception thrown by throwException
		{
			System.out.println( "Exception handled in main" );
		}	// end catch
		
		doesNotThrowException();
	}	// end method main
	
	
	// demonstrate try...catch...finally 
	public static void throwException() throws Exception
	{
		try
		{
			System.out.println( "Method throwException" );
			throw new Exception();		// generate Exception
		}	// end try block that generates Exception
		
		catch ( Exception exception )
		{
			System.out.println( "Exception handled in method throwException" );
			System.out.println( "Exception rethrown in catch of throwException" );
			throw exception;		// rethrow for further processing
		}	// end catch block to handle and rethrow Exception
		
		finally		// executes regardless of what occurs in try...catch
		{
			System.out.println( "Finally executed in throwException" );
		}	// end finally for throwException
	}	// end method throwsException
	
	// demonstrate finally when no exception occurs
	public static void doesNotThrowException()
	{
		try 	// try block that does not throw an exception
		{	
			System.out.println( "Method doesNotThrowException" );
		}	// end try block
		
		catch ( Exception exception )	// does not execute
		{
			System.out.println( exception );
		}	// end catch block to handle Exception
		
		finally		// executes regardless of what occurs in try...catch
		{
			System.out.println( "Finally executed in doesNotThrowException" );
		}	// end finally block for doesNotThrowException
	}	// end method doesNotThrowException
}	// end class UsingExceptions