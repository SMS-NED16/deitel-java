package examples_10_repeat;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	//FIELDS SPECIFIC TO BasePlusCommissionEmployee
	private double baseSalary;
	
	//CONSTRUCTOR FOR BasePlusCommissionEmployee
	public BasePlusCommissionEmployee(String first, String last, 
			String ssn, double mySales, double myRate, double myBaseSalary)
	{
		super(first, last, ssn, mySales, myRate);
		setBaseSalary(myBaseSalary);
	}
	
	//SETTER
	public void setBaseSalary(double mySalary)
	{
		if (mySalary >= 0)
			baseSalary = mySalary;
		else 
			throw new IllegalArgumentException
			("baseSalary must be >= 0");
	}
	
	//GETTER
	public double getSalary()
	{
		return baseSalary;
	}
	
	
	//OTHER METHODS
	@Override
	public double earnings()
	{
		return (getSalary() + getRate() * getSales());
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s\n%s: %.2f", 
				"Base-Salaried", super.toString(), 
				"Base Salary", getSalary());
	}
}