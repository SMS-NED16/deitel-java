// Exercise 11.19 - CatchOrder.java
// Demonstrates that preceeding subclass catch blocks with
// a superclass catch block is a compilation error
//package exercise_19;
//
//public class CatchOrder
//{
//	public static void main( String[] args )
//	{
//		// ExceptionB and ExceptionC are subclasses of ExceptionA
//		try 
//		{
//			throw new ExceptionB( "Exception B" );
//		}
//		catch( ExceptionA exception )
//		{
//			System.out.println( "Exception handled by A block" );
//		}
//		// causes an error - subclass block after superclass block
//		catch( ExceptionB exception )
//		{
//			System.out.println( "Exception handled by B block" );
//		}
//	}	// end method main
//}	// end class CatchOrder