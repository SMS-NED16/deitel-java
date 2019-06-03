// Exercise 11.17a - ExceptionA.java
// Exception superclass
package exercise_17;

public class ExceptionA extends Throwable
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