// Example 11.4 - StackUnwinding.java
// Stack undwinding and obtaining data from an exception object
package examples_2;

public class StackUnwinding
{
	public static void main( String[] args )
	{
		// attempt stack unwinding by calling method1
		try
		{
			method1();		
		}	// end try block to invoke method1() (and 2 and 3, indirectly)
		catch ( Exception exception ) // catch exception thrown in method1
		{
			// Output the exception error message
			System.out.printf( "%s\n\n", exception.getMessage() );
			exception.printStackTrace();		// print exception stack trace
			
			// obtain the stack-trace information
			StackTraceElement[] traceElements = exception.getStackTrace();
			
			System.out.println( "\nStack trace from getStackTrace:" );
			System.out.println( "Class\t\t\t\tFile\t\t\tLine\tMethod" );
			
			// loop through traceElements to get exception description
			for ( StackTraceElement element : traceElements )
			{
				System.out.printf( "%s\t", element.getClassName() );
				System.out.printf( "%s\t", element.getFileName() );
				System.out.printf( "%s\t", element.getLineNumber() );
				System.out.printf( "%s\n", element.getMethodName() );
			}	// end for loop to process StackTraceElement array
		}	// end catch block to handle stack unwinding
	}	// end method main
	
	// call method2: throw exceptions back to main
	public static void method1() throws Exception
	{
		method2();	
	}	// end method method1
	
	// call method3; throw exceptions back to method1
	public static void method2() throws Exception
	{
		method3();	
	}	// end method method2
	
	// generate an Exception - throw it back to method2
	public static void method3() throws Exception
	{
		throw new Exception( "Exception thrown in method3" );
	}	// end method method3
}	// end class StackUnwinding