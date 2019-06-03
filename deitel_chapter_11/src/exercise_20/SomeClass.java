// Exercise 11.20a - SomeClass.java
// A demo class that throws an exception in the constructor
// Implements a pair of two positive integers as coordinates
package exercise_20;

public class SomeClass
{
	// FIELDS
	private int x;		// x-coordinate
	private int y;		// y-coordinate
	
	// CONSTRUCTORS
	public SomeClass( int theX, int theY )
	{
		setX( theX );
		setY( theY );
	}	// end two-argument constructor
	
	public SomeClass()
	{
		setX( 0 );
		setY( 0 );
	}	// end no-argument constructor
	
	
	// GETTERS
	public int getX() { return x; }
	public int getY() { return y; }
	
	// SETTERS
	public void setX( int theX ) throws IllegalArgumentException
	{
		try
		{
			if ( theX >= 0 )
				x = theX;
			else
				throw new IllegalArgumentException(
						"x must be >= 0" );
		}	// end try block
		catch ( IllegalArgumentException e )
		{
			System.out.println( e.getMessage() );
		}	// end catch block to handle IllegalArgumentException
	}

	public void setY( int theY ) throws IllegalArgumentException
	{
		try
		{
			if ( theY >= 0 )
				y = theY;
			else
				throw new IllegalArgumentException( "y must be >= 0" );
		}	// end try block
		catch( IllegalArgumentException e )
		{
			System.out.println( e.getMessage() );
		}	// end catch block
	}	// end setY
	
	// OTHER METHODS
	@Override
	public String toString()
	{
		return String.format( "(%d, %d)", getX(), getY() );
	}	// end toString
}	// end class SomeClass