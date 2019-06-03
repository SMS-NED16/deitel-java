// Deposit.java - Represents a deposit ATM transactions
package ATM;

public class Deposit extends Transaction
{
	// FIELDS
	private double amount;				// amount to deposit
	private Keypad keypad;				// reference to Keypad
	private DepositSlot depositSlot;	// reference to deposit slot
	
	// constant for cancel option
	private final static int CANCELLED = 0;
	
	// CONSTRUCTORS
	public Deposit( int userAccountNumber, Screen atmScreen,
			BankDatabase atmBankDatabase, Keypad atmKeypad, 
			DepositSlot atmDepositSlot )
	{
		// initialize superclass variables
		super( userAccountNumber, atmScreen, atmBankDatabase );
		
		// initialize references to keypad and deposit
		keypad = atmKeypad;
		depositSlot = atmDepositSlot;
	}	// end Deposit constructor
	
	// perform transaction
	@Override
	public void execute()
	{
		// Get references to bank database and screen for use in method
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		// Prompt for and store deposit amount from user
		amount = promptForDepositAmount();
		
		// Check whether the user entered a deposit amount or cancelled
		if ( amount != CANCELLED )
		{
			// request deposit envelope containing specified amount
			screen.displayMessage(
					"\nPlease insert a deposit envelope containing: " );
			screen.displayDollarAmount( amount );
			screen.displayMessageLine( "." );
			
			// receive deposit envelope
			boolean envelopeReceived = depositSlot.isEnvelopeReceived();
			
			// check whether deposit envelope was received
			if ( envelopeReceived )
			{
				screen.displayMessageLine( "\nYour envelope has been" +
			"received.\nNOTE: The money just deposited will not " + 
			"be available until we verify the amount of any " +
			"enclosed cash and your checks clear." );
				
				// credit account to reflect the deposit
				bankDatabase.credit( getAccountNumber(), amount );
			}	// end if block to handle envelope received
			
			// deposit envelope not received
			else
			{
				screen.displayMessageLine( "\nYou did not insert an " 
				+ "envelope, so the ATM has cancelled your transaction." );
			}	// end else block to handle no envelope
		}	// end if block to handle cash deposit
		
		// user cancelled instead of entering an amount
		else
		{
			screen.displayMessageLine( "Cancelling transaction..." );
		}	// end else block to handle user cancelling transaction
		
	}	// end method execute
	
	
	// prompt the user to enter a deposit amount in cents
	private double promptForDepositAmount()
	{
		// get a reference to the screen
		Screen screen = getScreen();
		
		// display the prompt
		screen.displayMessage( "\nPlease enter a deposit amount in" +
				" CENTS (or 0 cents to cancel): " );
		
		// receive input of deposit amount
		int input = keypad.getInput();
		
		// check whether the user canceled or entered a valid amount
		if ( input == CANCELLED )
			return CANCELLED;
		else
			return ( double ) input / 100;	// return dollar amount
	}	// end method promptForDepositAmount
}	// end class Deposit