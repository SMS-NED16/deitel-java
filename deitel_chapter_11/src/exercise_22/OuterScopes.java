// Exercise 11.22 - OuterScopes.java
// Demonstrates that outer scopes can catch exceptions generated
// in inner scopes - stack unwinding? 
package exercise_22;

public class OuterScopes
{
	public static void main( String[] args )
	{
		// outer try...catch block to handle NullPointerException
		// from inner scope
		try
		{
			throwNullPtrException();
		}	// end try block
		
		// outer catch block can handle NullPtrException from inner scope
		catch ( NullPointerException e )
		{
			System.out.println( e.getMessage() );
			System.out.println( "NullPtrException handled in outer scope." );
		}	// end catch block to handle NullPointerException
	}	// end method main
	
	// method that throws a NullPointerException
	public static void throwNullPtrException() 
			throws NullPointerException
	{
		// try block throws a NullPtrException that will not be caught
		// by the InvalidArgumentException catch block in this scope
		try 
		{
			throw new NullPointerException( "NullPtrExc from nested method." );
		}	// end try block
		
		// catch block can only handle IllegalArgumentException 
		// No matching catch block for NullPointerException in this scope
		catch ( IllegalArgumentException e )
		{
			System.out.println( e.getMessage() );
		}	// end catch block
	}	// end method throwNullPtrException

}	// end method main