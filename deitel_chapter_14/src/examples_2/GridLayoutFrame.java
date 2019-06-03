// Example 14.15a - GridLayoutFrame
// Demonstrating GridLayout
package examples_2;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutFrame extends JFrame implements ActionListener
{
	private JButton[] buttons;			// array of buttons
	private static final String[] names =
		{ "one", "two", "three", "four", "five", "six" };
	private boolean toggle = true;		// toggle between two layouts
	private Container container;		// frame container
	private GridLayout gridLayout1;		// first gridLayout
	private GridLayout gridLayout2;		// second gridLayout;
	
	
	// no-argument constructor
	public GridLayoutFrame()
	{
		super( "GridLayoutDemo" );
		gridLayout1 = new GridLayout( 2, 3, 5, 5 );	// 2 by 3, gaps of 5
		gridLayout2 = new GridLayout( 3, 2 );		// 3 by 2, no gaps
		container = getContentPane();				// get content pane
		
		// Initially, we want buttons in 2 x 3 layout
		setLayout( gridLayout1 );					// set JFrame layout to 2x3
		buttons = new JButton[ names.length ];		// create array of JButtons
		
		// Add text to and register event handlers for each JButton - adds to JFrame too
		for ( int count = 0; count < names.length; count++ )
		{
			buttons[ count ] = new JButton( names[ count ] );
			buttons[ count ].addActionListener( this );	// register listener
			add( buttons[ count ] );				// add to JFrame
		}	// end for loop to label buttons/add event handlers
	}	// end class GridLayoutFrame
	
	// handle button events by toggling between layouts
	public void actionPerformed( ActionEvent event )
	{
		if ( toggle )
			container.setLayout( gridLayout2 );	// set layout to second
		else
			container.setLayout( gridLayout1 );	// set layout to first
		
		toggle = !toggle;		// set toggle to opposite value
		container.validate();	// refresh layout of container
	}	// end method actionPerformed
}	// end class GridLayoutFrame