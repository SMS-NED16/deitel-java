// CashDispenser.java - Represents the cash dispenser of the ATM
package ATM;

public class CashDispenser
{
	// the default initial number of bills in the cash dispenser
	private final static int INITIAL_COUNT = 500;
	
	// field to keep track of the number of bills in the cash dispenser
	private int count;		
	
	// no-argument CashDispenser constructor initializes count to default
	public CashDispenser()
	{
		count = INITIAL_COUNT;		// set the count attribute to INITIAL_COUNT
	}	// end no-argument CashDispenser
	
	// simulates dispensing of specified amount of cash
	public void dispenseCash( int amount )
	{
		int billsRequired = amount / 20;	// number of $20 bills required
		count -= billsRequired;				// update the count of bills
	}	// end method dispenseCash
	
	// indicates whether cash dispenser can dispense desired amount
	public boolean isSufficientCashAvaialble( int amount )
	{
		int billsRequired = amount / 20;	// number of $20 bills required
		
		if ( count >= billsRequired )
			return true;			// enough bills are available
		else
			return false;			// not enough bills available
	}	// end mehtod isSufficientCashAvailable
}	// end class CashDispensers