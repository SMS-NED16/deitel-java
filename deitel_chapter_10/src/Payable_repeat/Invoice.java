// Example 10.3b - Invoice.java
// Invoice class that implements Payable
package Payable_repeat;

public class Invoice implements Payable
{
	// FIELDS
	private String 	partNumber;
	private String 	partDescription;
	private int		quantity;
	private double 	pricePerItem;
	
	// CONSTRUCTORS
	// four-argument constructor
	public Invoice( String part, String description, int count, 
			double price )
	{
		partNumber = part;
		partDescription = description;
		setQuantity( count );		// validate and store quantity
		setPricePerItem( price );	// validate and store price per item
	}	// end four-argument Invoice constructor
	
	// GETTERS
	public String getPartNumber() { return partNumber; }
	public String getPartDescription() { return partDescription; }
	public int getQuantity() { return quantity; }
	public double getPricePerItem() { return pricePerItem; }
	
	
	// SETTERS
	public void setQuantity( int count )
	{
		if ( count >= 0 )
			quantity = count;
		else
			throw new IllegalArgumentException( "Quantity must be >= 0" );
	}
	
	public void setPricePerItem( double price )
	{
		if ( price >= 0.0 )
			pricePerItem = price;
		else
			throw new IllegalArgumentException( "Price must be >= 0.0" );
	}
	
	// OTHER METHODS
	// return String representation of Invoice object
	@Override
	public String toString()
	{
		return String.format( "%s: \n%s: %s (%s) \n%s: %d\n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item", getPricePerItem() );
	}	// end method toString
	
	// method required to carry out contract with interface Payable
	@Override
	public double getPaymentAmount()
	{
		return getPricePerItem() * getQuantity();
	}	// end method getPaymentAmount
}	// end class Invoice