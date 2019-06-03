// Example 10.2e - BasePlusCommissionEmployee.java
package Payroll_repeat;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	// FIELDS
	private double baseSalary;		// base salary per week
	
	// CONSTRUCTORS
	public BasePlusCommissionEmployee( String first, String last, String ssn, 
			double sales, double rate, double salary )
	{
		super( first, last, ssn, sales, rate );
		setBaseSalary( salary );
	}
	
	// GETTERS
	public double getBaseSalary() { return baseSalary; }
	
	// SETTERS
	public void setBaseSalary( double salary )
	{
		if ( salary >= 0.0 )
			baseSalary = salary;
		else
			throw new IllegalArgumentException( 
					"Base salary must be >= 0.0" );
	}
	
	// OTHER METHODS
	// return a String representation of the BasePlusCommissionEmployee object
	@Override
	public String toString()
	{
		return String.format( "%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary() );
	}
	
	// calculate earnings; override method earnings in CommissionEmployee
	@Override
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}
	
}