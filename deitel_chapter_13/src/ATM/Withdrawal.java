// Withdrawal.java - Represents a withdrawal ATM transaction
package ATM;

public class Withdrawal extends Transaction
{
	// FIELDS
	private int amount;		// amount to withdraw
	private Keypad keypad;	// reference to keypad
	private CashDispenser cashDispenser;	// reference to cash dispenser
	
	// constant corresponding to menu option to cancel
	private final static int CANCELLED = 6;
	
	// Withdrawal constructor
	public Withdrawal( int userAccountNumber, Screen atmScreen, 
			BankDatabase atmBankDatabase, Keypad atmKeypad, 
			CashDispenser atmCashDispenser )
	{
		// initialize superclass variables
		super( userAccountNumber, atmScreen, atmBankDatabase );
		
		// initialize references to keypad and cash dispenser
		keypad = atmKeypad;
		cashDispenser = atmCashDispenser;
	}	// end Withdrawal constructor
	
	// perform transaction
	@Override
	public void execute()
	{
		boolean cashDispensed = false;		// cash was not dispensed yet
		double availableBalance;			// amount available for withdrawal
		
		// get references to the bank database and screen (both inherited)
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		// loop until cash is dispensed or user cancels
		do
		{
			// obtain a chosen withdrawal amount from the user
			amount = displayMenuOfAmounts();
			
			// check whether user chose a withdrawal amount or cancelled
			if ( amount != CANCELLED )
			{
				// get available balance of account involved
				availableBalance = 
						bankDatabase.getAvailableBalance( getAccountNumber() );
				
				// check whether the user has enough money in the account
				if ( amount <= availableBalance )
				{
					// check whether the cash dispenser has enough money
					if ( cashDispenser.isSufficientCashAvaialble( amount ) )
					{
						// update the account involved to reflect the withdrawal
						bankDatabase.debit( getAccountNumber(), amount );
						
						cashDispenser.dispenseCash( amount );	// dispense cash
						cashDispensed = true;		// cash was dispensed
						
						// instruct user to take cash
						screen.displayMessageLine( "\nYour cash has been" +
								" dispensed. Please take your cash now." );
					}	// end if block to check if cash dispenser has funds
					
					// if cash dispenser does not have enough funds
					else
						screen.displayMessageLine(
								"Insufficient cash available in the ATM."
								+ "\n\nPlease choose a smaller amount." );
				}	// end if block to check if user has sufficient funds
				
				// if the user does not have enough money in their account
				else
				{
					screen.displayMessageLine(
							"\nInsufficient funds in your account." + 
							"\n\nPlease choose a smaller amount." );
				}	// end else block to handle insufficient funds in user account
			}	// end if block to handle withdrawal selection
			
			// the user chose to cancel the transaction
			else
			{
				screen.displayMessageLine( "\nCancelling transaction..." );
				return;		// return to the main menu because user cancelled
			}	// end else block to handle user cancelling transactions
		}	while ( !cashDispensed );
	}	// end method execute
	
	
	// display a menu of withdrawal amounts and the option to cancel
	// return the chosen amount or 0 if the user chooses to cancel
	private int displayMenuOfAmounts()
	{
		int userChoice = 0;		// local variable to store the return value
		
		Screen screen = getScreen();	// get a reference to the screen
		
		// array of amounts to correspond to men numbers
		int[] amounts = { 0, 20, 40, 60, 100, 120 };
		
		// loop while no valid choice has been made
		while ( userChoice == 0 )
		{
			// display the withdrawal menu
			screen.displayMessageLine( "\nWithdrawal Menu:" );
			screen.displayMessageLine( "1 - $20" );
			screen.displayMessageLine( "2 - $40" );
		    screen.displayMessageLine( "3 - $60" );
		    screen.displayMessageLine( "4 - $100" );
		    screen.displayMessageLine( "5 - $200" );
		    screen.displayMessageLine( "6 - Cancel transaction" );
		    screen.displayMessage( "\nChoose a withdrawal amount: " );
		    
		    int input = keypad.getInput();		// get the user input through keypad
		    
		    // determine how to proceed based on the input value
		    switch ( input )
		    {
		    	// user chose to withdraw a valid preset amount
			    case 1:
			    case 2: 
			    case 3:
			    case 4:
			    case 5:
			    	userChoice = amounts[ input ];	// save the user's choice
			    	break;
			    	
			    // user chose to cancel input
			    case CANCELLED:	
			    	userChoice = CANCELLED;			// save the user's choice
			    	break;
			   
			    // the user did not enter a value from 1 - 6
			    default:
			    	screen.displayMessageLine(
			    			"\nInvalid selection. Try again." );
		    }	// end switch statement to choose between withdrawal options
		}	// end while loop to get input for withdrawal amount
		
		return userChoice;	// return withdrawal amount or 
	}	// end method displayMenuOfAmounts
}	// end class Withdrawal