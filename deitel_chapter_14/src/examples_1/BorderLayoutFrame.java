// Example 14.17a - BorderLayoutFrame.java
// Demonstrating BorderLayout
package examples_1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{
	private JButton[] buttons;		// array of buttons to hide portions
	private static final String[] names = { "Hide North", "Hide South", 
		"Hide East", "Hide West", "Hide Center" };
	private BorderLayout layout;	// border layout object
	
	// set up GUI and event handling
	public BorderLayoutFrame()
	{
		super( "BorderLayout Demo" );
		
		layout = new BorderLayout( 5, 5 );	// 5 pixel gaps 
		setLayout( layout );		// set frame layout
		buttons = new JButton[ names.length ];
		
		// create JButtons and register listeners for them
		for ( int count = 0; count < names.length; count++ )
		{
			buttons[ count ] = new JButton( names[ count ] );
			buttons[ count ].addActionListener( this );
			
		}
		// add buttons to north, south, east, west, and center regions
		add( buttons[ 0 ], BorderLayout.NORTH );			
		add( buttons[ 1 ], BorderLayout.SOUTH );
		add( buttons[ 2 ], BorderLayout.EAST );
		add( buttons[ 3 ], BorderLayout.WEST );
		add( buttons[ 4 ], BorderLayout.CENTER );
	}	// end constructor
	
	// handle button events
	public void actionPerformed( ActionEvent event )
	{
		// check event source and lay out content pane correspondingly
		for ( JButton button : buttons ) 
		{
			if ( event.getSource() == button )
				button.setVisible( false );		// hide button clicked
			else
				button.setVisible( true );		// show all other buttons
		}	// end enhanced for
		
		layout.layoutContainer( getContentPane() );	// lay out content pane
	}	// end method actionPerformed
}	// end class BorderLayoutFrame