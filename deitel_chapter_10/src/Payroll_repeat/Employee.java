// Example 10.2a - Employee.java
// Employee abstract superclass
package Payroll_repeat;

public abstract class Employee
{
	// FIELDS
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	// CONSTRUCTORS
	public Employee( String first, String last, String ssn )
	{
		setFirstName( first );
		setLastName( last );
		setSocialSecurityNumber( ssn );
	}	
	
	// GETTERS
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getSocialSecurityNumber() { return socialSecurityNumber; }
	
	// SETTERS
	public void setFirstName( String first )
	{
		firstName = first;
	}
	
	public void setLastName( String last )
	{
		lastName = last;
	}	
	
	public void setSocialSecurityNumber( String ssn )
	{
		socialSecurityNumber = ssn;
	}
	
	// return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format( "%s %s\nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber() );
	}
	
	// abstract method overridden by concrete subclasses
	public abstract double earnings();		// no implementations
}	// end abstract class Employee