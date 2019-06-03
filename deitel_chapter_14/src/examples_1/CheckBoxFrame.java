// Example 14.5a - CheckBoxFrame.java
// Creating JCheckBox Buttons
package examples_1;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
	// FIELDS
	private JTextField textField;		// displays text in changing fonts
	private JCheckBox boldJCheckBox;	// to toggle bold font
	private JCheckBox italicJCheckBox;	// to toggle italic font
	
	// CheckBoxFrame constructor adds JCheckBoxes to JFrame
	public CheckBoxFrame()
	{
		super( "Testing JCheckBox" );
		setLayout( new FlowLayout() );
		
		// set up JTextField and set its font
		textField = new JTextField( "Watch the font style change", 20 );
		textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
		
		// add textField to the JFrame
		add( textField );
		
		// set up checkboxes
		boldJCheckBox = new JCheckBox( "Bold ");	// create bold checkbox
		italicJCheckBox = new JCheckBox( "Italic" );// create italic checkbox
		
		// add checkboxes to the JFrame
		add( boldJCheckBox );			// add bold checkbox to frame
		add( italicJCheckBox );			// add italic checkbox to frame
		
		// Register event listeners to handle JCheckBox events
		CheckBoxHandler checkBoxHandler = new CheckBoxHandler();
		boldJCheckBox.addItemListener( checkBoxHandler );
		italicJCheckBox.addItemListener( checkBoxHandler );
		
	}	// end CheckBoxFrame constructor
	
	
	// private inner class for ItemListener event handling
	private class CheckBoxHandler implements ItemListener
	{
		// respond to checkbox events
		public void itemStateChanged( ItemEvent event )
		{
			Font font = null;		// stores the new Foont
			
			// determine which CheckBoxes are checked and create Font
			if ( boldJCheckBox.isSelected() && italicJCheckBox.isSelected() )
				font = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
			else if ( boldJCheckBox.isSelected() )
				font = new Font ( "Serif", Font.BOLD, 14 );
			else if ( italicJCheckBox.isSelected() )
				font = new Font( "Serif", Font.ITALIC, 14 );
			
			textField.setFont( font );
		}	// end method itemStateChanged	
	}	// end private inner class
}	// end class CheckBoxFrame

