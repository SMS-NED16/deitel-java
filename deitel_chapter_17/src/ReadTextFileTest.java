// Example 17.2e - ReadTextFileTest.java
// Testing the ReadTextFile class

public class ReadTextFileTest
{
	public static void main( String[] args )
	{
		ReadTextFile application = new ReadTextFile();
		
		application.openFile();
		application.readRecords();
		application.closeFile();
	}	// end method main
}	// end class ReadTextFileTest