package examples_10_repeat;

/*
 * Final version of the Employee class 
 * Uses inheritance and good software engineering practices
 */
public class CommissionEmployee
{
	//FIELDS
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commissionRate;
	
	//CONSTRUCTORS
	public CommissionEmployee(String first, String last, String ssn,
			double mySales, double myRate)
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setSales(mySales);
		setRate(myRate);
	}
	
	//SETTERS
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	public void setLastName(String last)
	{
		lastName = last;
	}
	
	public void setSSN(String mySSN)
	{
		socialSecurityNumber = mySSN;
	}
	
	public void setSales(double theSales)
	{
		if (theSales >= 0)
			grossSales = theSales;
		else
			throw new IllegalArgumentException
			("\ngrossSales must be >= 0.0");
	}
	
	public void setRate(double theRate)
	{
		if (theRate > 0 && theRate < 1.0)
			commissionRate = theRate;
		else 
			throw new IllegalArgumentException
			("\nRate must be between 0.0 and 1.0");
	}
	
	
	//GETTERS
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getSSN()
	{
		return socialSecurityNumber;
	}
	
	public double getSales()
	{
		return grossSales;
	}
	
	public double getRate()
	{
		return commissionRate;
	}
	
	//OTHER METHODS
	public double earnings()
	{
		return (getRate() * getSales());
	}
	
	@Override
	public String toString()
	{
		return String.format
			("%s\n%s: %s\n%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f",
			"Commission Employee data", 
			"First Name", getFirstName(), "Last Name", getLastName(),
			"Social Security Number: ", getSSN(),
			"Gross Sales", getSales(), 
			"Commission Rate", getRate());
	}
}