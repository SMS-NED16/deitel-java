// Account.java - represents a bank account
package ATM;

public class Account
{
	// FIELDS
	private int accountNumber; 			// account number
	private int pin;					// PIN for authentication
	private double availableBalance;	// funds available for withdrawal
	private double totalBalance;		// funds available + pending deposits
	
	// Account constructor initializes attributes
	public Account( int theAccountNumber, int thePIN, 
			double theAvailableBalance, double theTotalBalance )
	{
		accountNumber = theAccountNumber;
		pin = thePIN;
		availableBalance = theAvailableBalance;
		totalBalance = theTotalBalance;
	}	// end Account constructor
	
	// determines whether a user-specified PIN matches PIN in Account
	public boolean validatePIN( int userPIN )
	{
		if ( userPIN == pin )
			return true;
		else
			return false;
	}	// end method validatePIN
	
	// returns available balance
	public double getAvailableBalance()
	{
		return availableBalance;
	}
	
	// returns totalBalance
	public double getTotalBalance()
	{
		return totalBalance;
	}
	
	// credits an amount to the account
	public void credit( double amount )
	{
		totalBalance += amount;
	}	// end method credit
	
	// debits an amount to the account
	public void debit( double amount )
	{
		availableBalance -= amount;		// subtract from available balance
		totalBalance -= amount;			// subtract from total balance
	}	// end method debit
	
	// returns account number
	public int getAccountNumber()
	{
		return accountNumber;
	}	// end method getAccountNumber	
}	// end class Account