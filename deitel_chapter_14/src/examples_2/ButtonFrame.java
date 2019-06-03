// Example 14.4a - ButtonFrame.java
// Creating JButtons
package examples_2;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{
	// FIELDS
	private JButton plainJButton;		// button with just text
	private JButton fancyJButton;		// button with icons
	
	// ButtonFrame constructor adds JButtons to JFrame
	public ButtonFrame()
	{
		// set title of JFrame using call to superclass constructor
		super( "Testing JButtons" );
		
		// set the layout for this JFrame's JComponents
		setLayout( new FlowLayout() );
		
		// Instantiate a button with text only
		plainJButton = new JButton( "Plain Button" );	
		add( plainJButton );			// add button to panel
		
		// Instantiate two Icons to be used in fancyJButton
		Icon bug1 = new ImageIcon( getClass().getResource( "bug1.gif" ) );
		Icon bug2 = new ImageIcon( getClass().getResource( "bug2.gif" ) );
		
		// Set default Icon and Text for fancyJButton
		fancyJButton = new JButton( "Fancy Button", bug1 );
		
		// when the mouse pointer rolls/hovers over fancyJButton, icon changes
		fancyJButton.setRolloverIcon( bug2 );	
		
		// add the fancyJButton to the panel
		add( fancyJButton );
		
		// create a new ButtonHandler for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener( handler );
		plainJButton.addActionListener( handler );
	}	// end no-argument JButton constructor
	
	// inner class for button event handling
	private class ButtonHandler implements ActionListener
	{
		// handle button event
		public void actionPerformed( ActionEvent event )
		{
			JOptionPane.showMessageDialog( ButtonFrame.this, 
					String.format( "You pressed: %s", 
							event.getActionCommand() ) );
		}	// end method actionPerformed
	}	// end private inner class ButtonHandler
}	// end class JFrame