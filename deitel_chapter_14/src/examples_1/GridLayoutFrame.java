// Example 14.19a - GridLayoutFrame.java
// Demonstrating GridLayout
package examples_1;

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
	private GridLayout gridLayout2;		// second gridLayout
	
	// no-argument constructor
	public GridLayoutFrame()
	{
		super( "GridLayout Demo" );
		gridLayout1 = new GridLayout( 2, 3, 5 , 5);	// 2 by 3, gaps of 5px
		gridLayout2 = new GridLayout( 3, 2 );		// 3 by 2, no gaps
		container = getContentPane();				// get content pane
		setLayout( gridLayout1 );					// set JFrame layout
		buttons = new JButton[ names.length ];		// array of JButtons created
		
		for ( int count = 0; count < names.length; count++ )
		{
			buttons[ count ] = new JButton( names[ count ] );	// set reference
			buttons[ count ].addActionListener( this );		// register listener
			add( buttons[ count ] );		// add button to JFrame
		}	// end for loop to add action listeners to each button
	}	// end constructor
	
	
	// handle button events by toggling between layouts
	public void actionPerformed( ActionEvent event )
	{
		if ( toggle )
			container.setLayout( gridLayout2 );	// set layout to second
		else
			container.setLayout( gridLayout1 );	// set layout to first
		
		toggle = !toggle;		// invert toggle after changing layout
		container.validate();	// re-lay out container
	}	// end method actionPerformed
}	// end class GridLayoutFrae