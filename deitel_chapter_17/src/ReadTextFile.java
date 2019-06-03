// Example 17.2d - ReadTextFile.java
// This program reads a text file and displays each record
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.deitel.ch17.AccountRecord;

public class ReadTextFile
{
	private Scanner input;
	
	// enable user to open file
	public void openFile()
	{
		
		try 
		{
			File newFile = new File( "clients.txt" );
			input = new Scanner( newFile );
		}	// end try
		catch ( FileNotFoundException fileNotFoundException )
		{
			System.err.println( "Error opening file" );
			System.exit( 1 );
		}	// end catch
	}	// end method openFile
	
	
	// read record from file
	public void readRecords()
	{
		// object to be written to screen
		AccountRecord record = new AccountRecord();
		
		System.out.printf( "%-10s%-12s%-12s%10s\n", "Account", 
				"First Name", "Last Name", "Balance" );
		
		try 
		{
			while( input.hasNext() )
			{
				record.setAccount( input.nextInt() );
				record.setFirstName( input.next() );
				record.setLastName( input.next() );
				record.setBalance( input.nextDouble() );
				
				// display record contents
				System.out.printf( "%-10d%-12s%-12s%10.2f\n", 
						record.getAccount(), record.getFirstName(), 
						record.getLastName(), record.getBalance() );
			}	// end while loop
		}	// end try
		catch( NoSuchElementException elementException )
		{
			System.err.println( "File improperly formed." );
			input.close();
			System.exit( 1 );
		}	// end catch for NoSuchElementException
		catch( IllegalStateException stateException )
		{
			System.err.println( "Error reading from file." );
			System.exit( 1 );
		}	// end catch
	}	// end method readRecords
	
	// close file and terminate application
	public void closeFile()
	{
		if ( input != null )
			input.close();		// close file
	}	// end method closeFile
}	// end class ReadTextFile