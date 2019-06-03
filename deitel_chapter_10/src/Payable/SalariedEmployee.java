// Example 10.2c - SalariedEmployee.java
// SalariedEmployee class extends Employee, which implements Payable
package Payable;

public class SalariedEmployee extends Employee
{
	// FIELDS
	private double weeklySalary; 	
	
	// four-argument constructor
	public SalariedEmployee( String first, String last, String ssn, 
			double salary )
	{
		super( first, last, ssn );	// pass to Employee constructor
		setWeeklySalary( salary );	// validate and store salary
	}	// end four-argument SalariedEmployee constructor
	
	// SETTERS
	public void setWeeklySalary( double salary )
	{
		if ( salary >= 0.0 )
			weeklySalary = salary;
		else
			throw new IllegalArgumentException( "Weekly salary must be >= 0.0" );
	}	// end method setWeeklySalary
	
	// GETTERS
	public double getWeeklySalary() { return weeklySalary; }
	
	// OTHER METHODS
	// return String representation of SalariedEmployee object
	@Override
	public String toString()
	{
		return String.format( "salaried employee: %s\n%s: $%,.2f", 
				super.toString(), "weekly salary", getWeeklySalary() );
	}	// end method toString
	
	// calculate earnings; implement interface Payable method that was
	// abstract in superclass Employee
	@Override
	public double getPaymentAmount()
	{
		return getWeeklySalary();
	}	// end method getPaymentAmount
}	// end class SalariedEmployee