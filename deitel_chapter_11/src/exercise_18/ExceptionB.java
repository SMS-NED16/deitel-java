// Exercise 11.18b - ExceptionB.java
// Exception subclass that extends ExceptionA
package exercise_18;

public class ExceptionB extends ExceptionA
{
	public ExceptionB()
	{
		super( "ExceptionC exception generated" );
	}	// end no-argument ExceptionB constructor
	
	public ExceptionB( String message )
	{
		super( message );
	}	// end message-argument ExceptionB construcotr
}	// end class ExceptionB