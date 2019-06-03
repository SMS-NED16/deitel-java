// Example 10.3c - Employee.java
// Employee abstract superclass that implements payable
// Employee abstract superclass
package Payable_repeat;

public abstract class Employee implements Payable
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
	
	// We do not implement Payable method getPaymentAmount here so
	// this class must be declared abstract to avoid a compilation 
}	// end abstract class Employee