// Example 16.20 - ValidateInput.java
// Validate user information using regular expressions
package deitel_16_rpt;

public class ValidateInput
{
	// validate first name
	public static boolean validateFirstName( String firstName )
	{
		// first char must be a capital letter
		// then expect zero or more lowercase/uppercase letters
		return firstName.matches( "[A-Z][a-zA-Z]*" );
	}	// end method validateFirstName
	
	// validate last name
	public static boolean validateLastName( String lastName )
	{
		// first match one or more lowercase/uppercase letters
		// then match zero or more expressions consisting of 
		// one space, apostrophe, hyphen and one or more 
		// letters (lowercase and uppercase)
		return lastName.matches( "[a-zA-Z]+([ '-][a-zA-Z]+)*" );
	}	// end method validateLastName
	
	// validate address
	public static boolean validateAddress( String address )
	{
		// one or more digits followed by one or more whitespace chars
		// followed by either one or more letters uppercase/lowercase
		// or two blocks of one or more letters separated by whitespace
		return address.matches(
				"\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
	}	// end method validateAddress
	
	// validate city
	public static boolean validateCity( String city )
	{
		// either one or more letters or 
		// two blocks of one or more letters separated by whitespace
		return city.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
	}	// end method validateCity
	
	// validate state
	public static boolean validateState( String state )
	{
		return state.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
	}	// end method validateState
	
	// validate zip
	public static boolean validateZip( String zip )
	{
		// match exactly 5 digits
		return zip.matches( "\\d{5}" );
	}	// end method validateZip
	
	// validate phone number
	public static boolean validatePhone( String phone )
	{
		// first digit must be 1 - 9, cannot be zero
		// followed by any 2 digits and a - symbol
		// repeat for the next block of three numbers
		// followed by any 4 numbers
		return phone.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
	}	// end method validatePhone
}	// end class ValidateInput	