// Employee.java
// Employee abstract superclass
package payroll;

public abstract class Employee
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
	
	// SETTERS
	// set the first name
	public void setFirstName( String first )
	{
		firstName = first;
	}	// end method setFirstName
	
	// set the last name
	public void setLastName( String last )
	{
		lastName = last;
	}	// end method setLastName
	
	// set the social security number
	public void setSocialSecurityNumber( String ssn )
	{
		socialSecurityNumber = ssn;
	}	// end method setSocialSecurityNumber
	
	// GETTERS
	public String getFirstName() { return firstName; }
	
	public String getLastName() { return lastName; }
	
	public String getSocialSecurityNumber() { return socialSecurityNumber; }
	
	// OTHER METHODS
	// return 
	@Override
	public String toString()
	{
		return String.format( "%s %s\nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber() );
	}	// end method toString
	
	// abstract method overridden by concrete subclasses
	public abstract double earnings();		// no implementation here
}	// end class Employee