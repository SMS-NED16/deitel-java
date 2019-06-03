// HourlyEmployee.java - extends class Employee
package payroll;

public class HourlyEmployee extends Employee
{
	private double wage;		// wage per hour
	private double hours;		// hours worked for the week
	
	// five-argument constructor
	public HourlyEmployee( String first, String last, String ssn, 
			double hourlyWage, double hoursWorked )
	{
		super( first, last, ssn );
		setWage( hourlyWage );			// validate hourly wage
		setHours( hoursWorked );			// validate hours worked 
	}	// end five-argument HourlyEmployee constructor
	
	// SETTERS
	public void setWage( double hourlyWage )
	{
		if ( hourlyWage >= 0.0 )
			wage = hourlyWage;
		else
			throw new IllegalArgumentException(
				"Hourly wage must be >= 0.0" );
	}	// end method setHourlyWage
	
	public void setHours( double hoursWorked )
	{
		if ( hoursWorked >= 0.0 && hoursWorked <= 168.0 )
			hours = hoursWorked;
		else 
			throw new IllegalArgumentException(
				"Hours worked must be between 0.0 and 168.0 inclusive" );
	}	// end method setHours
	
	// GETTERS
	public double getHours() { return hours; }
	public double getWage() { return wage; }
	
	// OTHER METHODS
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
	{
		if ( getHours() <= 40.0 )	// no overtime
			return getWage() * getHours();
		else
			return getWage() * 40 + getWage() * 1.5 * ( getHours() - 40 );
	}	// end method earnings
	
	// return String representation of HourlyEmployee object
	@Override
	public String toString()
	{
		return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(), 
				"hours worked", getHours() );
	}	// end method toString
}	// end class HourlyEmployee