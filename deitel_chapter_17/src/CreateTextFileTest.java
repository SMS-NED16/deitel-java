// Example 17.2c - CreateTextFileTest.java
// Testing the CreateTextFile class

public class CreateTextFileTest
{
	public static void main( String[] args )
	{
		CreateTextFile application = new CreateTextFile();
		
		application.openFile();
		application.addRecords();
		application.closeFile();
	}	// end method main
}	// end class CreateTextFileTest