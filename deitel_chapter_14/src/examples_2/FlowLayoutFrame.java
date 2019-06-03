// Example 14.13a - FlowLayoutFrame.java
// Demonstrating FlowLayout alignments
package examples_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
	private JButton	leftJButton;		// button to set alignment left
	private JButton rightJButton;		// button to set alignment right
	private JButton centerJButton;		// button to set alignment center
	private FlowLayout layout;			// layout object
	private Container container;		// container to set layout
	
	// set up GUI and register button listeners
	public FlowLayoutFrame()
	{
		super( "FlowLayoutDemo" );
		
		layout = new FlowLayout();		// create FlowLayout
		container = getContentPane();	// get container to layout
		setLayout( layout );			// set frame layout
		
		// set up leftJButton and register listener
		leftJButton = new JButton( "Left" );	// create Left button
		add( leftJButton );				// add leftJButton to frame
		leftJButton.addActionListener(
			new ActionListener()		// anonymous inner class
			{
				// process leftJButton event
				public void actionPerformed( ActionEvent event )
				{
					layout.setAlignment( FlowLayout.LEFT );
					
					// realign attached components
					layout.layoutContainer( container );
				}	// end method actionPerformed
			}	// end anonymous inner class ActionListener
		);	// end call to method addActionListener
		
		
		// set up centerJButton and register listener
		centerJButton = new JButton( "Center" );	// create center button
		add( centerJButton );		// add Center button to frame
		centerJButton.addActionListener(
			new ActionListener()		// anonymous inner class
			{
				// process centerJButton event
				public void actionPerformed( ActionEvent event )
				{
					layout.setAlignment( FlowLayout.CENTER );
					
					// realign attached components
					layout.layoutContainer( container );
				}	// end method actionPerformed
			}	// end inner anonymous class ActionListener
		);	// end call to method addActionListner
		
		// set up rightJButton and register listener
		rightJButton = new JButton( "Right" );		// create Right button
		add( rightJButton );						// add to JFrame
		rightJButton.addActionListener(
			new ActionListener()
			{
				// process rightJButton event
				public void actionPerformed( ActionEvent event )
				{
					layout.setAlignment( FlowLayout.RIGHT );
					
					// realign attached components
					layout.layoutContainer( container );
				}	// end method actionPerformed
			}	// end anonymous inner class ActionListener
		);	// end method call to JButton
	}	// end class FlowLayoutFrame
}	// end class FlowLayoutFrame