// ATM.java - Represents an automated teller machine
package ATM;

public class ATM
{
	// ATTRIBUTES AND REFERENCES
	private boolean userAuthenticated;	// whether user is authenticated
	private int currentAccountNumber;	// current user's account number
	private Screen screen;				// ATM's screen
	private Keypad keypad;				// ATM's keypad
	private CashDispenser cashDispenser;// ATM's cash dispenser
	private DepositSlot	depositSlot;	// ATM's deposit slot
	private BankDatabase bankDatabase;	// account information database
	
	// constants corresponding to the main menu options
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	// no-argument ATM constructor initializes instance variables
	public ATM()
	{
			userAuthenticated = false;	// user is not authenticated to start
			currentAccountNumber = 0;	// no current account
			screen = new Screen();		// create and store reference to Screen object
			keypad = new Keypad();		// create and store reference to Keypad object
			cashDispenser = new CashDispenser();	// create and store reference to Keypad object
			depositSlot = new DepositSlot();	// create and store reference to DespositSlot object
			bankDatabase = new BankDatabase();	// create and store reference to BankDatabase object
	}	// end no-argument ATM constructor
	
	// start ATM
	public void run()
	{
		// welcome and authenticate user; perform transactions - infinite loop
		while ( true )
		{
			// loop while the user is not yet authenticated
			while ( !userAuthenticated )
			{
				screen.displayMessageLine( "\nWelcome!" );
				authenticateUser();		// get user acc number and pin, check against DB
			}	// end inner while loop to authenticate user
			
			// user is now authenticated
			performTransactions();		// balance, withdrawal, deposit
			userAuthenticated = false;	// reset before next ATM session
			currentAccountNumber = 0;	// reset before next ATM session
			screen.displayMessageLine( "\nThank you! Goodbye!" );
		}	// end outer while loop for services/transactions
	}	// end method run
	
	// attempts to authenticate the user against database
	private void authenticateUser()
	{
		screen.displayMessage( "\nPlease enter your account number: " );
		int accountNumber = keypad.getInput(); 		// input account number
		
		screen.displayMessage( "\nEnter your PIN: " );	// prompt for PIN
		int pin = keypad.getInput();		// input PIN
		
		// set userAuthenticated to boolean value returned by database
		userAuthenticated = 
				bankDatabase.authenticateUser( accountNumber, pin );
		
		// check whether authentication succeeded
		if ( userAuthenticated )
		{
			currentAccountNumber = accountNumber;	// save the user's account #
		}	// end if block to set user's account number
		else
			screen.displayMessageLine(
					"Invalid account number or PIN. Please try again." );
	}	// end method authenticateUser
	
	// display the main menu and perform transactions
	private void performTransactions()
	{	
		// local variable to store the transaction currently being processed
		Transaction currentTransaction = null;
		
		// assume user has not yet chosen to exit
		boolean userExited = false;	
		
		// loop while the user has not chosen option to exit system
		while ( !userExited )
		{
			// show main menu and get user selection
			int mainMenuSelection = displayMainMenu();
			
			// decide ow to proceed based on user's menu selection
			switch( mainMenuSelection )
			{
				// user chose to perform one of three transaction types
				case BALANCE_INQUIRY:
				case WITHDRAWAL:
				case DEPOSIT:
						
					// initialize as new object of the chosen type
					currentTransaction = createTransaction( mainMenuSelection );
					
					// execute the transaction
					currentTransaction.execute();
					break;
				
				// user chose to terminate session
				case EXIT:	
					screen.displayMessageLine( "\nExiting the system..." );
					userExited = true;		// this ATM session should end
					break;
				
				// user did not enter an integer from 1 - 4
				default:
					screen.displayMessageLine(
							"\nYou did not enter a valid selection. Try again." );
					break;
			}	// end switch statement to initiate transaction
		}	// end while loop to perform transaction requested by user
	}	// end method performTransactions
	
	// display the main menu and return an input selection
	private int displayMainMenu()
	{
		screen.displayMessageLine( "\nMain Menu:" );
		screen.displayMessageLine( "1 - View my balance" );
		screen.displayMessageLine( "2 - Withdraw cash" );
		screen.displayMessageLine( "3 - Deposit funds" );
		screen.displayMessageLine( "4 - Exit\n" );
		
		// this prompt will ask the user to enter input on the same line
		screen.displayMessage( "Enter a choice: ");
		return keypad.getInput();		// return user's selection
	}	// end method displayMainMenu
	
	// return an object of the specified Transaction subclass
	private Transaction createTransaction( int type )
	{
		Transaction temp = null;		// temporary Transaction variable
		
		// determine which type of Transaction to create
		switch( type )
		{
			case BALANCE_INQUIRY:		// create a new BalanceInquiry transaction
				temp = new BalanceInquiry(
						currentAccountNumber, screen, bankDatabase );
				break;
			case WITHDRAWAL: 			// create a new Withdrawal transaction
				temp = new Withdrawal( currentAccountNumber, screen, bankDatabase, 
						keypad, cashDispenser );
				break;
			case DEPOSIT:				// create a new Deposit transaction
				temp = new Deposit( currentAccountNumber, screen, 
						bankDatabase, keypad, depositSlot );
				break;
		}	// end switch statement to create Transaction subclass objects
		
		return temp;		// return the newly created Transaction subclass object
	}	// end method createTransaction
}	// end class ATM