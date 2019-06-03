// Example 10.2d - PayableInterfaceTest.java
// Tests Payable Interface
package Payable;

public class PayableInterfaceTest
{
	public static void main( String[] args )
	{
		// create a four-element Payable array
		Payable[] payableObjects = new Payable[ 4 ];
		
		// populate array with objects that implement Payable
		payableObjects[ 0 ] = new Invoice( "01234", "seat", 2, 375.00 );
		payableObjects[ 1 ] = new Invoice( "56789", "tire", 4, 79.95 );
		payableObjects[ 2 ] = new SalariedEmployee(
				"John", "Smith", "111-11-1111", 800.0 );
		payableObjects[ 3 ] = new SalariedEmployee(
				"Lisa", "Barnes", "888-88-8888", 1200.00 );
		
		System.out.println( "Invoices and Employees processed polymorphically." );
		
		// generically process each element in array payableObjects
		for ( Payable currentPayable : payableObjects )
			System.out.printf( "%s \n%s: $%,.2f\n\n", 
					currentPayable.toString(), "payment due", 
					currentPayable.getPaymentAmount() );
			// end enhanced-for loop for polymorphically processsing Payable objects
	}	// end method main
}	// end class PayableInterfaceTest