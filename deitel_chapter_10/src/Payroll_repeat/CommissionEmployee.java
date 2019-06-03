// Example 10.2d - CommissionEmployee.java
// CommissionEmployee class extends Employee
package Payroll_repeat;

public class CommissionEmployee extends Employee
{
	// FIELDS
	private double grossSales;		// gross weekly sales
	private double commissionRate;	// commission percentage
	
	// CONSTRUCTORS
	public CommissionEmployee( String first, String last, String ssn,
			double sales, double rate )
	{
		super( first, last, ssn );
		setGrossSales( sales );
		setCommissionRate( rate );
	}
	
	// GETTERS
	public double getGrossSales() { return grossSales; }
	public double getCommissionRate() { return commissionRate; }
	
	// SETTERS
	public void setGrossSales( double sales )
	{
		if ( sales >= 0.0 )
			grossSales = sales;
		else
			throw new IllegalArgumentException( 
					"Gross sales must be >= 0.0" ); 
	}
	
	public void setCommissionRate( double rate )
	{
		if ( rate > 0.0 && rate < 1.0 )
			commissionRate = rate;
		else throw new IllegalArgumentException(
				"Commission rate must be between 0.0 and 1.0 exclusive" );
	}
	
	// OTHER METHODS
	// return a String representation of the CommissionEmployee object
	@Override
	public String toString()
	{
		return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f", 
				"commission employee", super.toString(), 
				"gross sales", getGrossSales(), 
				"commission rate", getCommissionRate() );
	}
	
	// override superclass method earnings
	@Override
	public double earnings()
	{
		return getCommissionRate() * getGrossSales();
	}
}