// Example 14.14a - BorderLayoutFrame.java
// Demonstrating BorderLayout
package examples_2;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener
{
	private JButton[] buttons;		// array of buttons to hide portions
	private static final String[] names = 
		{ "Hide North", "Hide South", "Hide East", "Hide West", 
			"Hide Center" };
	private BorderLayout layout;	// borderLayout object
	
	// set up GUI and event handling
	public BorderLayoutFrame()
	{
		super( "BorderLayout Demo" );
		
		layout = new BorderLayout( 5, 5 );		// 5 pixel gaps
		setLayout( layout );					// set frame layout
		buttons = new JButton[ names.length ];	// array of JButton objects
		
		// create JButtons and register listeners for them
		for ( int count = 0; count < buttons.length; count++ )
		{
			buttons[ count ] = new JButton( names[ count ] );
			buttons[ count ].addActionListener( this );
		}	// end for loop to create and register listeners for JButtons
		
		// add the JButtons to the panel and position them
		add( buttons[ 0 ], BorderLayout.NORTH );
		add( buttons[ 1 ], BorderLayout.EAST );
		add( buttons[ 2 ], BorderLayout.SOUTH );
		add( buttons[ 3 ], BorderLayout.WEST );
		add( buttons[ 4 ], BorderLayout.CENTER );
	}	// end constructor
	
	
	// handle button events
	public void actionPerformed( ActionEvent event )
	{
		// check event source and lay out content pane accordingly
		for ( JButton button : buttons )
		{
			if ( event.getSource() == button )
				button.setVisible( false );	// hide button clicked
			else
				button.setVisible( true );	// show other buttons
		}	// end for loop to refresh buttons visibility
		
		layout.layoutContainer( getContentPane() );		// lay out content pane
	}	// end method actionPerformed to handle button events
}	// end class BorderLayoutFrame