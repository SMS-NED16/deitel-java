// Exercise 11.18a - ExceptionA.java
// Exception superclass
package exercise_18;

public class ExceptionA extends Exception
{
	// default ExceptionA constructor
	public ExceptionA()
	{
		super( "ExceptionA exception generated" );
	}	// end no-argument ExceptionA constructor
	
	// ExceptionA constructor that prints a custom message
	public ExceptionA( String message )
	{
		super( message );
	}	// end ExceptionA message constructor
}	// end class ExceptionA