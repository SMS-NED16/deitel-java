// Example 16.6 - SubString.java
// String class substring methods
package deitel_16_rpt;

public class SubString
{
	public static void main( String[] args )
	{
		String letters = "abcdefghijklmabcdefghijklm";
		
		// test substring methods
		System.out.printf( "Substring from index 20 to end is: \"%s\"\n", 
				letters.substring( 20 ) );
		System.out.printf( "Substring from index 3 up to but not including 6 is: \"%s\"\n",
				letters.substring( 3, 6 ) );
	}	// end method main
}	// end class SubString