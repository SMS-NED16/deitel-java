// Example 10.5 - ChainedExceptions.java
// Chained exceptions 
package examples_1;

public class ChainedExceptions
{
	public static void main( String[] args )
	{
		try
		{
			method1();		// call method1
		}	// end try
		// exceptions thrown from method1
		catch ( Exception exception )
		{
			exception.printStackTrace();
		}	// end catch
	}	// end method main
	
	// call method2, throw exceptions back to main
	public static void method1() throws Exception
	{
		try 
		{
			method2();		// call method2
		}	// end try
		catch( Exception exception )	// exception thrown from method 2
		{
			throw new Exception( "Exception thrown in method1", exception );
		}	// end catch
	}	// end method method1
	
	// call method3; throw exceptions back to method1
	public static void method2() throws Exception
	{
		try 
		{
			method3();		// call method3
		}	// end try
		catch( Exception exception )
		{
			throw new Exception( "Exception thrown in method2", exception );
		}	// end catch
	}	// end method method2
	
	// throw exception back to method2
	public static void method3() throws Exception
	{
		throw new Exception( "Exception thrown in method3" );
	}	// end method method3
}	// end class ChainedExceptions