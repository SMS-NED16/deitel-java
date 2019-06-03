// Example 11.4 - MoreExceptions.java
// Stack unwinding and obtaining data from an exception object
package examples_1;

public class MoreExceptions
{
	public static void main( String[] args )
	{
		try
		{
			method1();		// call method1
		}	// end try
		catch( Exception exception )	// carry exception thrown in method1
		{
			System.err.printf( "%s\n\n", exception.getMessage() );
			exception.printStackTrace();	// print exception stack trace
			
			// obtain the stack-trace information
			StackTraceElement[] traceElements = exception.getStackTrace();
			
			System.out.println(  "\nStack trace from getStackTrace" );
			System.out.println( "Class\t\tFile\t\t\tLine\tMethod" );
			
			// loop through traceElements to get exception description
			for ( StackTraceElement element : traceElements )
			{
				System.out.printf( "%s\t", element.getClassName() );
				System.out.printf( "%s\t", element.getFileName() );
				System.out.printf( "%s\t", element.getLineNumber() );
				System.out.printf( "%s\n", element.getMethodName() );
			}	// end for loop to process StackTraceElement
		}	// end catch block
	}	// end method main
	
	// call method2; throws exception back to main
	public static void method1() throws Exception
	{
		method2();
	}	// end method1
	
	// call method3; throw exceptions back to method1
	public static void method2() throws Exception
	{
		method3();
	}	// end method2
	
	// throws Exception back to method2
	public static void method3() throws Exception
	{
		throw new Exception( "Exception thrown in method3" );
	}	// end method3
}	// end class UsingExceptions