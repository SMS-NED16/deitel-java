// Example 10.2c - HourlyEmployee.java
// HourlyEmployee class extends Employee
package Payroll_repeat;

public class HourlyEmployee extends Employee
{
	// FIELDS
	private double hours;		// hours worked per week
	private double wage;		// wage per hour
	
	// CONSTRUCTORS
	public HourlyEmployee( String first, String last, String ssn, 
			double hoursWorked, double hourlyWage )
	{
		super( first, last, ssn );
		setHours( hoursWorked );
		setWage(  hourlyWage );
	}
	
	// GETTERS
	public double getHours() { return hours; }
	public double getWage() { return wage; }
	
	// SETTERS
	public void setHours( double hoursWorked )
	{
		if ( hoursWorked >= 0.0 && hoursWorked <= 168.0 )
			hours = hoursWorked;
		else
			throw new IllegalArgumentException(
					"Hours worked must be between 0.0 and 168.0 inclusive" );
	}
	
	public void setWage( double hourlyWage )
	{
		if ( hourlyWage >= 0.0 )
			wage = hourlyWage;
		else
			throw new IllegalArgumentException( 
					"Hourly wage must be >= 0.0" );
	}
	
	// OTHER METHODS
	// return a String representation of the HourlyEmployee object
	@Override
	public String toString() 
	{
		return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "hourly wage", getWage(), 
				"hours worked", getHours() );
	}
	
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
	{
		if ( getHours() <= 40 )
			return getWage() * getHours();
		else
			return ( getWage() * 40 ) + ( getWage() * ( 40 - getHours() ) ) ;
	}
}	