//Example 11.6 - AssertTest.java
//Checking with assert that a value is within range
package examples_2;

import java.util.Scanner;

public class AssertTest
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter a number between 0 and 10: " );
		int number = input.nextInt();
		
		// assert that the value is >= 0 and <= 10
		// will only throw an AssertException if javac file 
		// executed with command javac -ea (Enable assert flag)
		assert ( number >= 0 && number <= 10 ) : "bad number: " + number;
		
		System.out.printf( "You entered %d\n", number );
	}	// end method main
}	// end class AssertTest