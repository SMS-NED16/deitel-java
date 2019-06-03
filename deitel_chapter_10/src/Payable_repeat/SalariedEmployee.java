// Example 10.2b - SalariedEmployee.java
// SalariedEmployee concrete class extends abstract class Employee
package Payable_repeat;

public class SalariedEmployee extends Employee
{
	// FIELDS
	private double weeklySalary;
	
	// CONSTRUCTORS
	public SalariedEmployee( String first, String last, String ssn, 
			double salary )
	{
		super( first, last, ssn );
		setWeeklySalary( salary );
	}	
	
	// GETTERS
	public double getWeeklySalary() { return weeklySalary; }
	
	// SETTERS
	public void setWeeklySalary( double salary )
	{
		if ( salary >= 0.0 )
			weeklySalary = salary;
		else
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0" );
	}	
	
	// OTHER METHODS
	// returns a String representation of the SalariedEmployee object
	@Override
	public String toString() 
	{
		return String.format( "salaried employee: %s\n%s: $%,.2f", 
				super.toString(), "weekly salary", getWeeklySalary() );
	}	
	
	// calculate earnings;
	// implement interface Payable method that was abstract
	// in superclass Employee
	@Override
	public double getPaymentAmount() 
	{
		return getWeeklySalary();
	}
}	// end class SalariedEmployee