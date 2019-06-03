// BalanceInquiry.java - Represents a balance inquiry ATM transaction
package ATM;

public class BalanceInquiry extends Transaction
{
	// BalanceInquiry constructor
	public BalanceInquiry( int userAccountNumber, Screen atmScreen, 
			BankDatabase atmBankDatabase )
	{
		super( userAccountNumber, atmScreen, atmBankDatabase );
	}	// end BalanceInquiry constructor
	
	// performs the transaction
	@Override
	public void execute() 
	{
		// get reference to the bank database and screen
		BankDatabase bankDatabase = getBankDatabase();	// inherited getter/field
		Screen screen = getScreen();		// inherited getter/field
		
		// get the available balance of the account involved
		double availableBalance =
				bankDatabase.getAvailableBalance( getAccountNumber() );
		
		// get the total balance for the account involved
		double totalBalance = 
				bankDatabase.getTotalBalance( getAccountNumber() );	
		
		// display the balance information on the screen
		screen.displayMessageLine( "\nBalance Information:" );
		screen.displayMessage( " - Available Balance: " );
		screen.displayDollarAmount( availableBalance );
		screen.displayMessage( "\n - Total Balance: " );
		screen.displayDollarAmount( totalBalance );
		screen.displayMessageLine( "" );	// blank line to separate from subsequent output
	}	// end method execute
}	// end class BalanceInquiry