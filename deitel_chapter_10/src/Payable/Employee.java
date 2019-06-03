// Example 10.2c - Employee.java
// Modified version of Employee abstract class that implements Payable
package Payable;

public abstract class Employee implements Payable
{
	// FIELDS
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	// CONSTRUCTORS
	// three-argument constructor
	public Employee( String first, String last, String ssn )
	{
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}	// end three-argument Employee constructor
	
	// GETTERS
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getSocialSecurityNumber() { return socialSecurityNumber; }
	
	// SETTERS
	public void setFirstName( String first )
	{
		firstName = first;			// could validate
	}	// end method setFirstName;
	
	public void setLastName( String last )
	{	
		lastName = last;			// could validate
	}	// end method setLastName
	
	public void setSocialSecurityNumber( String ssn )
	{
		socialSecurityNumber = ssn;	// could validate
	}	// end method setSocialSecurityNumber
	
	// OTHER METHODS
	// return String representation of Employee object
	@Override
	public String toString()
	{
		return String.format( "%s %s\nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber() );
	}	// end method toString
	
	/* Note - we do not implement Payable method getPaymentAmount here so
	 * this class must be declared abstract to avoid a compilation error
	 */
}	// end abstract class Employee