// Example 14.4a - JButtonFrame.java
// Creating JButtons
package examples_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class JButtonFrame extends JFrame
{
	// FIELDS
	private JButton plainJButton;		// button with just text
	private JButton fancyJButton;		// button with text and icons
	
	// JButtonFrame constructor adds JButtons to JFrame
	public JButtonFrame()
	{
		super( "Testing JButtons" );
		setLayout( new FlowLayout() );	
		
		// creating JButton with text only
		plainJButton = new JButton( "Plain Button" );
		add( plainJButton );			// add plainJButton to JFrame
		
		// creating JButton with text and icons
		// generating Icons using ImageIcon interface for loading
		Icon bug1 = new ImageIcon( getClass().getResource( "bug1.gif" ) );
		Icon bug2 = new ImageIcon( getClass().getResource( "bug2.gif" ) );
		
		// Create JButton with default text and icon
		fancyJButton = new JButton( "Fancy Button", bug1 );
		
		// Set the fancyJButton icon to change to bug2 when mouse over
		fancyJButton.setRolloverIcon( bug2 );
		
		// add the button to the panel
		add( fancyJButton );
		
		// create new JButtonHandler for button event handling
		JButtonHandler handler = new JButtonHandler();
		
		// register this ButtonHandler so it listens for events from both buttons
		plainJButton.addActionListener( handler );
		fancyJButton.addActionListener( handler );
	}	// end no-argument JButtonFrame constructor
	
	
	// private inner class for handling JButton events
	private class JButtonHandler implements ActionListener
	{
		// handle button event i.e. when button clicked
		public void actionPerformed( ActionEvent event )
		{
			JOptionPane.showMessageDialog( JButtonFrame.this,
			String.format( "You pressed: %s", event.getActionCommand() ) );
		}	// end method actionPerformed
	}	// end private inner class ButtonHandler
}	// end class JButtonFrame