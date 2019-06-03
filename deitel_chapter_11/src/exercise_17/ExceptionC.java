// Exercise 11.17c - ExceptionC.java
// Exception subclass that extends ExceptionB and indirectly
// inherits from ExceptionA
package exercise_17;

public class ExceptionC extends ExceptionB
{
	public ExceptionC()
	{
		super( "ExceptionC exception generated" );
	}	// end no-argument ExceptionC constructor
	
	public ExceptionC( String message )
	{
		super( message );
	}	// end message-argument ExceptionC constructor
}	// end class ExceptionC